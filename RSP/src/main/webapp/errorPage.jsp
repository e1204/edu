<%@page import="edu.kosmo.ex.Player"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>  
<% response.setStatus(200); %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <!-- Bootstrap CSS -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
<style>
	 
	 body{
        text-align : center;
      }
   
    h1{
        line-height: 1500%;
    }

   .text{
        height: 300px;     
    }

</style>

</head>
<body>
	<form action=main.jsp>
	
        <h1 class="text">가위 바위 보 중 하나를 선택하세요</h1>
        <button type="submit" class="btn btn-primary mt-5">선택하기</button>
        
    </form>
</body>
</html>