<%@page import="com.itwill.shop.domain.Members"%>
<%@page import="com.itwill.shop.service.MembersService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
 	String members_id = request.getParameter("members_email");
 	String members_password = request.getParameter("members_password");
 	Members members = new Members();
 	
 	MembersService membersService = new MembersService();
 	members=membersService.findMembersById(members_id);
 	if(members!=null){
	 	if(membersService.findMembersByPassWord(members_password)!=null){
	 		session.setAttribute("members_email", members.getMembers_email());
	 		session.setAttribute("members_no", members.getMembers_no());
	 		response.sendRedirect("mac_main.jsp");
	 	}	
 	}else{
 			response.sendRedirect("mac_main.jsp");
 	}

%>