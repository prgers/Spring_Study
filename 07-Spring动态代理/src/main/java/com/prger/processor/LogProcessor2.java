package com.prger.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class LogProcessor2 implements BeanPostProcessor {

    @Override
    public Object postProcessAfterInitialization(Object target, String beanName) throws BeansException {

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(new LogInvocationHandler(target));
        return enhancer.create();
    }

    private static class LogInvocationHandler implements MethodInterceptor {

        private final Object target;

        public LogInvocationHandler(Object target) {
            this.target = target;
        }

        @Override
        public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {

            System.out.println("proxy -- 01");
            Object result = method.invoke(target, args);
            System.out.println("proxy -- 02");
            return result;
        }
    }


}
