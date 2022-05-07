package com.example.week7projectnew.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/88888")
    public String home(){
        return "home";
    }
}
