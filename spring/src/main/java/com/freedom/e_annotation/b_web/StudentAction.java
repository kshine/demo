package com.freedom.e_annotation.b_web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by kuiyuxiang on 2017/4/21.
 */
@Controller("studentActionId")
public class StudentAction {

    @Autowired
    public StudentService studentService;

    public void execute(){
        studentService.addStudent();
    }

}
