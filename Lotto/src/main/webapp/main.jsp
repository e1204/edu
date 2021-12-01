<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<!-- Bootstrap CSS -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
<title>Insert title here</title>
<style type="text/css">

        body{
            display: flex;
            flex-direction:column;
            justify-content: space-between;
            height : 100vh;
        }
       
        .card{
           
            margin-left: 5%;
            margin-right: 5%;
            text-align: center;
        }

</style>
</head>
<body>
<header>
		<nav class="navbar navbar-expand-lg navbar-light bg-light">
			<a class="navbar-brand" href="#">LOTTO</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup"
				aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarNavAltMarkup">
				<div class="navbar-nav">
					<a class="nav-link active" href="#">Home <span class="sr-only">(current)</span></a>
					<a class="nav-link" href="#">게임방법</a> <a class="nav-link" href="#">당첨현황</a>
					<a class="nav-link" href="#">공지사항</a>
				</div>
			</div>
		</nav>
	</header>

    <main>
              
        <div class="card text-center">
            <div class="card-header">
              <ul class="nav nav-tabs card-header-tabs">
                <li class="nav-item">
                  <a class="nav-link active" href="#">시작하기</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">판매점</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">당첨자 인터뷰</a>
                </li>
              </ul>
            </div>
            <div class="card-body">
               <h5 class="card-title"></h5>
              <p class="card-text"><b>당첨조건</b> : 1등 6개, 2등 5개+보너스, 3등 5개, 4등 4개, 5등 3개 일치</p>
              <p class="card-text"><b>판매시간</b> : 토요일 오전 6시~오후 8시, 일~금요일 오전 6시~자정까지</p>
              <p class="card-text"><b>주의사항 : </b>청소년은 복권을 구매하거나 당첨금을 수령할 수 없습니다.
              계속 하시겠다면 추첨하기를 눌러주세요</p>  
              <a href="result.jsp" class="btn btn-primary mt-4">추첨하기</a>
            </div>
          </div>

   
    </main>
    
    

    <footer class="text-center"> 
		<hr/>
		<p>&copy; GAME LAND 2021
	
	</footer>
 
</body>
</html>