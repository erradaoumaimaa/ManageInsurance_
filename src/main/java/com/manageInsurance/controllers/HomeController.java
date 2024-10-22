package com.manageInsurance.controllers;

import com.manageInsurance.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class HomeController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public ModelAndView home() {
        ModelAndView mav = new ModelAndView("home");
        return mav;
    }

    @GetMapping("/testDatabase")
    public ModelAndView testDatabase() {
        ModelAndView mav = new ModelAndView("home");
        boolean isConnected = userService.testDatabaseConnection();

        if (isConnected) {
            mav.addObject("message", "Connection to the database was successful!");
        } else {
            mav.addObject("message", "Failed to connect to the database.");
        }

        return mav;
    }
}