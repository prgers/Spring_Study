package com.prger.service.impl;

import com.prger.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public boolean login(String username, String password) {
        System.out.println(" login - username = " + username + ", password = " + password);
        return false;
    }

    @Override
    public boolean register(String username, String password) {
        System.out.println("register - username" + username + ", password = " + password);
        return false;
    }
}
