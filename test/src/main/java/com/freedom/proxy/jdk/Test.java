package com.freedom.proxy.jdk;

import java.lang.reflect.Proxy;

/**
 * Created by kshine on 2017/4/24.
 */
public class Test {
    public static void main(String[] args) {
        Service aService = new AService();
        // Proxy为InvocationHandler实现类动态创建一个符合某一接口的代理实例
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(aService);

        Service aServiceProxy = (Service) Proxy.newProxyInstance(
                aService.getClass().getClassLoader(),
                aService.getClass().getInterfaces(),
                myInvocationHandler);

        aServiceProxy.add();
        System.out.println();
        aServiceProxy.update();
    }
}
