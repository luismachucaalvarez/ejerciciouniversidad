<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Universidad San Bernardo</title>

<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/styles.css">


</head>
<body class="login-body">
	<!-- Navbar -->
<nav class="navbar navbar-expand-md navbar-dark bg-dark">

	<!-- Collapse button -->
	<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#basicExampleNav12"
	  aria-controls="basicExampleNav12" aria-expanded="false" aria-label="Toggle navigation">
	  <span class="navbar-toggler-icon"></span>
	</button>
  
	<!-- Links -->
	<div class="collapse navbar-collapse justify-content-center" id="basicExampleNav12">
  
	  <!-- Right -->
	  <ul class="navbar-nav">
		<li class="nav-item">
		  <a href="facultades" class="nav-link waves-effect">
			Facultades
		  </a>
		</li>
		<li class="nav-item">
		  <a href="investigadores" class="nav-link waves-effect">
			Investigadores
		  </a>
		</li>
		<li class="nav-item pl-2 mb-2 mb-md-0">
			<form action="/logout" method="post">
				<input type="hidden" name="${ _csrf.parameterName }" value="${ _csrf.token }">
				<button>Cerrar Sesion</button>
			</form>
		</li>
	  </ul>
  
	</div>
	<!-- Links -->
  
  </nav>
  <!-- Navbar -->

	<div class="container ">
		<div class="jumbotron">
	  		<h1 class="display-4">Bienvenido al sistema de asignación de académicos</h1>
	  		<p class="lead">Favor indique adonde desea ir en la barra superior del menú</p>
	  		<hr class="my-4">
	  		
		</div>
	</div>
	
	
</body>
</html>