package com.commerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class LoginController {
    public String login(Model model) {
        model.addAttribute("user", "Merhaba");
        return "login";

    }

}

