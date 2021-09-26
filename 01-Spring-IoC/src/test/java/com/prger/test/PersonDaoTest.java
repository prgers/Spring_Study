package com.prger.test;

import com.prger.service.PersonService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by prgers on 2021/9/22 9:04 上午
 */
public class PersonDaoTest {


    @Test
    public void test() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        PersonService service = ctx.getBean("personService", PersonService.class);
        service.deleteById(1);
    }
}
