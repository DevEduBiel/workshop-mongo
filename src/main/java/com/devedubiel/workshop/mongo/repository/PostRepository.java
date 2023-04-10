package com.devedubiel.workshop.mongo.repository;

import com.devedubiel.workshop.mongo.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository <Post,String> {
}
