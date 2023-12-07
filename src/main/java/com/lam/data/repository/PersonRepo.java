package com.lam.data.repository;

import com.lam.data.pojo.PersonEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface PersonRepo extends CrudRepository<PersonEntity, UUID> {
}
