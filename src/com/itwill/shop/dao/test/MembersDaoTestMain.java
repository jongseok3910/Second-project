package com.itwill.shop.dao.test;

import com.itwill.shop.service.MembersService;

public class MembersDaoTestMain {

	public static void main(String[] args) throws Exception {
		
		MembersService memberService=new MembersService();		
		
		System.out.println(memberService.findMember("test@email.com"));
	}
}
