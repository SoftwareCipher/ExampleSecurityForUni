package com.project.information.controller;

import com.project.information.entity.User;
import com.project.information.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("users/{id}")
    public User getUser(@PathVariable Long id){
        return personService.getPersonAge(id);
    }
}
