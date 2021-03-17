package com.itwill.shop.dao;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.itwill.shop.dao.mapper.CardMapper;
import com.itwill.shop.dao.mapper.CartMapper;
import com.itwill.shop.domain.Card;

public class CardDaoImpl implements CardDao {
	
	
<<<<<<< HEAD

	@Override
	public Card findCardByNo(Integer CardNo) {
		SqlSession sqlsession = sqlSessionFactory.openSession(true);
		CardMapper cardMapper = sqlsession.getMapper(cardMapper.class);
		Card card = cardMapper.findCardByNo(cardNo);
		return card;
	}

	@Override
	public List<Card> findCardAll() {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		CardMapper cardMapper = sqlSession.getMapper(cardMapper.class);
		List<Card> cardList = cardMapper.findCardAll();
		return cardList;
	}

	@Override
	public int insertCard(Card Card) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		CardMapper cardMapper = sqlSession.getMapper(cardMapper.class);
		int insertRow = cardMapper.insertCard(card);
		return insertRow;
	}

	@Override
	public int updateCardByNo(Card Card) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		CardMapper cardMapper = sqlSession.getMapper(cardMapper.class);
		int updateRow = cardMapper.updateCardByNo(card);
		return updateRow;
	}

	@Override
	public int deleteCardByNo(Integer CardNo) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		CardMapper cardMapper = sqlSession.getMapper(cardMapper.class);
		int deleteRow = cardMapper.deleteCardByNo(cardNo);
		return deleteRow;
	}
	
=======
>>>>>>> branch 'master' of https://github.com/2020-12-JAVA-BACKEND/2nd-project-team2-Mac2ja.git
}
