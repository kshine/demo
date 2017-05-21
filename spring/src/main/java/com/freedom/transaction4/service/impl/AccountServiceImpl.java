package com.freedom.transaction4.service.impl;

import com.freedom.transaction4.dao.AccountDao;
import com.freedom.transaction4.service.AccountService;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

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
                       // int i = 1/0;
                        accountDao.in(inner,money);
    }
}
