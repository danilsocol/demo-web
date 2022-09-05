package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

    public ArrayList<Post> listAllPosts(){
        ArrayList<Post> list = new ArrayList<Post>();
        list.add(new Post("Мужик",10));
        list.add(new Post("Девушка",1000));
        list.add(new Post("Мальчик",0));
        return list;
    }
}
