package com.lam.pojo;


import com.lam.config.ApplicationConfig;
import com.lam.repository.PersonRepo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(classes = ApplicationConfig.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class PersonTest {

    @Autowired
    PersonRepo personRepo;

    @Test
    public void createPerson() {
        Person person = new Person();
        person.setName("FirstPersonName");
        person.setAddress("FirstPersonAddress");

        personRepo.save(person);
    }
}
