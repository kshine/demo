package com.freedom.g_springAop;

/**
 * Created by kuiyuxiang on 2017/4/25.
 */
public class UserServiceImpl implements UserService {
    @Override
    public void addUser() {
        System.out.println("springAop addUser");
    }

    @Override
    public void updateUser() {
        System.out.println("springAop updateUser");
    }

    @Override
    public void deleteUser() {
        System.out.println("springAop deleteUser");
    }
}
