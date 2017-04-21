package com.freedom.a_ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by kuiyuxiang on 2017/4/12.
 */
public class TestIoc {

    public static void main(String[] args) throws Exception {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) ac.getBean("userServiceId");
        System.out.println(userService);
        userService.addUser();

        //销毁如何实现？？
        ac.getClass().getMethod("close").invoke(ac);

    }

}
