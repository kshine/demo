package com.freedom.h_aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by kshine on 2017/4/26.
 * 切面类 多种类型通知
 */
public class MyAspect2 {
    public void myBefore(JoinPoint joinPoint){
        //通知方法可选参数  JointPoint   org.aspectj.lang.JoinPoint
        //获取接入点的方法名
        System.out.println("aspect 前置通知"+joinPoint.getSignature().getName());
    }

    //第二个参数  类型Object 参数名 由returning配置  能够获取返回值
    public void myAfterReturning(JoinPoint joinPoint,Object object){
        System.out.println("aspect 后置通知"+joinPoint.getSignature().getName());
        System.out.println("aspect 后置通知 返回值为"+ object);
    }

    //环绕通知
    public Object myAround(ProceedingJoinPoint joinPoint)throws Throwable{
        System.out.println("around 前");
        //手动执行目标方法
        Object obj = joinPoint.proceed();

        System.out.println("around 后");
        return obj;
    }

    public void myAfterThrowing(JoinPoint joinPoint,Throwable e){
        System.out.println("aspect afterthrow"+e.getMessage());
    }

    public void myAfter(JoinPoint joinPoint){
        System.out.println("最终通知");
    }

}
