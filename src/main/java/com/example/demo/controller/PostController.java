package com.example.demo.controller;

import com.example.demo.PostService.PostService;
import entity.Post;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PostController {

    @RequestMapping("/posts")
    public List<Post> getPosts(){
        return new PostService().getPosts();
    }
    @RequestMapping("/posts/{id}")
    public Post getPost(@PathVariable int id){
        return new PostService().getPost(id);
    }
}
