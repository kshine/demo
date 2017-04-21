package com.freedom.c_bean;

import com.freedom.a_ioc.UserService;
import com.freedom.a_ioc.UserServiceImpl;

/**
 * Created by kuiyuxiang on 2017/4/21.
 * 静态工厂类
 */
public class MyBeanFactory {

    //静态方法
    public static UserService createService(){
        return new UserServiceImpl();
    }

    //非静态方法
    public UserService createService2(){
        return new UserServiceImpl();
    }
}
