package com.example.springdatajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.PostConstruct;

@SpringBootApplication
public class App {

    @Autowired
    private StudentRepository repo;

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @PostConstruct
    public void init() {
        repo.save(new Student("Sanjana"));
        System.out.println("Saved student via Spring Data JPA");
    }
}
