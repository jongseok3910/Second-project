package com.itwill.shop.dao;

import java.util.List;

import com.itwill.shop.domain.Address;
import com.itwill.shop.domain.Card;

public interface CardDao {
	
	Card findCardByNo(Integer cardNo) throws Exception;
	public List<Card> findCardAll() throws Exception;
	public int insertCard(Card card) throws Exception;
	public int updateCardByNo(Card card) throws Exception;
	public int deleteCardByNo(Integer cardNo) throws Exception;

}
