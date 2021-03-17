<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ include file="../include/head.jsp"%>

<body >
	<%@ include file="../include/top.jsp"%>
	<script type="text/javascript">	
	</script>

	<form name="form_review" id="form_review">
		<table id="table_after" width="60%" cellpadding="0" cellspacing="0" border="0" style="margin: 0 auto">
			<tbody>
				<tr>
					<td style="border-style: solid; border-width: 10px; border-color: #000000" valign="top">
						<div style="width: 100%; background: #000000; border-bottom: 2px solid #DDDDDD">
							<img src="./res/popup_title_review.gif">
						</div>

						<div style="margin-left: 20px; margin-right: 20px; margin-top: 10px;">

							<div
								style="border-width: 1px; border-style: solid; border-color: #DEDEDE; margin-top: 5px;"
								class="hundred">
								<table width="100%" cellpadding="0" cellspacing="0" border="0">
									<tbody>
										<tr>
											<td
												style="border-width: 3px; border-style: solid; border-color: #F3F3F3; padding: 5px 5px 5px 5px">

												<table width="100%" id="form" cellpadding="5" cellspacing="0" border="0" align="center">
													<colgroup>
														<col width="80">
													</colgroup>
													<input type="hidden" id="boardNo" name="boardNo" value="1" >
													<input type="hidden" id="productNo" name="productNo" value="1" >
													<tbody>
														<tr>
															<td>
																<img src="./" width="70"/>
															</td>
															<td>ABC</td>
														</tr>
														<tr>
															<td colspan="2" height="1" bgcolor="#DEDEDE"
																style="padding: 0px;"></td>
														</tr>
														<tr>
															<td class="input_txt" align="right">평가</td>
															<td class="noline">????</td>
														</tr>
														<tr>
															<td colspan="2" height="1" bgcolor="#DEDEDE"
																style="padding: 0px;"></td>
														</tr>
														<tr>
															<td class="input_txt" id="memberId" align="right">작성자</td>
															<td>ABC</td>
														</tr>
														<tr>
															<td colspan="2" height="1" bgcolor="#DEDEDE"
																style="padding: 0px;"></td>
														</tr>
														<tr>
															<td class="input_txt" align="right">제목</td>
															<td>ABC</td>
														</tr>
														<tr>
															<td colspan="2" height="1" bgcolor="#DEDEDE"
																style="padding: 0px;"></td>
														</tr>
														<tr>
															<td class="input_txt" align="right">내용</td>
															<td>ABCDEFGHIJK</td>
														</tr>
														<tr>
															<td colspan="2" height="1" bgcolor="#DEDEDE" style="padding: 0px;"></td>
														</tr>
													</tbody>
												</table>
										</tr>
									</tbody>
								</table>
							</div>
						</div>
					</td>
					
				</tr>
				<td>
					<div align="center">
						<a href="#" onclick="editBoard()">
						<img src="./res/edit.png"  style="cursor: pointer; vertical-align: bottom;"></a> 
						<img src="./res/btn_order_back.gif" onclick="history.back()" style="cursor: pointer; vertical-align: bottom;">
						<a href="#" onclick="deleteBoard()">
						<img src="./res/CLOSE_Pv_A03.png" style="cursor: pointer; vertical-align: bottom;"></a>
					</div>
					</td>
			</tbody>
		</table>
	</form>
<%@ include file="../include/bottom.jsp"%>
</body>
</html>