package com.allanurbiztondo.blogengine.service;


import java.util.List;

import com.allanurbiztondo.blogengine.entity.BlogPost;

public interface BlogService {
    Iterable<BlogPost> findAll();

    void saveAll(List<BlogPost> blogPosts);
}
