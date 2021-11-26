<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<style>
.main_common {
	display: inline-block;
	width: 300px;
	height: 100px;
}

h3 {
	margin-left: 4em
}
</style>
</head>
<body>
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

	<div class="container">
		<div>
			<h1 class="text-center mt-5 mb-5">가위 / 바위 / 보 중 하나를 선택하세요</h1>
		</div>

		<div class="container">
			<div class="main_1 main_common ml-3 mr-5">
				<img src="image/sss.png" class="card-img-top" alt="...">
				<h3>
					가위<input type="radio"
						style="width: 20px; height: 20px; border: 1px;" name="rsp">
				</h3>
			</div>
			<div class="main_2 main_common mr-5">
				<img src="image/rrr.png" class="card-img-top" alt="...">
				<h3>
					바위<input type="radio"
						style="width: 20px; height: 20px; border: 1px;" name="rsp">
				</h3>
			</div>
			<div class="main_3 main_common ">
				<img src="image/ppp.png" class="card-img-top" alt="...">
				<h3>
					보<input type="radio"
						style="width: 20px; height: 20px; border: 1px;" name="rsp">
				</h3>
			</div>
		</div>

		<div class="row mt-3">
			<div class="col text-center">
				<button type="button"
					class="btn btn-primary btn-lg mt-lg-5 text-center">Game
					Start</button>
			</div>
		</div>

	</div>

</body>
</html>