package com.freedom.proxy.jdk;

/**
 * Created by kshine on 2017/4/24.
 * ：jdk动态代理的应用前提，必须是目标类基于统一的接口。
 */
public interface Service {
    public void add();
    public void update();
}
