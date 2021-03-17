package com.itwill.shop.dao.test;

import com.itwill.shop.dao.CardDaoImpl;

public class CardDaoTestMain {

	public static void main(String[] args) {

		CardDaoImpl cardDaoImpl = new CardDaoImpl();
		
		System.out.println(cardDaoImpl.findCardAll());
		//System.out.println(cardDaoImpl.findCardByNo(3));
		//System.out.println(addressDaoImpl.insertCard(card));
		//System.out.println(addressDaoImpl.updateCardByNo(card));
		//System.out.println(addressDaoImpl.deleteCardByNo(3));
		
		
		
		
	}

}
