<%@page import="com.itwill.shop.domain.Members"%>
<%@page import="com.itwill.shop.service.MembersService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% 
    request.setCharacterEncoding("UTF-8");
   
    MembersService membersService = new MembersService();
    Members members=null;
    
    if(request.getParameter("findHandleId")!=null){
    	members = membersService.findMembersByPhone(request.getParameter("memberId"));
    }	
    
   	if(request.getParameter("findHandlePassword")!=null){
    	members = membersService.findMembersById(request.getParameter("memberPassWord"));
   	}
    
    if(members==null){
    	request.setAttribute("msg", "존재하지 않는 유저입니다.");
    	RequestDispatcher rd = request.getRequestDispatcher("memberIdPwFind.jsp");
    	rd.forward(request, response);
    }
    
    if(request.getParameter("findHandleId")!=null&&members!=null){
    	request.setAttribute("findId", members.getMembers_email());
    	RequestDispatcher rd = request.getRequestDispatcher("memberIdPwFind.jsp");
    	rd.forward(request, response); 
    }
    if(request.getParameter("findHandlePassword")!=null&&members!=null){
    	System.out.println("1");
    	request.setAttribute("findPassword", members.getMembers_password());
    	RequestDispatcher rd = request.getRequestDispatcher("memberIdPwFind.jsp");
    	rd.forward(request, response);
    }
 %>


 