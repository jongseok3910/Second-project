package com.itwill.shop.dao;

import java.util.List;

import com.itwill.shop.domain.Comments;

public interface CommentsDao {
	
	Comments findCommentByno(int commentsNo);
	List<Comments> findCommentAll(int food_no);
	int insertComments(Comments comments);
	int updateCommentsByNo(Comments comments);
	int deleteCommentsByNo(int commentsNo);

}
