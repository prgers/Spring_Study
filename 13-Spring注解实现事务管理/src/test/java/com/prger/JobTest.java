package com.prger;

import com.prger.dao.JobDao;
import com.prger.domain.Job;
import com.prger.service.JobService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by prgers on 2021/9/24 5:05 下午
 */
public class JobTest {

    private ApplicationContext ctx;
    private JobService jobService;

    @Before
    public void before() {
        ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        jobService = ctx.getBean("jobService", JobService.class);
    }

    @Test
    public void listTest() {
        List<Job> list = jobService.list();
        list.forEach(System.out::println);
    }

    @Test
    public void saveTest() {
        boolean save = jobService.save(new Job("医生", "越老越吃香"));
        Assert.assertTrue(save);
    }

    @Test
    public void updateTest() {
        Job job = new Job("试睡员", "躺着就把钱赚了");
        job.setId(16);
        boolean update = jobService.update(job);
        Assert.assertTrue(update);
    }

    @Test
    public void test() {
        jobService.test(new Job("陪玩", "陪老板打游戏，还能有钱赚"));
    }
}
