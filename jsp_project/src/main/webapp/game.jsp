<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
       .user{          
        display: inline;
       }

       .com{
           display: inline;
       }
     
       .result{
           border: 1px solid gray;           
           margin-left: 20%;
           margin-right: 20%;
           margin-top: 70px;
       }

      .button{
          margin-top: 100px;
          text-align: center;
      }

      .text{
          display: inline;
      }

      .f1{
        display: inline;
        margin-left: 300px;

      }

      .f2{
        display: inline;
        margin-left: 36%;
      }

      .button{
          margin-top: 100px;
      }
     
</style>
</head>
<body>

	<div class="user">  
        <img src="win.png" alt="" style="width: 20%; margin-left: 20%; margin-top: 4%;">         
    </div>

    <div class="com">
        <img src="win.png" alt="" style="width: 20%; margin-left: 20%; margin-top: 4%;"> 
    </div>
    <p></p>
    <div class="text">
        <h4 class="f1">USER</h4>
        <h4 class="f2">COM</h4>
    </div>
	
	
    <div class="result">
       <h1 class="text-center">D R A W</h1> 
    </div>

    <div class="result">
        <h1 class="text-center">W I N</h1> 
     </div>

     <div class="result">
        <h1 class="text-center">L O S E</h1> 
     </div>
    
    <div class="button">
        <button type="button" class="btn btn-primary">계속하기</button>
        <button type="button" class="btn btn-secondary">그만하기</button>
    </div>

</body>
</html>