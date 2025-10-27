package edu.fra.uas.hello;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Greeting greetingBean() {
        return new Greeting("Hallo aus dem Bean!");
    }
}
