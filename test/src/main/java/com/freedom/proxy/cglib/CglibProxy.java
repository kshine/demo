package com.freedom.proxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by kuiyuxiang on 2017/4/25.
 *
 * 此为代理类，用于在pointcut处添加advise
 */
public class CglibProxy implements MethodInterceptor {
    /**
     * obj：动态生成的代理对象
     * method ： 实际调用的方法
     * args：调用方法入参
     * proxy：net.sf.cglib.proxy.MethodProxy：java Method类的代理类，可以实现委托类对象的方法的调用；
     * 常用方法：methodProxy.invokeSuper(proxy, args)；在拦截方法内可以调用多次
    */
     @Override
    public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        // 添加切面逻辑（advise），此处是在目标类代码执行之前，即为MethodBeforeAdviceInterceptor。
        System.out.println("before-------------");
        // 执行目标类add方法
        methodProxy.invokeSuper(object, args);
        // 添加切面逻辑（advise），此处是在目标类代码执行之后，即为MethodAfterAdviceInterceptor。
        System.out.println("after--------------");
        return object;
    }
}
