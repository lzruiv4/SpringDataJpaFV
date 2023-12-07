package com.lam.repository;

import com.lam.pojo.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface PersonRepo extends CrudRepository<Person, UUID> {
}
