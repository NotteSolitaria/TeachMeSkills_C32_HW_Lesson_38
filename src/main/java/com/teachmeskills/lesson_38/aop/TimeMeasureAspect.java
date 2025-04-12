package com.teachmeskills.lesson_38.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TimeMeasureAspect {

    @Around("@annotation(com.teachmeskills.lesson_38.aop.TimeMeasure)")
    public Object measureExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {

        long start = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        long duration = System.currentTimeMillis() - start;

        System.out.println("Method with any time " + joinPoint.getSignature()
                + " executed in " + duration + "ms");
        return result;
    }
}
