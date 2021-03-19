package com.itwill.shop.dao.test;

import java.util.ArrayList;
import java.util.HashMap;

import com.itwill.shop.domain.Orders;
import com.itwill.shop.domain.OrdersDetail;
import com.itwill.shop.service.OrdersService;

public class OrderTestMain {

	public static void main(String[] args) throws Exception {
		OrdersService ordersService = new OrdersService();
		//select
		HashMap<String, Object> hashmap = new HashMap<>();
		hashmap.put("members_no", 1);
		hashmap.put("orders_no", 2);
		/*
		System.out.println(ordersService.findOrderByOne(hashmap));
		System.out.println(ordersService.findOrderListById(1));
		*/
		
		//insert
		OrdersDetail od1 = new OrdersDetail(0, 1, 0, 301);
		OrdersDetail od2 = new OrdersDetail(0, 4, 0, 302);
		ArrayList<OrdersDetail> odl = new ArrayList<>();
		odl.add(od1);
		odl.add(od2);
		Orders o = new Orders(0, "2개", null, 39800,"참살기좋아요" ,2, odl);
		System.out.println(ordersService.createOrdersAll(o));
		/*
		System.out.println(ordersService.createOrders(o));
		for (OrdersDetail ordersDetail : odl) {
			System.out.println(ordersService.createOrdersDetail(ordersDetail));
		}
		*/
		
		//delete
		/*
			System.out.println(ordersService.deleteOrdersDetail(1));
			System.out.println(ordersService.deleteOrders(1));
			System.out.println(ordersService.deleteOrdersDetailByNo(3));
			System.out.println(ordersService.deleteOrdersByNo(3));	
			System.out.println(ordersService.deleteOrdersAllByNo(7));
			System.out.println(ordersService.deleteOrdersAll(2));
		*/
	}

}
