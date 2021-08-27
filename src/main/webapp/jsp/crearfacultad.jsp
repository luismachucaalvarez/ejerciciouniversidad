<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/styles.css">

</head>
<body class="login-body">
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
					<button>Cerrar Sesi�n</button>
				</form>
			</li>
		  </ul>
	  
		</div>
		<!-- Links -->
	  
	  </nav>
	  <!-- Navbar -->

	<div class="container">
		<div class="row">
		  <div class="col-sm-9 col-md-7 col-lg-5 mx-auto">
			<div class="card border-0 shadow rounded-3 my-5">
			  <div class="card-body p-4 p-sm-5">
				<h5 class="card-title text-center mb-5 fw-light fs-5">Ingreso nueva facultad</h5>
				<div class="form-floating mb-3">
					<form:form action="/guardarFacultad" method="post" modelAttribute="facultad">
						<form:hidden path="id" />

						<form:input class="form-control" id="floatingInput" placeholder="Nombre facultad" path="nombre" />
						<form:errors path="nombre" />
				</div>
				  <div class="d-grid">
					  <form:button class="btn btn-primary btn-login text-uppercase fw-bold" id="agregar-facultad">Agregar</form:button>
					</form:form>

				  </div>
				  <hr class="my-4">
				  <a href="/facultades">Volver</a>

			  </div>
			</div>
		  </div>
		</div>
	  </div>
	<br>	
</body>
</html>