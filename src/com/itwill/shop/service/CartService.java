package com.itwill.shop.service;

import java.util.ArrayList;

import com.itwill.shop.dao.CartDao;
import com.itwill.shop.dao.CartDaoImpl;
import com.itwill.shop.domain.Cart;

public class CartService {
	private CartDao cartDao;
	public CartService() throws Exception {
		//cartDao=new CartDaoImpl();
		cartDao=new CartDaoImpl();
	}
	/*
	 * Create
	 */
	public int insertCart(Cart cart) throws Exception{
		return cartDao.insertCart(cart);
	}
	/*
	 * Read
	 */
	public Cart selectByNo(int no) throws Exception{
		return cartDao.selectByNo(no);
	}
	public ArrayList<Cart> selectAll() throws Exception{
		return cartDao.selectAll();
	}
	/*
	 * Update
	 */
	public int updateCart(Cart cart) throws Exception{
		return cartDao.updateCart(cart);
	}
	/*
	 * Delete
	 */
	public int deleteCart(int no) throws Exception{
		return cartDao.deleteCart(no);
	}
}
