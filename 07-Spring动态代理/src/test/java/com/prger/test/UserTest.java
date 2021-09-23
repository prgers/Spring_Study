package com.prger.test;

import com.prger.service.SkillService;
import com.prger.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by prgers on 2021/9/23 5:12 下午
 */
public class UserTest {

    @Test
    public void test() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService target = ctx.getBean("userService", UserService.class);
        UserService userService = (UserService) Proxy.newProxyInstance(
                getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                (Object proxy, Method method, Object[] args) -> {
                    System.out.println("proxy -- 01");
                    Object result = method.invoke(target, args);
                    System.out.println("proxy -- 02");
                    return result;
                });
        userService.login("123", "456");
    }

    @Test
    public void test2() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService service = ctx.getBean("userService", UserService.class);
        service.login("1111", "222");
    }

    @Test
    public void test3() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        SkillService service = ctx.getBean("skillService", SkillService.class);
        service.save();
    }
}
