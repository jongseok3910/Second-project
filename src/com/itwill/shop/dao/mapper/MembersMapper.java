package com.itwill.shop.dao.mapper;

import java.util.ArrayList;
import java.util.List;

import com.itwill.shop.domain.Members;

public interface MembersMapper {
	/*
	 * 인터페이스의 풀네임은 StudentMapper.xml의 namespace와일치
	 * 메쏘드이름은 	StudentMapper.xml 파일의 id와일치
	 * 메쏘드인자타입은 StudentMapper.xml 파일의 parameterType 와일치
	 * 메쏘드리턴타입은 StudentMapper.xml 파일의 resultType 와일치(ResultSet이 한 개 이상일 경우 반환타입이 List이다)
	 */

	public List<Members> selectAll() throws Exception;
	public Members findMembersByNo(int members_no) throws Exception;
	public Members findMembersById(String members_email) throws Exception;
	public int createMembers(Members members) throws Exception;
	
}
