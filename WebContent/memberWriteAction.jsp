<%@page import="java.net.URLEncoder"%>
<%@page import="com.itwill.shop.service.MembersService"%>
<%@page import="com.itwill.shop.domain.exception.ExistedMembersException"%>
<%@page import="com.itwill.shop.domain.Members"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	if(request.getMethod().equalsIgnoreCase("GET")){
		response.sendRedirect("mac_main.jsp");
		return;
	}
		Members newMember=null;
	    int no=0;
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String address=request.getParameter("password");
		String phone=request.getParameter("phone");
		newMember=new Members(no,name,email,address,phone);
	
	/*
	try{
		request.setCharacterEncoding("UTF-8");	
		//int no=Integer.parseInt(session.getAttribute("members_no"));
		int no=0;
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String address=request.getParameter("password");
		String phone=request.getParameter("phone");
		newMember=new Members(no,name,email,address,phone);
		MembersService memberService=new MembersService();
		int rowCount=memberService.createMembers(newMember);
		response.sendRedirect("memberLoginForm.jsp");
	}catch(ExistedMembersException e){
		response.sendRedirect("memberWriteForm.jsp?msg="+URLEncoder.encode(e.getMessage(),"UTF-8"));
		
	}catch(Exception e){
    	//알수없는예외
    	e.printStackTrace();
    	response.sendRedirect("memberError.jsp");
    }
	*/
%>
	







%>    