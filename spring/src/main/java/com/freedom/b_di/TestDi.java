package com.freedom.b_di;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by kuiyuxiang on 2017/4/12.
 */
public class TestDi {
    @Test
    public void testDi(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService =(BookService)ac.getBean("bookServiceId");
        bookService.addBook();
    }
}
