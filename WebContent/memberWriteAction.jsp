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
		/*
		Members newMember=null;
	    int no=0;
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String password=request.getParameter("newPassword");
		String phone=request.getParameter("member_phone");
		newMember=new Members(no,name,email,password,phone);
		System.out.println("name: "+name+"\n"+"email: "+email+"\n"+"password: "+password+"\n"+"phone: "+phone);
		*/
	
	
	try{
		Members newMember=null;
	    int no=0;
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String password=request.getParameter("newPassword");
		String phone=request.getParameter("member_phone");
		newMember=new Members(no,name,email,password,phone);
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
	
%>
    