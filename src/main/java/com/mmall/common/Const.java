package com.mmall.common;

/**
 * Created with IntelliJ IDEA.
 * User: wdevid
 * Date: 2018/1/3
 * Time: 16:42
 * To change this template use File | Settings | File Templates.
 * Description:
 */

public class Const {
    public static final String CURRENT_USER = "currentUser";
    public static final String EMAIL = "emali";
    public static final String USERNAME = "username";

    public interface Role {
        int ROLE_CUSTOMER = 0;//普通用户
        int ROLE_ADMIN = 1;//管理员
    }


}
