package com.freedom.transaction.service.impl;

import com.freedom.transaction.dao.AccountDao;
import com.freedom.transaction.service.AccountService;

/**
 * Created by kshine on 2017/5/17.
 */
public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void transfer(String outer, String inner, Integer money) {
        accountDao.out(outer,money);
        accountDao.in(inner,money);
    }
}
