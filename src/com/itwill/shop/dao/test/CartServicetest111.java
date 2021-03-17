package com.itwill.shop.dao.test;

import java.util.ArrayList;
import java.util.List;

import com.itwill.shop.domain.Cart;
import com.itwill.shop.domain.Food;
import com.itwill.shop.domain.Members;
import com.itwill.shop.service.CartService;

public class CartServicetest111 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		CartService cartService = new CartService();
		
		//System.out.println(cartService.findCartAll());
		//System.out.println(cartService.findCartByFoodNo(302));
		//System.out.println(cartService.findCartByMembersNo(8));
		List<Food> food = new ArrayList<>();
		food.add(new Food(305));
		Cart cart = new Cart(null, 4, 11, food);
		//System.out.println(food);
		System.out.println(cartService.insertCart(cart));
		

	}

}
