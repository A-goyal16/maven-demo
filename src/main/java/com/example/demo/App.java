package com.example.demo;

/**
 * Main Application Entry Point
 */
public class App {

    public static void main(String[] args) {
        System.out.println("=================================");
        System.out.println("  Maven Demo App - Running!     ");
        System.out.println("=================================");

        GreetingService service = new GreetingService();
        String message = service.greet("World");
        System.out.println(message);
    }
}
