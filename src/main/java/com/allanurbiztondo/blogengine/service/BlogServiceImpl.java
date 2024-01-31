package com.allanurbiztondo.blogengine.service;

import java.util.List;
import java.util.Optional;

import com.allanurbiztondo.blogengine.entity.BlogPost;
import com.allanurbiztondo.blogengine.error.ResourceNotFoundException;
import com.allanurbiztondo.blogengine.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogServiceImpl implements BlogService {

    private final BlogRepository blogRepository;

    @Autowired
    public BlogServiceImpl(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }

    @Override
    public Iterable<BlogPost> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public void saveAll(List<BlogPost> blogPosts) {
        blogRepository.saveAll(blogPosts);
    }

    @Override
    public BlogPost getPostByUrl(String url) {
        String formattedUrl = String.format("/%s/", url);
        Optional<BlogPost> blogPost = Optional.ofNullable(blogRepository.getPostByUrl(formattedUrl));
        return blogPost.orElseThrow(this::blogPostNotFound);
    }

    private ResourceNotFoundException blogPostNotFound() {
        return new ResourceNotFoundException("Blog post not found.");
    }
}
