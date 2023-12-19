package com.linkmingle.dto;

public class CommentDto {

	private String content;
	private Long blogId;
	private Integer userId;

	public CommentDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CommentDto(String content, Long blogId, Integer userId) {
		super();
		this.content = content;
		this.blogId = blogId;
		this.userId = userId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Long getBlogId() {
		return blogId;
	}

	public void setBlogId(Long blogId) {
		this.blogId = blogId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "CommentDto [content=" + content + ", blogId=" + blogId + ", userId=" + userId + "]";
	}

}
