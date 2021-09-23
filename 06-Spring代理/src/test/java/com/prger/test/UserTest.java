package com.prger.test;

import com.prger.proxy.UserServiceProxy;
import com.prger.service.SkillService;
import com.prger.service.UserService;
import com.prger.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by prgers on 2021/9/23 5:12 下午
 */
public class UserTest {

    @Test
    public void test() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = ctx.getBean("userService", UserService.class);
        userService.login("124", "456");
    }

    @Test
    public void test2() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        SkillService service = ctx.getBean("skillService", SkillService.class);
        service.save();
    }
}
