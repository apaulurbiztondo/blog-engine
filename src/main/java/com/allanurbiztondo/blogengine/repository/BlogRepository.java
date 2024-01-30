package com.allanurbiztondo.blogengine.repository;

import com.allanurbiztondo.blogengine.entity.BlogPost;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository extends CrudRepository<BlogPost, Long> {
    BlogPost getPostByUrl(String url);
}
