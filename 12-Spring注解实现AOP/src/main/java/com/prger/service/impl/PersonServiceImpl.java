package com.prger.service.impl;

import com.prger.service.PersonService;
import org.springframework.stereotype.Service;

@Service("personService")
public class PersonServiceImpl implements PersonService {
    @Override
    public void test() {
        System.out.println("PersonService -- test()");
    }
}
