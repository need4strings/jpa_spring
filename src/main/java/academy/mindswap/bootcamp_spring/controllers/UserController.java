package academy.mindswap.bootcamp_spring.controllers;

import academy.mindswap.bootcamp_spring.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    private UserService service;

    @GetMapping("/students")
    public String getUsers(Model model) {
        model.addAttribute("users", service.getUsers());
        return "students";
    }

    @Autowired
    public void setService(UserService service) {
        this.service = service;
    }
}