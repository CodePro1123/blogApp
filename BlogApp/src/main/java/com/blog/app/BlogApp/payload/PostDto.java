package com.blog.app.BlogApp.payload;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


@Data
public class PostDto {


    private Long id;
    @NotEmpty()
    @Size(min = 2 , message = "posttitle should have atleast 2 characters")
    private String title;
    @NotEmpty
    @Size(min = 2,message = "desc should have atleast 20 characters",max = 100)
    private String description;
    @NotEmpty
    @Size(min = 2,message = "content should have atleast 2 characters")
    private String content;



}