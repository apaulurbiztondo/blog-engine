package com.allanurbiztondo.blogengine.entity;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BlogPost {

    @Id
    private Integer id;
    private String title;
    private String content;
    private String url;

    @JsonProperty("seo_title")
    private String seoTitle;

    @JsonProperty("seo_description")
    private String seoDescription;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @JsonProperty("publication_date")
    private LocalDate publicationDate;
}

