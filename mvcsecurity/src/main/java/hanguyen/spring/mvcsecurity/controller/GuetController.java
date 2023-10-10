package hanguyen.spring.mvcsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/guet")
public class GuetController {
    @GetMapping
    public String userHome(Model model){
        return "guet/home";
    }
}
