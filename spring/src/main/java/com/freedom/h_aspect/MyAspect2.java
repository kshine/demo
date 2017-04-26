package com.freedom.h_aspect;

import org.aspectj.lang.JoinPoint;

/**
 * Created by kshine on 2017/4/26.
 * 切面类 多种类型通知
 */
public class MyAspect2 {
    public void myBefore(JoinPoint jointPoint){
        //通知方法可选参数  JointPoint   org.aspectj.lang.JoinPoint
        //获取接入点的方法名
        System.out.println("aspect 前置通知"+jointPoint.getSignature().getName());
    }
}
