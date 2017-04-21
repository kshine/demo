package com.freedom.c_bean;

import com.freedom.a_ioc.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by kuiyuxiang on 2017/4/21.
 */
public class TestFactory {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //静态工厂
        UserService userService = (UserService) ac.getBean("userServiceFactoryId");
        userService.addUser();

        //实例工厂
        UserService userService1 = (UserService)ac.getBean("userServiceFactoryId2");
        userService1.addUser();

    }
}
