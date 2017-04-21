package com.freedom.e_annotation.a_ioc;

import org.springframework.stereotype.Component;

/**
 * Created by kuiyuxiang on 2017/4/21.
 * 注解方式开发
 * @Component("id")
 */
@Component(value="userServiceId")
public class UserServiceImpl implements UserService {
    @Override
    public void addUser() {
        System.out.println("e_annotation add user");
    }
}
