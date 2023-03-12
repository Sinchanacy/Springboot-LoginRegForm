package com.example.FinalLoginForm.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class Logincontroller {
    @GetMapping("/login")
    public String map()
    {
        return "login";
    }
    @GetMapping("/loginsuccess")
    public String mapping()
    {
        return "loginsuccess";
    }
}
