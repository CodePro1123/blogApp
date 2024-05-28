package com.blog.app.BlogApp.service;

import com.blog.app.BlogApp.payload.PostDto;
import com.blog.app.BlogApp.payload.PostResponse;

public interface PostService{
   PostDto createPost(PostDto postDto);

   PostResponse getAllPost(int pageNo, int pageSize, String sortBy, String sortDir);

   PostDto getPostById(Long id);
   PostDto updatePost(long id, PostDto postDto);
   PostDto deleteById(Long id);
}
