package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class PostService {

    public ArrayList<Post> listAllPosts(){
        ArrayList<Post> list = new ArrayList<Post>();
        list.add(new Post("Мужик",new Date(1978, 4,1,10,32),10));
        list.add(new Post("Девушка",new Date(1978, 7,1,12,59),1000));
        list.add(new Post("Мальчик",new Date(1978, 9,1,3,11),0));
        return list;
    }
}
