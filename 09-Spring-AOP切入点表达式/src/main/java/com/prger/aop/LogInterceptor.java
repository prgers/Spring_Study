package com.prger.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LogInterceptor implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("aop -- 01");
        Object result = invocation.proceed();
        System.out.println("aop -- 02");
        return result;
    }
}
