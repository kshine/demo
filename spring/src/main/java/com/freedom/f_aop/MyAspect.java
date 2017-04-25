package com.freedom.f_aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by kuiyuxiang on 2017/4/25.
 *  切面类
 */
public class MyAspect implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("before");
        Object object = methodInvocation.proceed();
        System.out.println("after");
        return object;
    }
}
