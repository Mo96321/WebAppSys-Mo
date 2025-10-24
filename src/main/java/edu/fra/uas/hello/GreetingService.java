package edu.fra.uas.hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    private static final Logger log = LoggerFactory.getLogger(GreetingService.class);

    private final Greeting greeting;

    public GreetingService(Greeting greeting) { // Inject @Bean
        this.greeting = greeting;
    }

    public String getGreeting() {
        log.info("Generating greeting from bean"); // <-- استخدام فعلي للـ Logger
        return greeting.getMessage();
    }
}
