package com.freedom.transaction4;

import com.freedom.transaction4.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by kshine on 2017/5/17.
 * 整合Junit
 * @RunWith(SpringJUnit4ClassRunner.class)
 * @ContextConfiguration(locations = "classpath:transaction4.xml")
 *  自动注入  @Autowired
 *  @Test
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:transaction4.xml")

public class testApp4 {

    @Autowired
     private AccountService accountService;

    @Test
     public void demo1(){
        accountService.transfer("tom","jack",100);
    }
}
