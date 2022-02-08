package com.rama.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rama.model.UserEntity;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {

    UserEntity findOneByName(String name);
}
