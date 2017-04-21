package com.freedom.d_xml.a_constructor;

import com.freedom.d_xml.b_setter.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by kuiyuxiang on 2017/4/21.
 */
public class TestConstructor {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = ac.getBean("userid",User.class);
        System.out.println(user);

        User user2 = ac.getBean("userid2",User.class);
        System.out.println(user2);

        Person person = ac.getBean("personId",Person.class);
        System.out.println(person);
    }
}
