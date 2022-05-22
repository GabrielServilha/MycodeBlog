package com.spring.codeblog.service;

import java.util.List;

import com.spring.codeblog.model.Post;

public interface CodeblogService {
	
	List<Post> findAll();
	Post FindById(long id);
	Post savePost(Post post);
	
	

}
