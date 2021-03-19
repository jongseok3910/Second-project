package com.itwill.shop.dao;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.itwill.shop.dao.mapper.CommentsMapper;
import com.itwill.shop.domain.Comments;

public class CommentsDaoImpl implements CommentsDao {
	
	private SqlSessionFactory sqlSessionFactory;
	public static final String NAMESPACE = "com.itwill.shop.dao.mapper.CommentsMapper.";
	public CommentsDaoImpl() throws Exception{
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
	public Comments findCommentByno(int commentsNo) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		CommentsMapper commentsMapper = sqlSession.getMapper(CommentsMapper.class);
		Comments comments = commentsMapper.findCommentByno(commentsNo);
		return comments;
	}

	@Override
	public List<Comments> findCommentAll(int food_no) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		CommentsMapper commentsMapper = sqlSession.getMapper(CommentsMapper.class);
		List<Comments> commentsList = commentsMapper.findCommentAll(food_no);
		return commentsList;
	}

	@Override
	public int insertComments(Comments comments) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		CommentsMapper commentsMapper = sqlSession.getMapper(CommentsMapper.class);
		int insertRow = commentsMapper.insertComments(comments);
		sqlSession.commit();
		sqlSession.close();
		return insertRow;
	}

	@Override
	public int updateCommentsByNo(Comments comments) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		CommentsMapper commentsMapper = sqlSession.getMapper(CommentsMapper.class);
		int updateRow = commentsMapper.updateCommentsByNo(comments);
		return updateRow;
	}

	@Override
	public int deleteCommentsByNo(int commentsNo) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		CommentsMapper commentsMapper = sqlSession.getMapper(CommentsMapper.class);
		int deleteRow = commentsMapper.deleteCommentsByNo(commentsNo);
		return deleteRow;
	}
	

}
