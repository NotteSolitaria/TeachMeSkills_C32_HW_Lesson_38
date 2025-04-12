package com.teachmeskills.lesson_38.service;

import com.teachmeskills.lesson_38.aop.TimeMeasure;
import org.springframework.stereotype.Component;

@Component
public class Service {

    @TimeMeasure
    public void longMethod() {
        try{
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @TimeMeasure
    public void shortMethod() {
        try{
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
