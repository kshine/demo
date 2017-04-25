package com.freedom.g_springAop;

import com.freedom.g_springAop.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by kuiyuxiang on 2017/4/25.
 */
public class TestSpringAop {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("springaop.xml");
        //从spring中获取的是增强代理类对象
        com.freedom.g_springAop.UserService userService = (UserService)ac.getBean("userServiceId");

        userService.addUser();
        userService.deleteUser();
        userService.updateUser();
    }
}
