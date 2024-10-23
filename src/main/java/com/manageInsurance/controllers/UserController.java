package com.manageInsurance.controllers;

import com.manageInsurance.entities.User;
import com.manageInsurance.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "home";
    }

    @PostMapping("/register/user")
    public String registerUser(@ModelAttribute User user) {
        System.out.println("User registered: " + user.getName());
        userService.register(user);
        return "redirect:/success";
    }


    @GetMapping("/success")
    public String successPage() {
        return "success";
    }
}
