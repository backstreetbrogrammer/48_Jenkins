package com.backstreetbrogrammer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GreeterTest {

    private final String someone = "World";
    private Greeter greeter;

    @BeforeEach
    void setUp() {
        greeter = new Greeter();
    }

    @Test
    public void greetShouldIncludeTheOneBeingGreeted() {
        assertTrue(greeter.greet(someone).contains(someone));
    }

    @Test
    public void greetShouldIncludeGreetingPhrase() {
        assertTrue(greeter.greet(someone).length() > someone.length());
    }
}
