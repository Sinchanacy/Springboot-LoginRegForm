package com.example.FinalLoginForm.Controller;

import com.example.FinalLoginForm.Registration.RegDetails;
import com.example.FinalLoginForm.Service.Userser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/register")
public class UserController {
    @Autowired
    private Userser service;
    @ModelAttribute("user")
    public RegDetails RegDetails()
    {
        return new RegDetails();
    }
    @GetMapping
    public String get()
    {
        return "register";
    }
    @PostMapping
    public String register(@ModelAttribute("user") RegDetails details)
    {
        service.adduser(details);
        return "redirect:/register?success";
    }


}
