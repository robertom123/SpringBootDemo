package com.example.demo.controller;

import com.example.demo.PostService.PostService;
import entity.Post;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(method = RequestMethod.POST,value = "/posts")
    public void addPost(@RequestBody Post listElem){
        new PostService().addPost(listElem);
    }

    @RequestMapping(method = RequestMethod.PUT,value = "/posts/{id}")
    public void updatePost(@RequestBody Post post,@PathVariable int id){
        new PostService().updatePost(post,id);
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/posts/{id}")
    public void deletePost(@PathVariable int id){
        new PostService().deletePost(id);

    }
}
