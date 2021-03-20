<%@page import="com.itwill.shop.service.MembersService" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<html xmlns="http://www.w3.org/1999/xhtml" lang="ko">
<%@ include file="../include/head.jsp"%>
<body style="">
	<%@ include file="../include/top.jsp"%>  
	<div class="indiv" style="margin: 0 auto; width: 1100px;">
	
		<!------------------------------------ 아이디 찾기 ---------------------------------------->

		<div class="hundred logborder">
			<div class="innertit">
				<p>아이디/비밀번호 찾기</p>
				<span style="color: #f0301b; font-weight: 500; text-align: left !important;">아이디 찾기</span>
			
				
			</div>
			<form method="post" action="memberLoginAction.do" id="form"
				name="form">
				<div class="idsave">
					<p style="margin-bottom: 7px;">
						<input type="text" name="memberId" onfocus="this.value='';" value="" placeholder="핸드폰번호를 입력하세요." class="txtborder">	
					</p>	
					
					<input type="submit" onclick="isSuccess();"
                  style="width: 230px; background: #344336; color: #fff; display: inline-block; line-height: 45px; text-align: center; font-size: 20px; margin-right: 10px; 
                  cursor: pointer;" value="아이디 찾기">
         

				</div>
			</form>
		</div>
		
		
		<!------------------------------------ 비밀번호 찾기 ---------------------------------------->
		
		<div class="hundred logborder">
			<div class="innertit">
		     <span style="color: #f0301b; font-weight: 500; text-align: left !important;">비밀번호 찾기</span>
			
			</div>
			<form method="post" action="memberLoginAction.do" id="form"
				name="form">
				<div class="idsave">
					<p style="margin-bottom: 7px;">
						<input type="text" name="memberId" onfocus="this.value='';" value="" placeholder="이메일을 입력하세요." class="txtborder">		
					</p>
						
					<input type="submit" onclick="isSuccess();"
                  style="width: 230px; background: #344336; color: #fff; display: inline-block; line-height: 45px; text-align: center; font-size: 20px; margin-right: 10px; 
                  cursor: pointer;" value="비밀번호 찾기">


				</div>
			</form>
		</div>
	</div>
	<%@ include file="../include/bottom.jsp"%>
</body>
</html>