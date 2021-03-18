<%@page import="java.text.DateFormat"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.List"%>
<%@page import="com.itwill.shop.domain.Comments"%>
<%@page import="com.itwill.shop.service.CommentsService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%
	DateFormat df = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
	CommentsService commentsService = new CommentsService();
	List<Comments> commentsList = commentsService.findCommentAll();
%>

<script type="text/javascript">
</script>

<body style="">
	<div id="content">

		<style>
#pos_scroll {
	position: absolute;
	top: 315px;
}
</style>
		<!-- 상단이미지 || 현재위치 -->
		<div class="atit">
			<p>고객후기</p>
			<span class="path">
		</div>



		<div class="indiv" style="margin: 0;">
			<!-- Start indiv -->

			<form name="frmList" action="boardListView.do" method="POST">
				<input type="hidden" name="sort" value="1"> <input
					type="hidden" name="page_num" value="10">

				

				

				<table width="100%" border="0" cellspacing="0" cellpadding="0"
					style="clear: both;" class="listtablen">
					<tbody>
						<tr>
							<th width="50">번호</th>
							<th width="100">프로필</th>
							<th>내용</th>
							<th width="80">작성자</th>
							<th width="80">작성일</th>
							<th width="80">평점</th>
						</tr>
					</tbody>
				</table>

				<!-- 게시판 표시 시작 -->
				<% 
				int count=1;
				for (Comments comments : commentsList) {%>
				<div>
					<table width="100%" cellpadding="0" cellspacing="0"
						style="border-top: none; cursor: pointer;" class="listtablen"
						>
						<tbody>
							<tr>
								<td width="50" align="center"><%=count %></td>
								<td width="100" align="center" style="padding: 10px 0;">
								<a href="">
									<img src="./image/comments/comments.jpg" width="70"/></a></td>
								<td>
									<table cellpadding="0" cellspacing="0" border="0"
										style="border: none;">
										<tbody>
										
											<tr>
												<td style="padding-top: 5px; border: none; height: auto; text-align: left; color: #333;">
													<a href="">		
													<%= comments.getComments_title() %>
													</a>		
												</td>
											</tr>
											<tr>
												<td style="padding-top: 5px; padding-bottom: 5px; border: none; height: auto; text-align: left;">
													<a href="">
													</a>
												</td>
											</tr>
										
										</tbody>
									</table>
								</td>
								<td width="80" align="center"><%=comments.getComments_writer()%></td>
								<td width="80" align="center"><%=df.format(comments.getComments_date()) %></td>
								<td width="80" style="color: #744134;">
									<%
										String evalStr = "";
									switch(comments.getComments_star()) {
									case 1:
										evalStr = "★☆☆☆☆";
										break;
									case 2:
										evalStr = "★★☆☆☆";
										break;
									case 3:
										evalStr = "★★★☆☆";
										break;
									case 4:
										evalStr = "★★★★☆";
										break;
									case 5:
										evalStr = "★★★★★";
										break;
										
									}
									%>
									<%= evalStr %>
								</td>
								
							</tr>
						</tbody>
					</table>
				</div>
				<%count++; } %>
				<!-- 게시판 표시 종료 -->



			</form>

			<div class="pagediv" style="margin-top: 20px; position: relative; text-align: center;"> 
			
			<% 
			count=1;
			for (Comments comments : commentsList) { %>
				<a href="boardListView.do?boardNo=<%= comments.getComments_no() %>" class="navi">페이징[<%=count %>]</a>
			<% count++;} %>

			</div>
		</div>
		<!-- End indiv -->
		<!-- 검색 : Start 
				<div
					style="border: 1px solid #ccc; text-align: center; padding: 20px 0;">
					<div></div>
					<div style="margin-top: 20px;">
						<span>검색어</span> 
						<select name="searchTitle" class="select" style="background: #fff; height: 28px; font-size: 14px;">
							<option value="title">내용</option>
							<option value="memberId">작성자</option>
						</select> 
						<input type="text" name="keyword" value=""style="width: 230px; padding-left: 10px; border: 1px solid #ccc; height: 26px; line-height: 26px;">
						<input type="image" src="./res/btn_search.gif" onclick="searchKeyword(this)" align="absmiddle">
					</div>
				</div>
		검색 : End -->
				<%@include file="../include/commentWrite.jsp" %>
	</div>
</body>
</html>