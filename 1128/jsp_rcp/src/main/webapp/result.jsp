<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="edu.kosmo.ex.RSP"%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<style>
       .container1{
            overflow: hidden;
            margin-top: 200px;

        }     
        
        .container2{
            overflow: hidden;
            margin-top: 50px;

        }  

        .u, .c {
            width: 50%;
            display: inline;
            float: left;
            text-align: center;          
        }

        .user, .com{
            font-size: 3em;
        }

        
        .w, .l {
            width: 50%;
            display: inline;
            float: left;
            text-align: center;   
            font-family: fantasy;       
        }

        .user1, .com1, .d1{
            font-size: 8em;
        }

       .d{
      
            text-align: center;       
            font-family: fantasy;   
       
       }

       .bu{
           text-align: center;
           margin-top: 70px;
           margin-bottom: 70px;
       }
     
</style>
</head>
<body>

<%
				
				String rsp = request.getParameter("rsp");
				
				RSP me = new RSP();
				RSP com = new RSP(rsp); 
				
				String rock = request.getParameter("rock");
				String scissor = request.getParameter("scissor");
				String paper = request.getParameter("paper");
%>
	

  <div class="container1">
        <div class="u">
            <h3 class="user">USER</h3>
        </div>
        <div class="c">
            <h3 class="com">COM</h3>
        </div>
    </div>
    <hr>

    <div class="container2">
        <div class="w">
            <h3 class="user1">W I N</h3>
        </div>
        

        <div class="l">
            <h3 class="com1">L O S E</h3>
        </div> 
       
    </div>
    <hr>
    
    
  
    <div class="container3">
        <div class="w">
            <h3 class="user1">L O S E</h3>
        </div>

        <div class="l">
            <h3 class="com1">W I N</h3>
        </div>
    </div>
   
    
  



    <div class="container4">
        <div class="d">
            <h3 class="d1">D R A W</h3>
        </div>       

    </div>

   
    

    <div class="bu">
        <button type="button" class="btn btn-primary btn-lg mt-lg-5 ">계속하기</button>    
        <button type="button" class="btn btn-info btn-lg mt-lg-5 ">그만하기</button>    
    </div>
  

</body>
</html>