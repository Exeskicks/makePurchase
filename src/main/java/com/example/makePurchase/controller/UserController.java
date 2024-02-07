package com.example.makePurchase.controller;

import com.example.makePurchase.Service.UserService;
import com.example.makePurchase.models.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
<<<<<<< HEAD
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
=======
import org.springframework.web.bind.annotation.GetMapping;
>>>>>>> d4ea42b75cec86a30116a12fb6907119171c636c
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/registration")
    public String registration() {
        return "registration";
    }


    @PostMapping("/registration")
    public String createUser(User user) {
        userService.createUser(user);
        return "redirect:/login";
    }

<<<<<<< HEAD

    @GetMapping("/user/{user}")
    public String userInfo(@PathVariable("user") User user, Model model) {
        model.addAttribute("user", user);
        model.addAttribute("products", user.getProducts());
        return "user-info";
    }


=======
    @GetMapping("/hello")
    public String securityUrl() {
        return "hello";
    }
>>>>>>> d4ea42b75cec86a30116a12fb6907119171c636c
}