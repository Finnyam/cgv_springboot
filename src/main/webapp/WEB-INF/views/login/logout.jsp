<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String sid = (String)session.getAttribute("sid");
	if(sid != null){
		session.invalidate();
	}
	
	out.write("<script>");
	out.write("alert('로그아웃에 성공하셨습니다');");
	out.write("location.href='http://localhost:9000/index.jsp';");
	out.write("</script>");
%>
