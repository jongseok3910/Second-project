package com.itwill.shop.dao.test;

import com.itwill.shop.dao.CardDaoImpl;
import com.itwill.shop.domain.Card;

public class CardDaoTestMain {

	public static void main(String[] args) throws Exception {
		
		CardDaoImpl cardDao=new CardDaoImpl();
		System.out.println(cardDao.findCardByNo(111));
		/*
		System.out.println(cardDao.findCardAll());
		Card card= new Card(5, 5555-5555-5555-5555, "농협카드", 0, 1);
		System.out.println(cardDao.insertCard(card));
		System.out.println(cardDao.updateCardByNo(card));
		System.out.println(cardDao.deleteCardByNo(3));
		*/
		
	
	}

}
