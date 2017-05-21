package com.freedom.transaction4.dao;

/**
 * Created by kshine on 2017/5/17.
 */
public interface AccountDao {
    /**
     * 汇款
     */
    public void out(String outer, int money);

    /**
     * 收款
     */
    public void in(String inner, int money);
}
