package com.linkmingle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.linkmingle.dto.CommentDto;
import com.linkmingle.service.CommentService;

@RestController
@RequestMapping("/blog")
public class CommentController {
	
	@Autowired
	CommentService commentService;
	
	@PostMapping("/user/{userId}/post/{blogId}")
	public ResponseEntity<String> commentOnPost(@RequestBody CommentDto commentDto, @PathVariable Long blogId, @PathVariable Integer userId){
		try {
			String comment= commentService.createComment(commentDto,blogId,userId);
			return ResponseEntity.ok("User successfully registered with ID: "+comment);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("Registration failed: " + e.getMessage());
		}
	}

}
