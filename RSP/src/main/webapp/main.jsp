<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">

    <title>Hello, world!</title>
    <style type="text/css">
       body{
          display: flex;
          flex-direction:column;
          justify-content: space-between;
          height : 100vh;
       }
       
       .card{
			border : none;}
       
    </style>
    
    
  </head>

<body>

	<header>
		<nav class="navbar navbar-expand-lg navbar-light bg-light">
			<a class="navbar-brand" href="#">가위바위보게임</a>
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
		<div class="container text-center">
		<form action="result.jsp" method="get">
			<div class="row">
				<div class="col-md-4 d-flex justify-content-center">
					<div class="card" style="width: 18rem;">
						<img src="image/sss.png" class="card-img-top" alt="...">
						<div class="card-body text-center">
							<div class="form-check">
								<input class="form-check-input" type="radio" name="rsp" id="scissor" value="0"> 
								<label class="form-check-input" for="scissor"></label> 가위
							</div>
						</div>
					</div>
				</div>
				
				<div class="col-md-4 d-flex justify-content-center">
					<div class="card" style="width: 18rem;">
						<img src="image/rrr.png" class="card-img-top mt-2" alt="...">
						<div class="card-body text-center">
							<div class="form-check">
								<input class="form-check-input" type="radio" name="rsp" id="rock" value="1"> 
								<label class="form-check-input"for="rock"></label> 바위
							</div>
						</div>
					</div>
				</div>
				
				<div class="col-md-4 d-flex justify-content-center">
					<div class="card" style="width: 18rem;">
						<img src="image/ppp.png" class="card-img-top mt-4" alt="...">
						<div class="card-body text-center">
							<div class="form-check">
								<input class="form-check-input" type="radio" name="rsp" id="paper" value="2"> 
								<label class="form-check-input" for="paper"></label>보
							</div>
						</div>
					</div>
				</div>
			</div>
				<button type="submit" class="btn btn-primary btn-lg mt-5">GAME START</button>
			</form>
		</div>
	</main>

	<footer class="text-center"> 
		<hr/>
		<p>&copy; GAME LAND 2021
	
	</footer>

</body>
</html>