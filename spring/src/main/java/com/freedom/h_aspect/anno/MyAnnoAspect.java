package com.freedom.h_aspect.anno;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by kuiyuxiang on 2017/4/28.
 * 注解切面类
 */
@Component
@Aspect
public class MyAnnoAspect {
    //配置公共切入点
    @Pointcut("execution(* com.freedom.h_aspect.anno.AnnoUserServiceImpl.*(..))")
    private void myPointCut(){

    }

    //前置通知
    //@Before("execution(* com.freedom.h_aspect.anno.AnnoUserServiceImpl.*(..))")
  //  @Before( value = "myPointCut()")
    public void myBefore(JoinPoint joinPoint){
        System.out.println("myAnnoAspect myBefore注解前置通知:"+joinPoint.getSignature().getName());
    }

    //后置返回
    //@AfterReturning( value = "myPointCut()",returning = "object")
    public void myAfterReturning(JoinPoint joinPoint,Object object){
        System.out.println("myAnnoAspect myAfterReturning 后置返回:"+joinPoint.getSignature().getName());
        System.out.println("返回值"+object);
    }

    //环绕通知
    @Around(value = "myPointCut()")
    public Object myAround(ProceedingJoinPoint joinPoint)throws Throwable{
        System.out.println("注解aop 环绕通知前");
        Object obj=joinPoint.proceed();
        System.out.println("注解aop 环绕通知后");
        return obj;
    }
}
