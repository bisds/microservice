package com.devops.coach;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class StartApplication {


    @GetMapping("/")
    public String index(final Model model) {
        model.addAttribute("title", "BONJOUR");
        model.addAttribute("msg","BIENVENUE A MA PRESENTATION");
        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }

}
