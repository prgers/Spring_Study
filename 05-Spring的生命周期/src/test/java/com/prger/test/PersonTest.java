package com.prger.test;

import com.prger.domain.Person;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by prgers on 2021/9/23 5:12 下午
 */
public class PersonTest {

    @Test
    public void test(){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = ctx.getBean("person", Person.class);
        person.test();

        ctx.close();

    }
}
