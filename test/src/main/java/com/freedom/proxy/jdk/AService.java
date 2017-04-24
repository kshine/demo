package com.freedom.proxy.jdk;

/**
 * Created by kshine on 2017/4/24.
 *
 * 被代理类，即目标类target
 */
public class AService implements Service {
    @Override
    public void add() {
        System.out.println("AService add>>>>>>>>>>>>>>>>>>");
    }

    @Override
    public void update() {
        System.out.println("AService update>>>>>>>>>>>>>>>");
    }
}
