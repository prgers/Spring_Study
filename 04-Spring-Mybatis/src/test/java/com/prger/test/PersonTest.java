package com.prger.test;

import com.prger.dao.JobDao;
import com.prger.domain.Job;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class PersonTest {

    private ApplicationContext ctx;
    private JobDao jobDao;

    @Before
    public void before() {
        ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        jobDao = ctx.getBean("jobDao", JobDao.class);
    }

    @Test
    public void list() {
        List<Job> jobs = jobDao.list();
        jobs.forEach(System.out::println);
    }
}
