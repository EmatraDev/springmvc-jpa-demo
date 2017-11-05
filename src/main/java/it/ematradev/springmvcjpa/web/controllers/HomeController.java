package it.ematradev.springmvcjpa.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import it.ematradev.springmvcjpa.repositories.UserRepository;
@Controller
public class HomeController
{
    @Autowired
    private UserRepository userRepo;
    @RequestMapping("/")
    public String home(Model model)
    {
        model.addAttribute("users", userRepo.findAll());
        return "index";
    }
}
