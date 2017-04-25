package com.freedom.proxy.cglib;

/**
 * Created by kuiyuxiang on 2017/4/25.
 */
public class Test {
    public static void main(String[] args) {
        CglibProxy proxy = new CglibProxy();
        // base为生成的增强过的目标类
        Base base = Factory.getInstance(proxy);
        base.add();
    }
}
