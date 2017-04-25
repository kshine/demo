package com.freedom.g_springAop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by kuiyuxiang on 2017/4/25.
 *  切面类
 */
public class MyAspect implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("springaop before");
        Object object = methodInvocation.proceed();
        System.out.println("springaop after");
        return object;
    }
}
