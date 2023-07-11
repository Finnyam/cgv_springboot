<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--
	String sid = (String)session.getAttribute("sid");
	if(sid == null){
		out.write("<script>");
		out.write("alert('정상적인 접근방식이 아닙니다. 로그인을 진행해주세요.');");
		out.write("location.href='http://localhost:9000/login/login.jsp';");
		out.write("</script>");
	}else{
--%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MYCGV</title>
<link rel="stylesheet" href="http://localhost:9000/css/mycgv_jsp.css">
</head>
<body>
	<!-- header -->
	<!-- <iframe src="http://localhost:9000/header.jsp"
			scrolling="no" width="100%" height="149px" frameborder=0></iframe> -->
	<jsp:include page="../header.jsp"></jsp:include>
	
	<!-- content -->
	<div class="content">
		<section class="mypage">
			<h1 class="title">마이페이지</h1>
			<div>
				<article>예매 확인</article>
				<article>정보 수정</article>
			</div>
		</section>
	</div>
	
	<!-- footer -->
	<!-- <iframe src="http://localhost:9000/footer.jsp"
			scrolling="no" width="100%" height="500px" frameborder=0></iframe> -->	
	<jsp:include page="../footer.jsp"></jsp:include>
</body>
</html>

<%-- } --%>

















