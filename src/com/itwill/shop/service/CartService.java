package com.itwill.shop.service;

import java.util.ArrayList;
import java.util.List;

import com.itwill.shop.dao.CartDao;
import com.itwill.shop.dao.CartDaoImpl;
import com.itwill.shop.domain.Cart;

public class CartService {
	private CartDao cartDao;
	public CartService() throws Exception {
		//cartDao=new CartDaoImpl();
		cartDao=new CartDaoImpl();
	}
	
	public List<Cart> findCartAll() {
		return cartDao.findCartAll();
	}
	
	public Cart findCartByFoodNo(Integer foodNo) {
		return cartDao.findCartByFoodNo(foodNo);
	}
	
	public int updateCartByNo(Cart cart) {
		return cartDao.updateCartByNo(cart);
	}
	
	public int insertCart(Cart cart) {
		return cartDao.insertCart(cart);
	}
	
	public int deleteCartByNo(Integer memberNo) {
		return cartDao.deleteCartByNo(memberNo);
	}

}
