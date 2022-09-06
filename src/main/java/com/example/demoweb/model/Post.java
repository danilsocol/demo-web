package com.example.demoweb.model;

import java.util.Date;

public class Post {
    private String text;
    private Integer likes;
    private Date creationDate;

    private Long id;

    public Post(Long _id ,String _text,Date _creationDate, Integer _likes){
        id = _id;
        text = _text;
        likes = _likes;
        creationDate = _creationDate;
    }

    public Post(Long _id, String _text,Date _creationDate){
        id = _id;
        text = _text;
        likes = 0;
        creationDate = _creationDate;
    }

    public void setLikes(Integer _likes){
        likes = _likes ;
    }

    public Long getId(){
        return id;
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
