package edu.fra.uas.service;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class GreetingServiceTest {

    @Test
    void greet_returns_expected_text() {
        GreetingService svc = new GreetingService();
        String out = svc.greet("Mo");
        assertThat(out).contains("Mo"); // عدّل حسب منطقك إن كان "Hi Mo" مثلاً
    }
}