<%@page import="com.itwill.shop.domain.Category"%>
<%@page import="com.itwill.shop.domain.Food"%>
<%@page import="com.itwill.shop.service.FoodService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	FoodService foodService = new FoodService();
	//List<Food> foodList = foodService.findFoodAll();
	//Food food = foodService.findFoodByNo(302);
	//Food food = foodService.findFoodByName("딸기 칠러");
	//List<Food> foodList = foodService.findFoodByLikeName("라떼");
	//Food food = new Food(000, "촤파파", 5555, "000.png","wggrg",5, 5432, new Category(30));
	//int updateRow = foodService.updateFoodByNo(food);
	int deleteRow = foodService.deleteFoodByNo(000);
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%= deleteRow %>

</body>
</html>