package com.prger.service.impl;

import com.prger.service.TestService;
import org.springframework.stereotype.Service;

@Service("testService")
public class TestServiceImpl implements TestService {
    @Override
    public void test() {
        System.out.println("TestService -- test()");
    }
}
