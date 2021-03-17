package com.itwill.shop.dao.mapper;

import java.util.List;

import com.itwill.shop.domain.Comments;

public interface CommentsMapper {
	
	public Comments findCommentByno(int commentsNo);
	public List<Comments> findCommentAll();
	public int insertComments(Comments comments);
	public int updateCommentsByNo(Comments comments);
	public int deleteCommentsByNo(int commentsNo);
}
