package com.freedom.f_aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by kuiyuxiang on 2017/4/25.
 */
public class TestAop {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        //从spring中获取的是增强代理类对象
        UserService userService = (UserService)ac.getBean("proxyServiceId");

        userService.addUser();
        userService.deleteUser();
        userService.updateUser();
    }
}
