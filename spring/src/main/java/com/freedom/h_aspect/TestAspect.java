package com.freedom.h_aspect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by kuiyuxiang on 2017/4/25.
 */
public class TestAspect {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("aspect.xml");
        //从spring中获取的是增强代理类对象
        UserService userService = (UserService)ac.getBean("userServiceId");

        userService.addUser();
        userService.deleteUser();
        userService.updateUser();
    }
}
