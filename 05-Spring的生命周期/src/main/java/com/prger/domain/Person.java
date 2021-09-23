package com.prger.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by prgers on 2021/9/23 5:06 下午
 */
public class Person implements BeanNameAware, ApplicationContextAware, InitializingBean, DisposableBean {

    private String name;

    //构造方法
    public Person() {
        System.out.println("01 -- Constructor");
    }

    //属性输入
    public void setName(String name) {
        System.out.println("02 -- setter");
        this.name = name;
    }

    //bean的名字
    @Override
    public void setBeanName(String s) {
        System.out.println("03 -- setBeanName");
    }

    //容器名字
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("04 -- setApplicationContext");
    }

    //构造注入完成之后调用(初始化,加载资源)
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("06 -- afterPropertiesSet");
    }

    //构造注入完成之后调用(初始化,加载资源)
    public void init() {
        System.out.println("07 -- init-Method");
    }

    //处理业务
    public void test() {
        System.out.println("09 -- 业务方法");
    }

    //销毁之前调用(释放资源)
    public void dealloc() {
        System.out.println("11 -- destroy-method");
    }

    //销毁之前调用(释放资源)
    @Override
    public void destroy() throws Exception {
        System.out.println("10 -- destroy");
    }

    public String getName() {
        return name;
    }
}
