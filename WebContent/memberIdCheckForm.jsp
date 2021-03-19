<%@ page import="com.itwill.shop.domain.Members"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String sEmail=(String)session.getAttribute("sEmail");
	Members sMember=(Members)session.getAttribute("sMember");
	if(sEmail==null){
		response.sendRedirect("memberWriteAction.jsp");
		return;
	}

%>	
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>아이디 중복 체크</title>
<!-- 
<link rel=stylesheet href="css/styles.css" type="text/css">
<link rel=stylesheet href="css/user.css" type="text/css">
 -->
<style type="text/css">
#wrap {
	width: 490px;
	text-align: center;
	margin: 0 auto 0 auto;
}

#chk {
	text-align: center;
}

#cancelBtn {
	visibility: visible;
}

#useBtn {
	visibility: visible;
}
</style>

<script type="text/javascript">
		
		
		// 이메일 아이디 중복체크
		function emailCheck(){
			var email = document.getElementById("email").value;					
			if (!email) {
				alert("검색할 이메일을 입력하시고 중복체크를 하세요.");
				return false;
			}else{ 
				var param="email="+email
				var url = "memberCheckForm.do?"+param;
				location.href=url;
			}
		}
		
		
		
		// 사용하기 클릭 시 부모창으로 값 전달 
		function sendCheckValue(){
			// 중복체크 결과인 idCheck 값을 전달한다.
			//opener.document.form.idDuplication.value ="idCheck";
			// 회원가입 화면의 ID입력란에 값을 전달
			opener.document.findMember.email.value = document.getElementById("email").value;
			if (opener != null) {
            	opener.chkForm = null;
            	self.close();
            	//window.close();
			}	
		}	
		
	</script>

</head>
<body>
	<div id="wrap">
		<br> <b><font size="4" color="gray">이메일 중복체크</font></b>
		<hr size="1" width="460">
		<br>
		<div id="chk">
			<form id="checkForm">
				<input type="text" name="memberId" id="memberId" value="abc"> <input
					type="button" value="중복확인" onclick="emailCheck()">
			</form>
			<div id="msg">msg</div>
			
			<br> <input id="cancelBtn" type="button" value="취소" onclick="window.close()">
				<%if(true){ %>
				<input id="useBtn" type="button" value="사용하기" onclick="sendCheckValue()">
				<% }%>
		</div>
	</div>
</body>
</html>