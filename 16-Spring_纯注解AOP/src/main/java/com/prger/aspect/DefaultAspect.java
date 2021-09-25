package com.prger.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
@EnableAspectJAutoProxy
public class DefaultAspect {

    @Around("within(com.prger.service..*)")
    public Object log(ProceedingJoinPoint point) throws Throwable {
        System.out.println("1--------------------");
        Object result = point.proceed();
        System.out.println("2--------------------");
        return result;
    }
}
