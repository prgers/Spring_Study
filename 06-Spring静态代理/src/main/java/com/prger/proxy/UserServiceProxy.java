package com.prger.proxy;

import com.prger.service.UserService;

/**
 * Created by prgers on 2021/9/23 6:12 下午
 */
public class UserServiceProxy implements UserService {

    private UserService target;

    public void setTarget(UserService target) {
        this.target = target;
    }

    @Override
    public boolean login(String username, String password) {
        System.out.println("01----------------");
        boolean login = target.login(username, password);
        System.out.println("02----------------");
        return login;
    }
}
