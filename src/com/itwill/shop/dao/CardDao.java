package com.itwill.shop.dao;

import java.util.List;

import com.itwill.shop.domain.Address;
import com.itwill.shop.domain.Card;

public interface CardDao {
	Address findCardByNo(Integer cardNo);
	public List<Card> findcardAll();
	public int insertCard(Card card);
	public int updateCardByNo(Card card);
	public int deleteCardByNo(Integer cardNo);

}
