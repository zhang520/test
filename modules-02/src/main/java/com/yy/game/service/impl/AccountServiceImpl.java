package com.yy.game.service.impl;

import com.yy.game.service.AccountService;

public class AccountServiceImpl implements AccountService {

    public void insert() {
        System.out.println("insert a user.");
    }

    public void get(int id) {
        if (id > 0) {
            System.out.println(id);
        } else {
            System.out.println(~id);
        }
    }

    public void list(String name) {
        throw new RuntimeException("runtime error.");
    }
}
