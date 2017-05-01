package com.freedom.e_annotation.b_web;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by kuiyuxiang on 2017/4/21.
 * 接口全部不用注解   注解 后面用(value="")  或者直接 ("")  指明id  不注明的 按类型识别自动注入
 * 实现类注解 1 dao  @Repository
 *           2 service @Service
 *           3 web层 @Controller
 *           @Qualifier("studentDaoId")  指定id注入
 *
 *           @Autowired 按类型
 *
 *           按名称
 *           @Autowired
 *           @Qualifire("名称")
 */
public class TestWeb {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("annotation.xml");
        StudentAction studentAction = ac.getBean("studentActionId",StudentAction.class);
        studentAction.execute();
    }
}
