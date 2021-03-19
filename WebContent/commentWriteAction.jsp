<%@page import="com.itwill.shop.service.CommentsService"%>
<%@page import="com.itwill.shop.domain.Comments"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");

	String evalPoint = request.getParameter("evalPoint");
	String memberId = request.getParameter("memberId");
	String title = request.getParameter("title");
	String content = request.getParameter("content");
	String food_no = request.getParameter("food_no");	
	String comHandle = request.getParameter("comHandle");
	System.out.println(comHandle);
	System.out.println(evalPoint+" "+memberId+" "+title+" "+content+" "+food_no);
	
	try{
	Comments comments = 
			new Comments(0,title,memberId,content,Integer.parseInt(evalPoint),null,0,0,1,0,Integer.parseInt(food_no));
	CommentsService commentsService = new CommentsService();
			commentsService.insertComments(comments);
	response.sendRedirect("productDetailView.jsp?Food_no="+Integer.parseInt(food_no));
	}catch(Exception e){
		e.printStackTrace();
	}

%>
