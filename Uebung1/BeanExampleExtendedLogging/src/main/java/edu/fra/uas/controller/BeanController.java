package edu.fra.uas.controller;

import edu.fra.uas.service.MessageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BeanController {

    private static final Logger log = LoggerFactory.getLogger(BeanController.class);
    private final MessageService messageService;

    public BeanController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping("/hello")
    public String hello(Model model) {
        log.info("GET /hello -> render hello.html");
        String msg = messageService.getMessage();
        log.debug("MessageService returned: {}", msg);
        model.addAttribute("title", "Spring Boot + Thymeleaf");
        model.addAttribute("message", msg);
        return "hello";
    }
}
