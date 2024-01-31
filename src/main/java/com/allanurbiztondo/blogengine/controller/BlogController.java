package com.allanurbiztondo.blogengine.controller;

import com.allanurbiztondo.blogengine.entity.BlogPost;
import com.allanurbiztondo.blogengine.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/blog")
public class BlogController {

    private final BlogService blogService;

    @Autowired
    public BlogController(BlogService blogService) {
        this.blogService = blogService;
    }

    @GetMapping("/home")
    public String home(Model model) {
        Iterable<BlogPost> posts = blogService.findAll();
        model.addAttribute("posts", posts);
        return "blog/home";
    }

    @GetMapping("/{url}/")
    public String getBlogPostByUrl(@PathVariable String url, Model model) {
        BlogPost post = blogService.getPostByUrl(url);
        model.addAttribute("post", post);
        return "blog/post";
    }

}
