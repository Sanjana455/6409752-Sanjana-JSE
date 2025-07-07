package com.college;

import com.college.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        StudentService studentService = context.getBean("studentService", StudentService.class);

        studentService.registerStudent("Akshay");
    }
}
