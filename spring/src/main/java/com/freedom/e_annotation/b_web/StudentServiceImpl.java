package com.freedom.e_annotation.b_web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by kuiyuxiang on 2017/4/21.
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao){
        studentDao = this.studentDao;
    }

    @Override
    public void addStudent() {
        studentDao.save();
    }
}
