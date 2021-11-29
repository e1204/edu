<%@page import="edu.kosmo.ex.Player"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page errorPage="errorPage.jsp" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
<style type="text/css">
        body {
            height: 100vh;
            display: flex;
            flex-direction: column;
            justify-content: space-between;

        }

        .re{
            font-size: 5em;
        }

        .rsp{
            overflow: hidden;
        }

        .me{
            width: 33%;
            text-align: center;            
            float: left;
            font-size: 3em;
        }

        .res{
            width: 33%;
            text-align: center;
            float: left;
            font-size: 3em;
        }

        .com{
            width: 33%;
            text-align: center;
            float: left;
            font-size: 3em;
        }
        
        .result{
            margin-bottom: 40px;
        }
    </style>
   
</head>
<body>
<%
	
   int rsp = Integer.valueOf(request.getParameter("rsp").trim());
   
   System.out.println(rsp);
   
   Player computer = new Player();
   Player your = new Player(rsp);
   
   System.out.println(computer.result(your));

%>

	<header>
		<nav class="navbar navbar-expand-lg navbar-light bg-light">
			<a class="navbar-brand" href="start.jsp">가위바위보게임</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup"
				aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarNavAltMarkup">
				<div class="navbar-nav">
					<a class="nav-link active" href="#">Home <span class="sr-only">(current)</span></a>
					<a class="nav-link" href="#">게임방법</a> <a class="nav-link" href="#">게임순위</a>
					<a class="nav-link" href="#">공지사항</a>
				</div>
			</div>
		</nav>
	</header>
	
	<main>
		
		<div class="result">
            <h1 class="re text-center"><%=computer.result(your) %></h1>
           
        </div>
  			
            <div class="rsp">
                <hr>
                <div class="me mt-5 mb-5">
                	<%if(your.getStringRSP().equals("가위")){ %>
                	<img src="image/sss.png">
                	<%} else if(your.getStringRSP().equals("바위")){ %>
                 	<img src="image/rrr.png">
                    <%} else if(your.getStringRSP().equals("보")) {%>   
                    <img src="image/ppp.png">
                    <%}  %>                               
                </div>

                <div class="res mt-5 mb-5 text-muted">
                    결과
                </div>

                <div class="com mt-5 mb-5">                    
                     <%if(computer.getStringRSP().equals("가위")){ %>
                	<img src="image/sss.png">
                	<%} else if(computer.getStringRSP().equals("바위")){ %>
                 	<img src="image/rrr.png">
                    <%} else if(computer.getStringRSP().equals("보")) {%>   
                    <img src="image/ppp.png">
                    <%}  %>   
                </div>              
            </div>
       
        <hr>
        <div class="col text-center">
            <a href="main.jsp"><button type="submit" class="btn btn-primary mt-5 text-center"> 계속하기</button></a>
            <a href="jcplotto.jsp"><button type="submit" class="btn btn-primary mt-5 text-center">그만하기</button>
        </div>
    </main>

   
	
	<footer class="text-center"> 
		<hr/>
		<p>&copy; GAME LAND 2021
	
	</footer>


</body>
</html>