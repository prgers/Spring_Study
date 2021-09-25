package com.prger.test;

import com.prger.domain.Person;
import com.prger.service.PersonService;
import com.prger.service.impl.PersonServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {

    private ApplicationContext ctx;

    @Before
    public void before() {
//        ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//        ctx = new AnnotationConfigApplicationContext("com.prger");
        ctx = new AnnotationConfigApplicationContext(Person.class);
    }

    @Test
    public void test() {
        System.out.println(ctx.getBean("person", Person.class));
        System.out.println(ctx.getBean("com.prger.domain.Dog"));
    }
}
