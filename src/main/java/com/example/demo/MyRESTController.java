package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@RestController
public class MyRESTController {

    @Autowired
    ContactRepository repository;

    @GetMapping("/contacts")
    public Iterable<Contact> getContacts() {
        return repository.findAll();
    }

    //Solution for the second question
    @PostMapping
    public String addContact (Model model, @RequestBody Contact person){
        model.addAttribute(person);
        return "contact";
    }

}