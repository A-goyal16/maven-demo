package com.example.demo;

/**
 * A simple greeting service class
 */
public class GreetingService {

    public String greet(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        return "Hello, " + name + "! Welcome to the Maven Demo Project.";
    }

    public String greetWithTitle(String title, String name) {
        if (title == null || name == null) {
            throw new IllegalArgumentException("Title and name cannot be null");
        }
        return "Hello, " + title + " " + name + "!";
    }
}
