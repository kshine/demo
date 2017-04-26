package com.freedom.h_aspect;

/**
 * Created by kshine on 2017/4/26.
 * 目标实现类 target
 */
public class UserServiceImpl  implements  UserService{
    @Override
    public void addUser() {
        System.out.println("aspect addUser");
    }

    @Override
    public void updateUser() {
        System.out.println("aspect updateUser");
    }

    @Override
    public void deleteUser() {
        System.out.println("aspect deleteUser");
    }
}
