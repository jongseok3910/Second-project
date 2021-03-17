package com.itwill.shop.service;

import java.util.List;

import com.itwill.shop.dao.CommentsDao;
import com.itwill.shop.dao.CommentsDaoImpl;
import com.itwill.shop.domain.Comments;

public class CommentsService {
	private CommentsDao commentsDao;
	
	public CommentsService() throws Exception{
		commentsDao = new CommentsDaoImpl();
	}
	
	public Comments findCommentByno(int commentsNo) throws Exception{
	    return commentsDao.findCommentByno(commentsNo);	
	}
	
	public List<Comments> findCommentAll() throws Exception{
	 	return commentsDao.findCommentAll();
	}
	
	public int insertComments(Comments comments) throws Exception{
		return commentsDao.insertComments(comments);
	}
	
	public int updateCommentsByNo(Comments comments) throws Exception{
		return commentsDao.updateCommentsByNo(comments);
	}
	
	public int deleteCommentsByNo(int commentsNo) throws Exception{
		return commentsDao.deleteCommentsByNo(commentsNo);
		
	}

}