<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/bootstrap.min.css">

</head>
<body>
	<nav class="navbar navbar-expand-md navbar-light">

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
					<button>Cerrar Sesión</button>
				</form>
			</li>
		  </ul>
	  
		</div>
		<!-- Links -->
	  
	  </nav>
	  <!-- Navbar -->
<h2>Listando reservas</h2>

<table>
	<thead>
		<tr>
			<th>Id</th>
			<th>Investigador</th>
			<th>Equipo</th>
			<th>Fecha inicio</th>
			<th>Fecha fin</th>
			<th>Acciones</th>
		</tr>
	</thead>
	<tbody>
	<c:forEach items="${listaReservas }" var="res">
	
		<tr>
			<td>
				<c:out value="${ res.id }"/>
			</td>
			<td>
				<c:out value="${ res.investigadore.nombre } ${ res.investigadore.apellido }"/>
			</td>
			<td>
				<c:out value="${ res.equipo.descripcion }"/>
			</td>
			<td>
				<c:out value="${ res.fechaInicio }"/>
			</td>
			<td>
				<c:out value="${ res.fechaFin }"/>
			</td>
			<td>
				Modificar | Eliminar
			</td>
		</tr>
	</c:forEach>
	</tbody>
</table>
</body>
</html>