package com.freedom.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by kshine on 2017/5/1.
 */
public class TestJdbcTemplate {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("jdbcTemplate.xml");
        UserDao userDao = (UserDao)ac.getBean("userDaoId");

        User user = new User();
        user.setId(1);
        user.setUsername("王二锤");
        user.setPassword("1qaz2wsx");

        userDao.updateUser(user);

        User newUser=userDao.findUser(1);
        System.out.println(newUser);
    }
}
