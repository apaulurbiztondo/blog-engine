package com.allanurbiztondo.blogengine;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import com.allanurbiztondo.blogengine.entity.BlogPost;
import com.allanurbiztondo.blogengine.service.BlogService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;

@Slf4j
@SpringBootApplication
public class BlogEngineApplication {
    private static final String BLOG_JSON_FILE_PATH = "zesty_food_blog_posts.json";
    private static final TypeReference<List<BlogPost>> BLOG_POST_TYPE_REFERENCE = new TypeReference<>() {
    };

    public static void main(String[] args) {
        SpringApplication.run(BlogEngineApplication.class, args);
    }

    @Bean
    public static ObjectMapper objectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        return objectMapper;
    }

    @Bean
    public CommandLineRunner runner(BlogService blogService) {
        return args -> {
            try {
                String jsonContent = readJsonContent();
                List<BlogPost> blogPosts = mapJsonToObjects(jsonContent);
                blogService.saveAll(blogPosts);
                log.info("Blog posts saved");
            } catch (IOException e) {
                log.error("Error processing JSON file", e);
            }
        };
    }

    private static String readJsonContent() throws IOException {
        try (InputStream inputStream = new ClassPathResource(BLOG_JSON_FILE_PATH).getInputStream()) {
            return new String(inputStream.readAllBytes());
        }
    }

    private List<BlogPost> mapJsonToObjects(String jsonContent) throws IOException {
        return objectMapper().readValue(jsonContent, BLOG_POST_TYPE_REFERENCE);
    }

}
