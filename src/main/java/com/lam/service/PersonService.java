package com.lam.service;


import com.lam.data.model.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@RequiredArgsConstructor
@Service
public class PersonService {

    private final PersonService personService;

    public Person findPersonById(final UUID personId) {
        return personService.findPersonById(personId);
    }
}
