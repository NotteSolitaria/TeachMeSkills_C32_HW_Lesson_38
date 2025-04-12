package com.teachmeskills.lesson_38;

import com.teachmeskills.lesson_38.service.Service;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Service service = context.getBean(Service.class);

        service.longMethod();
        service.shortMethod();
    }
}
