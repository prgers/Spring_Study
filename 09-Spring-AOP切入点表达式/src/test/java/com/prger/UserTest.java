package com.prger;

import com.prger.domain.Person;
import com.prger.service.UserService;
import com.prger.service.a.b.c.TestService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {

    @Test
    public void test() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = ctx.getBean("userService", UserService.class);
        userService.login("1111", "2222");
        userService.register("3333", "4444");

        Person person = ctx.getBean("person", Person.class);
        person.run();

        TestService testService = ctx.getBean("testService", TestService.class);
        testService.test();
    }
}
