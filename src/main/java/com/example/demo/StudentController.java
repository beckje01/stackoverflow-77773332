package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping("/student")
public class StudentController {


    @RequestMapping("/register")
    public String register(Model model) {
        model.addAttribute("students",new ArrayList<>());
        System.out.println("I have been called.");
        return "/student/register";
    }
}
