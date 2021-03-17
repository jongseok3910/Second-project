package com.itwill.shop.dao;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.itwill.shop.domain.Cart;

public class CartDaoImpl implements CartDao {
	/*
	 * 이름         널?       유형         
	---------- -------- ---------- 
	CART_NO    NOT NULL NUMBER(10) 
	CART_QTY            NUMBER(10) 
	MEMBERS_NO          NUMBER(10) 
	MENU_NO             NUMBER(10) 
	 */
	private SqlSessionFactory sqlSessionFactory;
	public CartDaoImpl() throws Exception{
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
	

	public int insertCart(Cart cart) throws Exception {
		int insertRowCount=0;
		
		return insertRowCount;
	}

	public Cart selectByNo(int no) throws Exception {
		Cart cart=null;
		
		return cart ;
	}

	public ArrayList<Cart> selectAll() throws Exception {
		List<Cart> cartList=new ArrayList<Cart>();
		SqlSession sqlSession=sqlSessionFactory.openSession();
		cartList = sqlSession.selectList("com.itwill.shop.dao.mapper.selectAll");
		return (ArrayList<Cart>)cartList;
	}

	public int updateCart(Cart cart) throws Exception {
		int updateRowCount=0;
		
		return updateRowCount;
	}

	public int deleteCart(int no) throws Exception {
		int deleteRowCount=0;
		
		return deleteRowCount;
	}
}