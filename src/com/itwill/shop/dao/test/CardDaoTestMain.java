package com.itwill.shop.dao.test;

import com.itwill.shop.dao.CardDaoImpl;

public class CardDaoTestMain {

	public static void main(String[] args) {

		CardDaoImpl cardDaoImpl = new CardDaoImpl();
		
		
		System.out.println(cardDaoImpl.findCardByNo(1531313131315153));
		

	}

}
