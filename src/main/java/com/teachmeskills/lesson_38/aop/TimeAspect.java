package com.teachmeskills.lesson_38.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TimeAspect {

    @Around("@annotation(TimeMeasure)")
    public Object ExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {

        long startTime = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        long executionTime = System.currentTimeMillis() - startTime;

        if (executionTime > 1000) {
            System.out.println("A method that fits the aspect condition " + joinPoint.getSignature()
                    + " executed in " + executionTime + "ms");
        }

        return result;
    }
}
