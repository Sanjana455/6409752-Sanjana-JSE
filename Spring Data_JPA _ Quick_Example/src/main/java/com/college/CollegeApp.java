package com.college;

import com.college.entity.Student;
import com.college.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CollegeApp implements CommandLineRunner {

    @Autowired
    private StudentRepository studentRepository;

    public static void main(String[] args) {
        SpringApplication.run(CollegeApp.class, args);
    }

    @Override
    public void run(String... args) {
        studentRepository.save(new Student("Sanjana"));
        studentRepository.save(new Student("Harshitha"));

        studentRepository.findAll().forEach(student ->
            System.out.println("Student: " + student.getName())
        );
    }
} 
