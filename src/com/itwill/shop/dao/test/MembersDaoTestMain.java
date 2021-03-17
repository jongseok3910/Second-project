package com.itwill.shop.dao.test;

import com.itwill.shop.domain.Members;
import com.itwill.shop.service.MembersService;

public class MembersDaoTestMain {

	public static void main(String[] args) throws Exception {
		
		MembersService memberService=new MembersService();		
		
//		System.out.println(memberService.findMembersById("mac123@google.com"));
//		System.out.println(memberService.findMembersByNo(1));
//		System.out.println(memberService.selectAll());
		
		Members members = new Members(0, "김복자", "k9@kkk.kkk", "1234", "01024546788");
		memberService.createMembers(members);
	}
}
