package com.prger.service.impl;

import com.prger.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public boolean login(String username, String password) {
        System.out.println("username = " + username + ", password = " + password);
        return false;
    }
}
