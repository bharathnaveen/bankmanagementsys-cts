package com.org.user.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.org.user.model.UserRegistration;

@Repository
public interface UserRepository extends MongoRepository<UserRegistration, Integer> {

}
