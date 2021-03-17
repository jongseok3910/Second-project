package com.itwill.shop.service;

import java.util.ArrayList;

import com.itwill.shop.dao.MembersDao;
import com.itwill.shop.dao.MembersDaoImpl;
import com.itwill.shop.domain.Members;
import com.itwill.shop.domain.exception.ExistedMembersException;
import com.itwill.shop.domain.exception.MembersNotFoundException;
import com.itwill.shop.domain.exception.PaswordMismatchException;


/*
 * - 회원관리 비즈니스로직(예외처리,트랜젝션,보안,로깅)을 수행하는 클래스
 * - 웹컴포넌트(서블릿,JSP)에서 직접접근(메쏘드호출)하는 클래스(객체)
 * - Dao를 이용해서 데이타베이스를 조작작업하는 클래스
 */
public class MembersService {
	
	private MembersDao memberDao;
	
	
	public MembersService() throws Exception{
		memberDao=new MembersDaoImpl() {
			
			@Override
			public Members findMember(String email) throws Exception {
				// TODO Auto-generated method stub
				return null;
			}
		};
		//System.out.println("MembersService()생성자 : " + this);
	}
	
	
	/*
	 * 회원가입
	 */
	public int create(Members member) throws Exception, ExistedMembersException {		
		// 1.이메일중복체크
		if (memberDao.existedMember(member.getMembers_email())) {
			throw new ExistedMembersException(member.getMembers_email()+ " 는 이미 존재하는 이메일입니다.");
			
		}
		return memberDao.create(member);
	}
	/*
	 * 회원로그인
	 */
	public Members login(String email,String password) throws Exception{
		Members member=memberDao.findMember(email);
		if (member==null) {
			throw new MembersNotFoundException(email+" 은 존재하지 않는 이메일입니다.");			
		}
		//2.패스워드 일치여부
		if (!member.isMatchPassword(password)) {
			throw new PaswordMismatchException("비밀번호가 일치하지않습니다.");
		}		
		return member;
	}
	/*
	 * 회원전체리스트
	 */
	public ArrayList<Members> findMembers() throws Exception{
		return memberDao.findMembersList();
	}/*
	 * 회원1명보기
	 */
	public Members findMember(String email) throws Exception{
		Members findMember=memberDao.findMember(email);
		return findMember;		
	}
	/*
	 * 회원수정
	 */
	public int update(Members member) throws Exception{
		return memberDao.update(member);
	}
	/*
	  * 회원탈퇴
	  */
	public int remove(String email) throws Exception{
		return memberDao.remove(email);
	}
	

}
