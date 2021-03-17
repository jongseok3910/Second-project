<%@page import="java.time.LocalDate"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html xmlns="http://www.w3.org/1999/xhtml" lang="ko">
<%@ include file="../include/head.jsp"%>
<body style="">
	<%@ include file="../include/top.jsp"%>

	<div id="content">
		<style>
#pos_scroll {
	position: absolute;
	top: 315px;
}
</style>
		<!-- 상단이미지 || 현재위치 -->
		<div class="atit">
			<p>주문성공</p>
			<span class="path"><img src="./res/ico_home.gif" alt="HOME"
				style="cursor: pointer;"> 주문성공</span>
		</div>


		<div class="indiv" style="margin: 0">
			<!-- Start indiv -->
			<p style="margin-bottom: 35px;">
				<img src="./res/order_complete.gif">
			</p>

			<p style="font-size: 17px; margin-bottom: 10px;">주문정보</p>
			<table width="100%" border="0" cellpadding="0" cellspacing="0"
				class="tableview2" style="margin-bottom: 20px;">
				<tbody>
					<tr>
						<th>주문번호</th>
						<td>1</td>
					</tr>
					<tr>
						<th>주문자명</th>
						<td>홍길동</td>
					</tr>
					<tr>
						<th>주문일자</th>
						<td>2021-02-02</td>
					</tr>
					<tr>
						<th>주문금액</th>
						<td>500000</td>
					</tr>
				</tbody>
			</table>



			<div style="width: 100%; text-align: center; padding-bottom: 50px">
				<a href="main.do"><img
					src="./res/btn_confirm.gif" border="0" ></a>
			</div>

		</div>
		<!-- End indiv -->

	</div>

	<%@ include file="../include/bottom.jsp"%>
</body>
</html>