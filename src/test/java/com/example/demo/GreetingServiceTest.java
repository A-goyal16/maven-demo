package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GreetingServiceTest {

    private GreetingService service;

    @BeforeEach
    void setUp() {
        service = new GreetingService();
    }

    @Test
    void testGreet_withValidName() {
        String result = service.greet("World");
        assertEquals("Hello, World! Welcome to the Maven Demo Project.", result);
    }

    @Test
    void testGreet_withNullName_throwsException() {
        assertThrows(IllegalArgumentException.class, () -> service.greet(null));
    }

    @Test
    void testGreet_withEmptyName_throwsException() {
        assertThrows(IllegalArgumentException.class, () -> service.greet(""));
    }

    @Test
    void testGreetWithTitle() {
        String result = service.greetWithTitle("Dr.", "Smith");
        assertEquals("Hello, Dr. Smith!", result);
    }

    @Test
    void testGreetWithTitle_withNullArgs_throwsException() {
        assertThrows(IllegalArgumentException.class, () -> service.greetWithTitle(null, "Smith"));
    }
}
