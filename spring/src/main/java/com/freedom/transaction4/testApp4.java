package com.freedom.transaction4;

import com.freedom.transaction4.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by kshine on 2017/5/17.
 */
public class testApp4 {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("transaction4.xml");
        AccountService accountService=(AccountService) ac.getBean("accountService");
        accountService.transfer("tom","jack",100);
    }
}
