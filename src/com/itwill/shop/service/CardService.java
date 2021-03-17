package com.itwill.shop.service;

import java.util.List;

import com.itwill.shop.dao.CardDao;
import com.itwill.shop.dao.CardDaoImpl;
import com.itwill.shop.domain.Card;

public class CardService {
private CardDao cardDao;
	
	public CardService() throws Exception{
		cardDao = new CardDaoImpl();
	}
	
	public Card findCardByNo(Integer cardNo) {
		return cardDao.findCardByNo(cardNo);
	}
	public List<Card> findCardAll(){
		return cardDao.findCardAll();
	}
	public int insertAddress(Card card) {
		return cardDao.insertCard(card);
	}
	public int updateCardByNo(Card card) throws Exception {
		return cardDao.updateCardByNo(card);
	}
	public int deleteCardByNo(Integer cardNo) {
		return cardDao.deleteCardByNo(cardNo);
	}
}
