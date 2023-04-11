package com.devedubiel.workshop.mongo.resources;

import com.devedubiel.workshop.mongo.domain.Post;
import com.devedubiel.workshop.mongo.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value ="/posts")
public class PostResource {
    @Autowired
    private PostService postServiceService;
    @GetMapping(value = "/{id}")
    public ResponseEntity<Post> findById(@PathVariable String id) {
        Post post = postServiceService.findById(id);
        return ResponseEntity.ok().body(post);
    }
}