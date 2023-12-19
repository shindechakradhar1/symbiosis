package com.linkmingle.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.linkmingle.dto.CommentDto;
import com.linkmingle.models.Blog;
import com.linkmingle.models.Comment;
import com.linkmingle.models.User;
import com.linkmingle.repository.BlogPostRepository;
import com.linkmingle.repository.CategoryRepository;
import com.linkmingle.repository.CommentRepository;
import com.linkmingle.repository.UserRepository;
import com.linkmingle.service.CommentService;

@Service
public class CommentServiceImpl implements CommentService{
	
	@Autowired
	CommentRepository commentRepo;
	
	@Autowired
	BlogPostRepository blogpostRepo;
	
	@Autowired
	CategoryRepository categoryRepo;
		
	@Autowired
	UserRepository userRepo;
	

	@Override
	public String createComment(CommentDto commentDto, Long blogId, Integer userId) {
		Comment comment= new Comment();
		Blog blog= blogpostRepo.findById(blogId).orElse(null);
		User user = userRepo.findById(userId).orElse(null);
		comment.setContent(commentDto.getContent());
		comment.setBlog(blog);
		comment.setAuthor(user);
		commentRepo.save(comment);
		return "Succefully commented";
	}

}
