package xin.scoutzhang.service;

import xin.scoutzhang.domain.User;

/**
 * Created by DEAN on 2018/4/10.
 */
public interface IUserService {
    //未查询到任何匹配数据，返回null，否则返回User类的实例
    public User getUserByUserId(String userId);

    public boolean setUser(User user);
}
