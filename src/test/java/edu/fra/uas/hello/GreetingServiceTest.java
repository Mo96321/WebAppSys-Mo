package edu.fra.uas.hello;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GreetingServiceTest {

    @Test
    void returnsBeanMessage() {
        Greeting g = new Greeting("Test!");
        GreetingService svc = new GreetingService(g);
        assertEquals("Test!", svc.getGreeting());
    }
}
