<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- <h1>sub.jsp 페이지 입니다.</h1> -->
	<%! String id, pw; %>
	<%
		id = request.getParameter("id");
		pw = request.getParameter("pw");
	%>
	
	<h1>sub.jsp 입니다.</h1>
	아이디 : <%= id %> <br>
	비밀번호 : <%= pw %>


</body>
</html>