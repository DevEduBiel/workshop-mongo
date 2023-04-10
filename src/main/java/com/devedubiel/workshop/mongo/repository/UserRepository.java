package com.devedubiel.workshop.mongo.repository;

import com.devedubiel.workshop.mongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository <User,String> {
}
