package com.freedom.transaction4.dao.impl;

import com.freedom.transaction4.dao.AccountDao;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * Created by kshine on 2017/5/17.
 */
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {
    @Override
    public void out(String outer, int money) {
        this.getJdbcTemplate().update("update account set money = money - ? where name= ?",money,outer);
    }

    @Override
    public void in(String inner, int money) {
        this.getJdbcTemplate().update("update account set money = money + ? where name= ?",money,inner);
    }
}
