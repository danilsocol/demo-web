package com.example.demoweb.model;

public class Post {
    String text;
    Integer likes;

    public Post(String _text, Integer _likes){
        text = _text;
        likes = _likes;
    }
    public String getText(){
        return text;
    }
    public Integer getLikes(){
        return likes;
    }
}
