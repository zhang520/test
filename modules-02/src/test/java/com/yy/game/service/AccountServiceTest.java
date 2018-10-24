package com.yy.game.service;

import com.yy.game.service.impl.AccountServiceImpl;
import org.junit.Before;
import org.junit.Test;

public class AccountServiceTest {

    AccountService accountService;

    @Before
    public void before() {
        accountService = new AccountServiceImpl();
    }

    @Test
    public void testInsert() {
        accountService.insert();
    }

    @Test
    public void testGet() {
        accountService.get(1);
        accountService.get(-1);
    }

    @Test
    public void testList() {
        accountService.list("zhangweiqiang");
    }

}
