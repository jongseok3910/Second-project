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
	private SqlSessionFactory sqlSessionFactory;
	
	public CardDaoImpl() throws Exception{
		try {
			InputStream mybatisConfigInputStream = 
					Resources.getResourceAsStream("mybatis-config.xml");
			SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
			this.sqlSessionFactory = 
					sqlSessionFactoryBuilder.build(mybatisConfigInputStream);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public Card findCardByNo(int cardNo) throws Exception {
		SqlSession sqlsession = sqlSessionFactory.openSession(true);
		CardMapper cardMapper = sqlsession.getMapper(CardMapper.class);
		Card card = cardMapper.findCardByNo(cardNo);
		return card;
	}

	@Override
	public List<Card> findCardAll() throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		CardMapper cardMapper = sqlSession.getMapper(CardMapper.class);
		List<Card> cardList = cardMapper.findCardAll();
		return cardList;
	}

	@Override
	public int insertCard(Card card) throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		CardMapper cardMapper = sqlSession.getMapper(CardMapper.class);
		int insertRow = cardMapper.insertCard(card);
		return insertRow;
	}

	@Override
	public int updateCardByNo(Card card) throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		CardMapper cardMapper = sqlSession.getMapper(CardMapper.class);
		int updateRow = cardMapper.updateCardByNo(card);
		return updateRow;
	}

	@Override
	public int deleteCardByNo(Integer cardNo) throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		CardMapper cardMapper = sqlSession.getMapper(CardMapper.class);
		int deleteRow = cardMapper.deleteCardByNo(cardNo);
		return deleteRow;
	}

}
