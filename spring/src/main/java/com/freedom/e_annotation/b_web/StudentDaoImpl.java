package com.freedom.e_annotation.b_web;

import org.springframework.stereotype.Repository;

/**
 * Created by kuiyuxiang on 2017/4/21.
 */
@Repository(value = "studentDaoId")
public class StudentDaoImpl implements StudentDao{
    @Override
    public void save() {
        System.out.println("studentDao");
    }
}
