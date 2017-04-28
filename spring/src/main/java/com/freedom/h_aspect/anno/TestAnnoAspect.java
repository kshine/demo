package com.freedom.h_aspect.anno;

import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by kuiyuxiang on 2017/4/28.
 */
public class TestAnnoAspect {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("annoAspect.xml");
        AnnoUserService annoUserService = (AnnoUserService)ac.getBean("annoUserServiceId");
        annoUserService.addUser();
        annoUserService.updateUser();
        annoUserService.deleteUser();
    }
}
