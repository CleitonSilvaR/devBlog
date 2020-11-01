package com.cleitons.silvar.devBlog.service.serviceImpl;

import com.cleitons.silvar.devBlog.model.Post;
import com.cleitons.silvar.devBlog.repository.PostRepository;
import com.cleitons.silvar.devBlog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private PostRepository postRepository;

    @Override
    public List<Post> findAll() {
        return postRepository.findAll();
    }

    @Override
    public Post findById(Long id) {
        return postRepository.findById(id).get();
    }

    @Override
    public Post save(Post post) {
        return postRepository.save(post);
    }
}
