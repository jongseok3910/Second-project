package com.itwill.shop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.itwill.shop.domain.Members;

public interface MembersDao {	
	
	public List<Members> selectAll() throws Exception;
	public Members findMembersByNo(int no) throws Exception;
	public Members findMembersById(String members_email) throws Exception;
	public Members findMembersByPassWord(String members_password) throws Exception;
	public int createMembers(Members members) throws Exception;
	public int updateMembers(Members members) throws Exception;
	public int deleteMembers(int members_no) throws Exception;
	
}
