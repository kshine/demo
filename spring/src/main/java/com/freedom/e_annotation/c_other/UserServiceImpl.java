package com.freedom.e_annotation.c_other;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by kuiyuxiang on 2017/4/21.
 */
@Service("userServiceId2")
@Scope("prototype") //默认单例
public class UserServiceImpl implements UserService {
    @Override
    public void addUser() {
        System.out.println("e_annotation add user");
    }
}
