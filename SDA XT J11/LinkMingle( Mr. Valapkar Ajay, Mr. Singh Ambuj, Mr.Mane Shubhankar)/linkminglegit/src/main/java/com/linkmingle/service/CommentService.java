package com.linkmingle.service;

import org.springframework.stereotype.Service;

import com.linkmingle.dto.CommentDto;

@Service
public interface CommentService {

	String createComment(CommentDto commentDto, Long blogId, Integer userId);

}
