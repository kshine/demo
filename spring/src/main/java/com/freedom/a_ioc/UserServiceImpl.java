package com.freedom.a_ioc;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by kuiyuxiang on 2017/4/12.
 */
public class UserServiceImpl implements UserService,InitializingBean,DisposableBean {
    public void addUser() {
        System.out.println("a_ioc add user");
    }

    public void myInit(){
        System.out.println("userServiceImpl 初始化");
    }

    public void myDestory(){
        System.out.println("userServiceImpl 销毁");
    }

    //spring的处理类
    @Override
    public void afterPropertiesSet() throws Exception {

    }

    @Override
    public void destroy() throws Exception {

    }
}
