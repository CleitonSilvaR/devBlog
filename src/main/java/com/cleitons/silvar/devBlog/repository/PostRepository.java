package com.cleitons.silvar.devBlog.repository;

import com.cleitons.silvar.devBlog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository <Post, Long> {
}
