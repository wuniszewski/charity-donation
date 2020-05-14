package pl.coderslab.charity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import pl.coderslab.charity.entity.User;
import pl.coderslab.charity.service.impl.UserServiceImpl;

@Controller
public class RegistryLoginController {
    private UserServiceImpl userService;

    public RegistryLoginController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping("/register")
    public String showRegisterForm (Model model) {
        model.addAttribute("user", new User());
        return "register";
    }
    @PostMapping("/register")
    public String register (@Validated User user) {
        userService.save(user);
        return "/login";
    }
    @GetMapping("/login")
    public String showLoginForm(Model model) {
        model.addAttribute("loggedInUser", new User());
        return "login";
    }
    @PostMapping("/login")
    public String login (@Validated User user) {
        if(userService.checkIfCorrectUser(user)) {
            return "/";
        }
        return "/login";
    }
}
