package com.itwill.shop.dao;

import java.util.List;

import com.itwill.shop.domain.Address;
import com.itwill.shop.domain.Card;
import com.itwill.shop.domain.Food;

public interface CardDao {
	
	public List<Card> findCardByNo(int cardNo);
	public List<Card> findCardAll();
	int insertCard(Card card);
	int updateCardByNo(Card card) throws Exception;
	int deleteCardByNo(int cardNo);
	
	
	
	
}
