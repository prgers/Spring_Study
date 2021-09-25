package com.prger.Test;

import com.prger.dao.PersonDao;
import com.prger.domain.Person;
import com.prger.service.PersonService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {

    private ApplicationContext ctx;

    @Before
    public void before() {
        ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void test() {
        System.out.println(ctx.getBean("person", Person.class));
        System.out.println(ctx.getBean("personDao", PersonDao.class));
        System.out.println(ctx.getBean("personService", PersonService.class));
    }
}
