package com.prger.service.impl;

import com.prger.dao.PersonDao;
import com.prger.service.PersonService;

/**
 * Created by prgers on 2021/9/22 8:52 上午
 */
public class PersonServiceImpl implements PersonService {

    private PersonDao dao;

    public void setDao(PersonDao dao) {
        this.dao = dao;
    }

    @Override
    public boolean deleteById(Integer id) {

        return dao.deleteById(id);
    }
}
