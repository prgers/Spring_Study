package com.prger.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by prgers on 2021/9/23 5:33 下午
 */
public class MyProcessor implements BeanPostProcessor {

    //初始方法调用之前调用
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("05 -- BeanPostProcessor - before");
        return bean;
    }

    //初始方法调用之后调用
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("08 -- BeanPostProcessor - after");
        return bean;
    }
}
