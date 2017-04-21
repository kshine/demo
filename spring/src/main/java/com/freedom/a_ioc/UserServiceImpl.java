package com.freedom.a_ioc;

/**
 * Created by kuiyuxiang on 2017/4/12.
 */
public class UserServiceImpl implements UserService {
    public void addUser() {
        System.out.println("a_ioc add user");
    }

    public void myInit(){
        System.out.println("userServiceImpl 初始化");
    }

    public void myDestory(){
        System.out.println("userServiceImpl 销毁");
    }
}
