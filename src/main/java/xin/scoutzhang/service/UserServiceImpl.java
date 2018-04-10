package xin.scoutzhang.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xin.scoutzhang.dao.IUserDao;
import xin.scoutzhang.domain.User;
import xin.scoutzhang.util.UUIDUtil;

/**
 * Created by DEAN on 2018/4/10.
 */
@Service
public class UserServiceImpl implements IUserService{
    Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private IUserDao userDao;

    @Override
    public User getUserByUserId(String userId) {
        if(userId==null||"".equals(userId)){
            logger.warn("Invalid input of userId: "+userId);
            return null;
        }else{
            logger.debug("[getUserByUserId] userId: "+userId);
            User user = userDao.selectUserByUserId(userId);
            return user;
        }
    }

    @Override
    public boolean setUser(User user) {
        if(user==null){
            logger.warn("Invalid input of user == null");
            return false;
        }else if(user.getUsername()==null||user.getPassword()==null||user.getPhone()==null||
                user.getUserType()==null){
            logger.warn("Incomplete user object");
            return false;
        }else if(!user.getUserType().equals("person")&&!user.getUserType().equals("company")){
            logger.error("wrong parameter of User.userType, must be: person OR company");
            return false;
        }else if(user.getIcon()==null||user.getVerifyStatus()!=-1){
            logger.error("wrong parameter of User.getIcon OR User.verifyStatus, these params should be inserted automatically");
            return false;
        }else{
            logger.debug("[setUser] user: "+user);
            String userId = UUIDUtil.get20UUID();
            user.setUserId(userId);
            int res = userDao.insertUser(user);
            if(res==1){
                logger.debug("[setUser] insert success");
                return true;
            }else{
                logger.warn("[setUser] insert fail");
                return false;
            }
        }
    }
}
