package com.prger.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DefaultAspect {

    //    @Around("within(com.prger.service.impl.PersonServiceImpl)")
    @Pointcut("within(com.prger.service..*)")
    public void pc(){}
    @Around("pc()")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("1-------------------------");
        Object result = joinPoint.proceed();
        System.out.println("2-------------------------");
        return result;
    }
}
