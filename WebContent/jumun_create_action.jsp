<%@page import="com.itwill.shop.domain.Orders"%>
<%@page import="com.itwill.shop.service.CartService"%>
<%@page import="com.itwill.shop.service.OrdersService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	/*
	 주문생성
	
	if(request.getMethod().equalsIgnoreCase("GET")){
		response.sendRedirect("jumun_list.jsp");
		return;
	}
*/
//사람 정보는 세션에서 구해오면 됨
//제품 수량 정보는 카트에서 구해오면 됨

	OrdersService ordersService = new OrdersService();
	CartService cartService=new CartService();
	
	//Orders orders = new Orders(null, );
	
	//ordersService.createOrdersAll(orders);

	response.sendRedirect("jumun_list.jsp");	
%>