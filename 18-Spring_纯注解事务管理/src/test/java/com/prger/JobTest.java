package com.prger;

import com.prger.domain.Job;
import com.prger.service.JobService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class JobTest {

    private ApplicationContext ctx;
    private JobService jobService;

    @Before
    public void before() {
        ctx = new AnnotationConfigApplicationContext("com.prger");
        jobService = ctx.getBean("jobService", JobService.class);
    }


    @Test
    public void listTest() {
        List<Job> list = jobService.list();
        list.forEach(System.out::println);
    }

    @Test
    public void test() {
        Job job = ctx.getBean("job", Job.class);
        System.out.println(job);
    }

    @Test
    public void saveTest() {
        boolean save = jobService.save(new Job("1111", "2222"));
        Assert.assertTrue(save);
    }
}
