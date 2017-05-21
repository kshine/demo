package com.freedom.transaction3.service;

/**
 * Created by kshine on 2017/5/17.
 */
public interface AccountService {
    /**
     * 转账
     */
    public void transfer(String outer, String inner, Integer money);
}
