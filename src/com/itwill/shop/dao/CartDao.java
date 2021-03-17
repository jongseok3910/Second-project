package com.itwill.shop.dao;

import java.util.ArrayList;

import com.itwill.shop.domain.Cart;

public interface CartDao {

	int insertCart(Cart cart) throws Exception;

	Cart selectByNo(int no) throws Exception;

	ArrayList<Cart> selectAll() throws Exception;

	int updateCart(Cart cart) throws Exception;

	int deleteCart(int no) throws Exception;
}