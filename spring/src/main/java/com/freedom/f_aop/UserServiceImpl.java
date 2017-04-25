package com.freedom.f_aop;

/**
 * Created by kuiyuxiang on 2017/4/25.
 */
public class UserServiceImpl implements UserService {
    @Override
    public void addUser() {
        System.out.println("f_aop addUser");
    }

    @Override
    public void updateUser() {
        System.out.println("f_aop updateUser");
    }

    @Override
    public void deleteUser() {
        System.out.println("f_aop deleteUser");
    }
}
