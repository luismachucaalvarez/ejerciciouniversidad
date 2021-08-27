<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/styles.css">
</head>
	<body class="login-body">
		<div class="container">
		  <div class="row">
			<div class="col-sm-9 col-md-7 col-lg-5 mx-auto">
			  <div class="card border-0 shadow rounded-3 my-5">
				<div class="card-body p-4 p-sm-5">
				  <h5 class="card-title text-center mb-5 fw-light fs-5">Sign In</h5>
				  <form action="/login" method="post">
					<div class="form-floating mb-3">
						<input type="text" class="form-control" id="floatingInput" placeholder="Usuario" name="username">
						<label for="floatingInput">Usuario</label>
					</div>
					<div class="form-floating mb-3">
					  <input type="password" class="form-control" id="floatingPassword" placeholder="Contraseña" name="password">
					  <label for="floatingPassword">Contraseña</label>
					</div>
					<input type="hidden" name="${ _csrf.parameterName}" value="${ _csrf.token }">

	  
					<div class="form-check mb-3">
					  <input class="form-check-input" type="checkbox" value="" id="rememberPasswordCheck">
					  <label class="form-check-label" for="rememberPasswordCheck">
						Remember password
					  </label>
					</div>
					<div class="d-grid">
					  <button class="btn btn-primary btn-login text-uppercase fw-bold" type="submit">Sign
						in</button>
					</div>
					<hr class="my-4">
				  </form>
				  <c:if test="${ param.error != null }">
					<p>Datos Incorrectos</p>
				</c:if>
				</div>
			  </div>
			</div>
		  </div>
		</div>
	  </body>
</html>