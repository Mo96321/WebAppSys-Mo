package edu.fra.uas.hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    private static final Logger log = LoggerFactory.getLogger(HomeController.class);

    private final GreetingService greetingService;

    public HomeController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/")
    public String index(Model model) {
        log.debug("Handling GET /");
        model.addAttribute("title", "Startseite");
        model.addAttribute("message", "Dies ist die Startseite (Route /). "
                + greetingService.getGreeting());
        return "hello";
    }

    @GetMapping("/hello")
    public String hello(Model model) {
        log.debug("Handling GET /hello");
        model.addAttribute("title", "👋 Hallo von /hello");
        model.addAttribute("message", "Dies ist die zweite Seite (Route /hello). "
                + greetingService.getGreeting());
        return "hello";
    }
}
