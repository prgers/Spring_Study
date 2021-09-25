package com.prger;

import com.prger.service.TestService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AopTest {

    private ApplicationContext ctx;

    @Before
    public void before() {
        ctx = new AnnotationConfigApplicationContext("com.prger");
    }

    @Test
    public void test() {
        TestService testService = ctx.getBean("testService", TestService.class);
        testService.test();
    }

}
