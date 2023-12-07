package com.lam.data.store;

import com.lam.data.model.Person;
import com.lam.data.pojo.PersonEntity;
import com.lam.data.repository.PersonRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Component
@Slf4j
public class PersonStore {

    private final PersonRepo personRepo;

    public Person findPersonById(UUID personId){
        final Optional<PersonEntity> userEntityOptional = personRepo.findById(personId);
        if (userEntityOptional.isPresent()) {
            final PersonEntity personEntity = userEntityOptional.get();
            return new Person(personEntity.getPersonId(),
                    personEntity.getName(),
                    personEntity.getAddress());
        } else throw new IllegalArgumentException("No Person found with personId " + personId);
    }
}
