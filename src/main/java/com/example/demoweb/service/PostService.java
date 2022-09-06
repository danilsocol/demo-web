package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class PostService {

    public ArrayList<Post> posts = new ArrayList<>();

    {
        posts.add(new Post((long) posts.size(),"Мужик",new Date(1978, 4,1,10,32),10));
        posts.add(new Post((long) posts.size(),"Девушка",new Date(1978, 7,1,12,59),1000));
        posts.add(new Post((long) posts.size(),"Мальчик",new Date(1978, 9,1,3,11),0));
    }
    public ArrayList<Post> listAllPosts(){
        return posts;
    }

    public Post listAllPosts(Integer index){
        return posts.get(index);
    }

    public void create(String text) {
        posts.add(new Post((long) posts.size(),text, new Date()));
    }
}
