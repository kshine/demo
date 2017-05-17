package com.freedom.transaction;

import com.freedom.transaction.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by kshine on 2017/5/17.
 */
public class testApp {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("transaction.xml");
        AccountService accountService=(AccountService) ac.getBean("accountService");
        accountService.transfer("tom","jack",100);
    }
}
