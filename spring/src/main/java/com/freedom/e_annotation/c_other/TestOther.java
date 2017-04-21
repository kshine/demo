package com.freedom.e_annotation.c_other;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by kuiyuxiang on 2017/4/21.
 */
public class TestOther {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("annotation.xml");
        UserService userService1 = ac.getBean("userServiceId2",UserServiceImpl.class);
        UserService userService2 = ac.getBean("userServiceId2",UserServiceImpl.class);

        System.out.println(userService1);
        System.out.println(userService2);
    }
}
