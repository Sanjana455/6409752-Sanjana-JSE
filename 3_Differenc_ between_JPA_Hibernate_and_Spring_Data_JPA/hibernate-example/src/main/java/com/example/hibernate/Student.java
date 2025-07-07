package com.example.jpa;

import jakarta.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    public Student() {}
    public Student(String name) { this.name = name; }
}
