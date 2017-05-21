package com.freedom.transaction3;

import com.freedom.transaction3.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by kshine on 2017/5/17.
 */
public class testApp3 {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("transaction3.xml");
        AccountService accountService=(AccountService) ac.getBean("proxyAccountService");
        accountService.transfer("tom","jack",100);
    }
}
