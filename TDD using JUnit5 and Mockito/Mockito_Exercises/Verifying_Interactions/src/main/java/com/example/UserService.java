package com.example;

public class UserService {
    private final UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    public String getGreeting(int id) {
        String name = repo.findNameById(id);
        return "Welcome, " + name;
    }
}
