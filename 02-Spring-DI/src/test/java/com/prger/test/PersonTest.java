package com.prger.test;

import com.prger.domain.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by prgers on 2021/9/22 9:04 上午
 */
public class PersonTest {

    @Test
    public void test() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = ctx.getBean("person2", Person.class);
        System.out.println(person);
    }
}
