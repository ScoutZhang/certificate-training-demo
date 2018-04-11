package xin.scoutzhang.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
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
    public User getUserByUsername(String username){
        if(username==null||"".equals(username)){
            logger.warn("Invalid input of username: "+username);
            return null;
        }else{
            logger.debug("[getUserByUsername] username: "+username);
            User user = userDao.selectUserByUsername(username);
            return user;
        }
    }

    @Override
    @Transactional
    public int setUser(User user) {
        if(user==null){
            logger.warn("Invalid input of user == null");
            return -2;
        }else if(user.getUsername()==null||user.getPassword()==null||user.getPhone()==null||
                user.getUserType()==null){
            logger.warn("Incomplete user object");
            return -2;
        }else if(!user.getUserType().equals("person")&&!user.getUserType().equals("company")){
            logger.error("wrong parameter of User.userType, must be: person OR company");
            return -2;
        }else if(user.getIcon()==null||user.getVerifyStatus()!=-1){
            logger.error("wrong parameter of User.getIcon OR User.verifyStatus, these params should be inserted automatically");
            return -2;
        }else{
            logger.debug("[setUser] user: "+user);
            User existUser = getUserByUsername(user.getUsername());
            if(existUser!=null){
                //已存在相同用户名用户
                logger.warn("[setUser] insert fail, username has already sign up, please choose another username ");
                return -1;
            }
            String userId = UUIDUtil.get20UUID();
            user.setUserId(userId);
            int res = userDao.insertUser(user);
            if(res==1){
                logger.debug("[setUser] insert success");
                //throw new RuntimeException("test transaction");
                return 1;
            }else{
                logger.warn("[setUser] insert fail");
                return 0;
            }
        }
    }
}
