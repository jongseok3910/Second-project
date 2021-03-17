<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%
	SimpleDateFormat format = new SimpleDateFormat ("HH");
	String format_time = format.format (System.currentTimeMillis());
%>
<script type="text/javascript">
	function ck() {
		alert("로그인이 필요한 서비스 입니다.");
	}
</script>				
<div id="header">
	<a name="top"></a>
	<div id="header_main">
		<div id="tlogo">
			<div class="top_logo" style="margin-left:350px;">
				<a href="main.do">
				<img src="./res/mac_logo.png" width="191px"></a>
			</div>

			<div class="tarea3">
				<ul>
					<li>
						<a href="">로그인</a>	
					</li>
					<li>
						<a href="">회원가입</a>
					</li>
					<li>
						<a href="">마이페이지</a>
					</li>
					<li>
						 <a href="">장바구니</a>
					</li>
					<li>
						<a href="">고객후기</a>
					</li>
				</ul>
			</div>
		</div>
	</div>
	<div id="header_main_2">
		<div class="inner">
		<%if(!(Integer.parseInt(format_time) >= 6 && Integer.parseInt(format_time) <= 10)){ %>
			<ul>
				<li class="sm11"><a href="">추천메뉴</a></li>
				
				<li class="sm12"><a href="">버거/세트</a></li>
				
				<li class="sm13"><a href="">스낵/사이드</a></li>
				
				<li class="sm14"><a href="">음료</a></li>
			</ul>
		<%}else{ %>
			<ul>
				<li class="sm11"><a href="">추천메뉴</a></li>
				
				<li class="sm12"><a href="">아침 버거/세트</a></li>
				
				<li class="sm13"><a href="">아침 스낵/사이드</a></li>
				
				<li class="sm14"><a href="">음료</a></li>
			</ul>
		<%} %>
		</div>
	</div>
</div>