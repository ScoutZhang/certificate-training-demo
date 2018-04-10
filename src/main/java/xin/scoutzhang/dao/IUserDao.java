package xin.scoutzhang.dao;

import xin.scoutzhang.domain.User;

/**
 * Created by DEAN on 2018/4/10.
 */
public interface IUserDao {
    public User selectUserByUserId(String userId);

    public User selectUserByUsername(String username);

    //成功返回1，失败返回0
    public int insertUser(User user);

    //通过userId来更新
    //成功返回1，失败返回0
    public int updateUser(User user);
}
