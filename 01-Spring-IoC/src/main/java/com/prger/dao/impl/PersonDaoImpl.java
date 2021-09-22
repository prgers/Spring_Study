package com.prger.dao.impl;

import com.prger.dao.PersonDao;

/**
 * Created by prgers on 2021/9/22 8:49 上午
 */
public class PersonDaoImpl implements PersonDao {
    @Override
    public boolean deleteById(Integer id) {
        System.out.println("delete id = " + id);
        return false;
    }
}
