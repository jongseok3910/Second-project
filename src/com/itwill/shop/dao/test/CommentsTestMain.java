package com.itwill.shop.dao.test;

import com.itwill.shop.domain.Comments;
import com.itwill.shop.service.CommentsService;

public class CommentsTestMain {
	
	public static void main(String[] args) throws Exception{
		
	CommentsService commentsService = new CommentsService();
	
	//System.out.println(commentsService.findCommentAll());
	
	Comments comments = 
			new Comments(0,"gd","gd","gdgd",4,null,0,0,0,0,301);
	
	commentsService.insertComments(comments);
	
}
}
