package com.freedom.proxy.jdk;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by kshine on 2017/4/24.
 *
 * 实现动态代理类MyInvocationHandler，实现InvocationHandler接口，并且实现接口中的invoke方法。
 * 仔细看invoke方法，就是在该方法中加入切面逻辑的。
 * 目标类方法的执行是由method.invoke(target,args)这条语句完成。
 */
public class MyInvocationHandler implements InvocationHandler {
    private Object target;

    MyInvocationHandler(){
        super();
    }

    MyInvocationHandler(Object target){
        super();
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 程序执行前加入逻辑，MethodBeforeAdviceInterceptor
        System.out.println("before-----------------------------");
        // 程序执行
        Object result = method.invoke(target, args);
        // 程序执行后加入逻辑，MethodAfterAdviceInterceptor
        System.out.println("after------------------------------");
        return result;
    }
}
