package pl.coderslab.charity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import pl.coderslab.charity.entity.User;
import pl.coderslab.charity.service.impl.UserServiceImpl;

@Controller
public class AuthenticationController {
    private UserServiceImpl userService;

    public AuthenticationController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping("/register")
    public String showRegisterForm (Model model) {
        model.addAttribute("user", new User());
        return "register";
    }
    @PostMapping("/register")
    public String register (@Validated User user) {
        userService.saveUser(user);
        return "redirect:/login";
    }
    @GetMapping("/login")
    public String showLoginForm () {
        return "login";
    }
    @GetMapping("/403")
    public String showUnauthorizedAccessView () {
        return "403";
    }
}
