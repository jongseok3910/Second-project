package com.itwill.shop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


import com.itwill.shop.domain.Members;

public interface MembersDao {	
	
	int create(Members member) throws Exception;
	
	Members findMember(String email) throws Exception;	
	
	ArrayList<Members> findMembersByNo(int no) throws Exception;
	ArrayList<Members> findMembersList() throws Exception;
	
	int update(Members member) throws Exception;
	
	int delete(int no)throws Exception;
	
	int remove(String email) throws Exception;
	
	

	public default boolean existedMember(String email) throws Exception{
		boolean isExist=false;
		
		return isExist;
	}

}
