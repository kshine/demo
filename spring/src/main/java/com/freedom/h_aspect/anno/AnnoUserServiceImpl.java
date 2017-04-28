package com.freedom.h_aspect.anno;

import org.springframework.stereotype.Service;

/**
 * Created by kuiyuxiang on 2017/4/28.
 */
@Service("annoUserServiceId")
public class AnnoUserServiceImpl implements AnnoUserService{

    @Override
    public void addUser() {
        System.out.println("注解 addUser");
    }

    @Override
    public String updateUser() {
        System.out.println("注解 updateUser");
      //  int i = 1/0;
        return "anno aspect 注解返回";
    }

    @Override
    public void deleteUser() {
        System.out.println("注解 deleteUser");
    }
}
