package com.example.springApp.controller;

import com.example.springApp.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class Home {
    String message = "Welcome to your 1st Maven Spring project !";

    @RequestMapping("/form")
    public ModelAndView showMessage() {
        Customer customer = new Customer();
        return new ModelAndView("form", "customer", customer);
    }

    @RequestMapping("/processForm")
    public String processForm(
            @Valid @ModelAttribute("customer") Customer theCustomer,
            BindingResult theBindingResult){
        if(theBindingResult.hasErrors()){
            return "form";
        }
        return "hello";
    }

}