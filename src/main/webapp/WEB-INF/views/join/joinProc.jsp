<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "com.mycgv_jsp.vo.MemberVo" %>   
<%@ page import = "com.mycgv_jsp.dao.MemberDao" %>   
 
<jsp:useBean id="memberVo" class="com.mycgv_jsp.vo.MemberVo"  /> 
<jsp:setProperty property="*" name="memberVo"/>  

<%
	MemberDao memberDao = new MemberDao();
	int result = memberDao.insert(memberVo);
	if(result == 1){
		//alert 창을 띄우려면 
		out.write("<script>");
		out.write("alert('회원가입 성공!!');");
		out.write("location.href = 'http://localhost:9000/login/login.jsp'");
		out.write("</script>");
		
		//response.sendRedirect("http://localhost:9000/login/login.jsp?jresult=1");
	}
%> 









