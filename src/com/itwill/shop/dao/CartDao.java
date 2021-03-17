package com.itwill.shop.dao;

import java.util.ArrayList;
import java.util.List;

import com.itwill.shop.domain.Cart;

public interface CartDao {

	public List<Cart> findCartAll();
	public Cart findCartByFoodNo(Integer foodNo);
	public int updateCartByNo(Cart cart);
	public int insertCart(Cart cart);
	public int deleteCartByNo(Integer memberNo);
}