package com.cleitons.silvar.devBlog.service;

import com.cleitons.silvar.devBlog.model.Post;

import java.util.List;

public interface PostService {

    List<Post> findAll();
    Post findById(Long id);
    Post save(Post post);
}
