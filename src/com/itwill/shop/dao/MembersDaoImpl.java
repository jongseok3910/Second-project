package com.itwill.shop.dao;

import java.io.InputStream;
import java.util.ArrayList;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.itwill.shop.dao.mapper.MembersMapper;
import com.itwill.shop.domain.Members;

/*
 * 이름               널?       유형            
---------------- -------- ------------- 
MEMBERS_NO       NOT NULL NUMBER(10)    
MEMBERS_NAME              VARCHAR2(100) 
MEMBERS_EMAIL             VARCHAR2(100) 
MEMBERS_PASSWORD          VARCHAR2(100) 
MEMBERS_PHONE             NUMBER(10)
 */
public abstract class MembersDaoImpl implements MembersDao {
	private SqlSessionFactory sqlSessionFactory;
	public MembersDaoImpl() throws Exception{
		try {
			InputStream membersConInputStream=Resources.getResourceAsStream("mybatis-config.xml");
			SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
			this.sqlSessionFactory=sqlSessionFactoryBuilder.build(membersConInputStream);			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public int create(Members member) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public ArrayList<Members> findMembersByNo(int no) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ArrayList<Members> findMembersList() throws Exception {
		SqlSession sqlSession=sqlSessionFactory.openSession();
		MembersMapper membersMapper=sqlSession.getMapper(MembersMapper.class);
		ArrayList<Members> membersList=(ArrayList<Members>)membersMapper.selectAll();
		sqlSession.commit();
		sqlSession.close();
		return membersList;
	}
	@Override
	public int update(Members member) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public int delete(int no) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int remove(String email) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
