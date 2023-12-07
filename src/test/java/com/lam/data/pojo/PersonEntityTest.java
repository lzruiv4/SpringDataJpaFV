package com.lam.data.pojo;


import com.lam.config.ApplicationConfig;
import com.lam.data.pojo.PersonEntity;
import com.lam.data.repository.PersonRepo;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

@ContextConfiguration(classes = ApplicationConfig.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class PersonEntityTest {

    @Autowired
    private PersonRepo personRepo;

    @Test
    public void createPerson() {
        PersonEntity person = new PersonEntity();
        person.setName("FirstPersonName2");
        person.setAddress("FirstPersonAddress2");
        final PersonEntity personEntityToBeSave = personRepo.save(person);
        assertThat(personEntityToBeSave.getPersonId()).isNotNull();
    }

    @Test
    public void readFirstPerson() {

//        assertThat(firstPersonEntity.getPersonId()).isEqualTo("FirstPersonName1");
    }
}
