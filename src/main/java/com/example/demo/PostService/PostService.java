package com.example.demo.PostService;

import entity.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

    List<Post> posts = new ArrayList<>();

    public PostService() {
        posts.add(new Post(1,"DataType","Sample text"));
        posts.add(new Post(2,"Classes","Sample text"));
        posts.add(new Post(3,"Objects","Sample text"));
        posts.add(new Post(4,"Access specifiers","Sample text"));
        posts.add(new Post(5,"OOPS overview","Sample text"));
    }
    public List<Post> getPosts(){
        return posts;
    }

    public Post getPost(int id){
        for(Post post: posts){
            if(post.getPostId() == id){
                return post;
            }
        }
        return null;
    }
    public void addPost(Post listElem) {
        posts.add(listElem);

    }
    public void updatePost(Post post, int id) {
        for(int i = 0;i < posts.size(); i++){
            Post tempPost = posts.get(i);
            if(tempPost.getPostId() == id){
                posts.set(i,post);
                return;
            }
        }
    }
    public void deletePost(int id) {
        for(int i = 0;i < posts.size(); i++){
            Post tempPost = posts.get(i);
            if(tempPost.getPostId() == id){
                posts.remove(i);
                return;
            }
        }
    }

}
