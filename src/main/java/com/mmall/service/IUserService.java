package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.User;

/**
 * Created with IntelliJ IDEA.
 * User: wdevid
 * Date: 2018/1/3
 * Time: 15:42
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public interface IUserService {
    ServerResponse<User> login(String username, String password);
}
