package com.itwill.shop.dao.test;

import com.itwill.shop.service.CommentsService;

public class CommentsTestMain {
	
	public static void main(String[] args) throws Exception{
		
	CommentsService commentsService = new CommentsService();
	
	System.out.println(commentsService.findCommentAll());
	
}
}
