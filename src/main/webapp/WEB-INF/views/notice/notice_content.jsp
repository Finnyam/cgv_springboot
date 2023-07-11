<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MYCGV</title>
<link rel="stylesheet" href="http://localhost:9000/css/mycgv_jsp.css">
</head>
<body>
	<!-- header -->
	<!-- <iframe src="http://localhost:9000/_jsp/header.jsp"
			scrolling="no" width="100%" height="149px" frameborder=0></iframe> -->
	<jsp:include page="../header.jsp"></jsp:include>
	
	<!-- content -->
	<div class="content">
		<section class="notice">
			<h1 class="title">공지사항</h1>
			<table class="notice_content">
				<tr>
					<th>제목</th>
					<td>${notice.ntitle }</td>
				</tr>
				<tr>
					<th>내용</th>
					<td>
						${notice.ncontent }
					</td>
				</tr>
				<tr>
					<th>조회수</th>
					<td>${notice.nhits }</td>
				</tr>
				<tr>
					<th>작성일자</th>
					<td>${notice.ndate }</td>
				</tr>
				<tr>
					<td colspan="2">
						<a href="/notice_list/${page}">
							<button type="button" class="btn_style">리스트</button></a>
						<a href="http://localhost:9000/index.do">
						<button type="button" class="btn_style">홈으로</button></a>
					</td>
				</tr>
			</table>
		</section>
	</div>
	
	<!-- footer -->
	<!-- <iframe src="http://localhost:9000/_jsp/footer.jsp"
			scrolling="no" width="100%" height="500px" frameborder=0></iframe> -->	
	<jsp:include page="../footer.jsp"></jsp:include>
</body>
</html>
















