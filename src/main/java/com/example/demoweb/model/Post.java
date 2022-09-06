package com.example.demoweb.model;

import java.util.Date;

public class Post {
    private String text;
    private Integer likes;
    private Date creationDate;

    public Post(String _text,Date _creationDate, Integer _likes){
        text = _text;
        likes = _likes;
        creationDate = _creationDate;
    }
    public String getText(){
        return text;
    }
    public Integer getLikes(){
        return likes;
    }

    public Date getCreationDate(){
        return creationDate;
    }
}
