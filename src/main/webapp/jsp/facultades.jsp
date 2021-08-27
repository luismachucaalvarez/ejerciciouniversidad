<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/styles.css">
<script src="js/jquery.js"></script>

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
			  <a href="/facultades" class="nav-link waves-effect">
				Facultades
			  </a>
			</li>
			<li class="nav-item">
			  <a href="/investigadores" class="nav-link waves-effect">
				Investigadores
			  </a>
			</li>
			<li class="nav-item pl-2 mb-2 mb-md-0">
				<form action="/logout" method="post">
					<input type="hidden" name="${ _csrf.parameterName }" value="${ _csrf.token }">
					<button>Cerrar Sesión</button>
				</form>
			</li>
		  </ul>
	  
		</div>
		<!-- Links -->
	  
	  </nav>
	  <!-- Navbar -->
<div class="container">
	<h2 class="text-center">Lista facultades</h2>

<a href="crearfacultad">Crear nuevo</a>
<table class="table table-primary table-striped" data-toggle="table">
	<thead>
		<tr>
			<th>Nombre</th>
			<th>Acciones</th>
		</tr>
	</thead>
	<tbody>
	<c:forEach items="${listaFacultades }" var="fac">
	
		<tr>
			
			<td>
				<c:out value="${ fac.nombre }"/>
			</td>
			<td>
				<a href="modificarfacultad/${fac.id }">Modificar</a> | <a href="eliminarfacultad/${fac.id } " onclick="return confirm('Â¿Seguro que desea eliminar a esta facultad?');">Eliminar</a>
			</td>
		</tr>
	</c:forEach>
	</tbody>
</table>
</div>
</body>
</html>