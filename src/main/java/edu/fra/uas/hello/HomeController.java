package edu.fra.uas.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("title", "Startseite");
        model.addAttribute("message", "Dies ist die Startseite (Route /).");
        return "hello";                    // نفس القالب، لكن ببيانات مختلفة
    }

    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("title", "👋 Hallo von /hello");
        model.addAttribute("message", "Dies ist die zweite Seite (Route /hello).");
        return "hello";
    }
}
