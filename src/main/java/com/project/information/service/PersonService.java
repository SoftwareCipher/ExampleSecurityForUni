package com.project.information.service;

import com.project.information.entity.User;
import com.project.information.repository.PersonRepository;
import com.project.information.service.impl.Impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonService implements Impl {

    PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public Optional<User> getPersonAge(Long id) {
        return personRepository.findById(id);
    }
}
