package com.freedom.e_annotation.a_ioc;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by kuiyuxiang on 2017/4/21.
 */
public class TestAnnoIoc {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("annotation.xml");
        UserService userService = ac.getBean("userServiceId",UserService.class);
        userService.addUser();
    }
}
