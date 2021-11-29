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

       h1{
           margin-top: 30px;
           text-align: center;
           margin-bottom: 30px;
       }

       .card-group{
           width: 1000px;           
           margin: 0 auto;
           border: 1px solid #cccccc;
       }
       
       .card-body{
           text-align: center;
       }
       
    </style>
    
    
  </head>

<body>
	<header>
		<nav class="navbar navbar-expand-lg navbar-light bg-light">
			<a class="navbar-brand" href="#">GAME LAND</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup"
				aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarNavAltMarkup">
				<div class="navbar-nav">
					<a class="nav-link active" href="#">Home <span class="sr-only">(current)</span></a>
					<a class="nav-link active" href="main.jsp">가위바위보게임</a> 
                    <a class="nav-link active" href="#">로또</a>
					<a class="nav-link" href="#">공지사항</a>
				</div>
			</div>
		</nav>
	</header>
    
    <main>
        <h1>게임을 선택하세요</h1>
        <div class="card-group">
            <div class="card">              
              <div class="card-body">
              <img src="image/rcp1.jpg" class="card-img-top" alt="...">
                <a href="main.jsp"><button type="submit" class="btn btn-primary " >가위바위보게임</button> </a>          
              </div>
            </div>
            <div class="card">
              <div class="card-body">
              <img src="image/lotto.png" class="card-img-top" alt="...">
                <button type="submit" class="btn btn-primary ">로또</button>
              </div>
            </div>
        </div>
    </main>

	<footer class="text-center"> 
		<hr/>
		<p>&copy; GAME LAND 2021
	
	</footer>
	

</body>
</html>