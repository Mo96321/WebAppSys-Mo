package edu.fra.uas.hello.meriem;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/meriem")
    public String sayHello() {
        return "Hallo Meriem, dein eigener Controller läuft perfekt!";
    }
}
