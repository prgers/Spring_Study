package com.prger.service.impl;

import com.prger.service.UserService;

/**
 * Created by prgers on 2021/9/23 6:00 下午
 */
public class UserServiceImpl implements UserService {
    @Override
    public boolean login(String username, String password) {
        System.out.println("username = " + username + ", password = " + password);
        return false;
    }
}
