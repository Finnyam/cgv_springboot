<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MYCGV</title>
<link rel="stylesheet" href="http://localhost:9000/mycgv/css/mycgv.css">
<script src="http://localhost:9000/js/jquery-3.6.4.min.js"></script>
<script src="http://localhost:9000/js/mycgv_jsp_jquery.js"></script>
</head>
<style>
	#update_file {
		border:1px solid white;
		position:relative;
		left:119px;
		top:-29px;
		padding:5px 5px;
		background:white;
	}
</style>
<script >
	$document.ready(function(){
		$("#file1").change(function(){
		if(window.FileReader){
			let fname = $(this)[0].files[0].name;
			$("#update_file").text(fname);
		} 
		});
		//$().on("change",function(){});
	});
</script>
<body>
	<!-- header -->
	<!-- <iframe src="http://localhost:9000/header.jsp"
			scrolling="no" width="100%" height="149px" frameborder=0></iframe> -->
	<jsp:include page="../header.jsp"></jsp:include>
	
	<!-- content -->
	<div class="content">
		<section class="board">
			<h1 class="title">게시판</h1>
			<form name="updateForm" action="board_update_proc.do" method="post" enctype="multipart/form-data">
				<table border=1>
					<tr>
						<th>제목</th>
						<td>
							<input type="text" name="btitle" value="${boardVo.btitle }" id="btitle">
						</td>
					</tr>
					<tr>
						<th>내용</th>
						<td>
							<textarea rows="5" cols="30" name="bcontent">${boardVo.bcontent }</textarea>
						</td>
					</tr>
					<tr>
						<th>작성자</th>
						<td>
							<input type="text" name="id" value="${boardVo.id }" disabled>
							<input type="hidden" name="id" value="${boardVo.id }" >
							<input type="hidden" name="bid" value="${boardVo.bid}" >
						</td>
					</tr>
					<tr>
						<th>파일업로드</th>
						<td>
							<input type="text" name="bfile" value="${boardVo.bfile }">
							<input type="text" name="bsfile" value="${boardVo.bsfile }">
							<input type="file" name="file1" id="file1">
							<c:choose>
								<c:when test="${boardVo.bfile != null}">
									<span id="update_file">${boardVo.bfile}</span>
								</c:when>
								<c:otherwise>
									<span id="update_file">선택된 파일 없음</span>
								</c:otherwise>
							</c:choose>						
						</td>
					</tr>
					<tr>
						<td colspan="2">
							<button type="button" class="btn_style" id="btnBoardUpdate">수정완료</button>
							<button type="reset" class="btn_style">다시쓰기</button>
							<a href="board_content.do?bid=${boardVo.bid}">
								<button type="button" class="btn_style">이전페이지</button></a>
							<a href="board_list.do">
								<button type="button" class="btn_style">리스트</button></a>							
						</td>				
					</tr>
				</table>
			</form>
		</section>
	</div>
	
	<!-- footer -->
	<!-- <iframe src="http://localhost:9000/footer.jsp"
			scrolling="no" width="100%" height="500px" frameborder=0></iframe> -->	
	<jsp:include page="../footer.jsp"></jsp:include>
</body>
</html>
















