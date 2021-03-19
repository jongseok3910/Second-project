package com.itwill.shop.dao;

import java.util.List;

import com.itwill.shop.domain.Comments;

public interface CommentsDao {
	
	public Comments findCommentByno(int commentsNo) throws Exception;
	public List<Comments> findCommentAll(int food_no) throws Exception;
	public int insertComments(Comments comments) throws Exception;
	public int insertCommentsChild(Comments comments) throws Exception;
	public int updateCommentsByNo(Comments comments) throws Exception;
	public int deleteCommentsByNo(int commentsNo) throws Exception;

}
