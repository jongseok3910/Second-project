package com.itwill.shop.dao.test;

import com.itwill.shop.service.CartService;

public class CartServicetest111 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		CartService cartService = new CartService();
		
		//System.out.println(cartService.findCartAll());
		System.out.println(cartService.findCartByFoodNo(302));

	}

}
