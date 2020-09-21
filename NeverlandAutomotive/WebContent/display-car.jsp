<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">
<head>
  <!-- Required meta tags -->
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
	<title>Inventory</title>
</head>
<body>
<jsp:include page="/DisplayVehiclesServlet"/>
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo03" aria-controls="navbarTogglerDemo03" aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<a class="navbar-brand" href="#">Neverland Automotive</a>
		<div class="collapse navbar-collapse" id="navbarTogglerDemo03">
			<ul class="navbar-nav mr-auto mt-2 mt-lg-0">
				<li class="nav-item active">
					<a class="nav-link" href="index.jsp">Home<span class="sr-only"></span></a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="display-car.jsp">Inventory</a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="add-car.jsp">Add Car</a>
				</li>
			</ul>
			<form class="form-inline my-2 my-lg-0">
				<input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
				<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
			</form>
		</div>
	</nav>
	<div class="jumbotron jumbotron-fluid">
		<div class="container">
    		<h1 class="display-4">Neverland Automotive</h1>
    		<p class="lead">Inventory</p>
		</div>
	</div>
	<c:if test="${cars != null}">
	<c:forEach var="car" items="${cars}">
	<div class="container" style="display: flex;">
		<div class="row row-cols-1 row-cols-md-3">
		<div class="col-lg">
				<div class="card h-100" style="width: 18rem;">
					<img src="${car.image}" class="card-img-top" alt="...">
						<div class="card-body">
							<h5 class="card-title"><c:out value="${car.make} ${car.model}" /></h5>
							<p class="card-text"><c:out value="${car.description}"/></p>
						</div>
						<ul class="list-group list-group-flush">
							<li><h3><span class="badge badge-warning">Used</span></h3></li>
							<li class="list-group-item">Vin: <c:out value="${car.vinNumber}" /></li>
							<li class="list-group-item">Year: <c:out value="${car.year}" /></li>
							<li class="list-group-item">Price: $<c:out value="${car.price}" /></li>
							<li class="list-group-item">Mileage: <c:out value="${car.mileage}" /></li>
							<li class="list-group-item">Battery: <c:out value="${car.battery}" /></li>								<li class="list-group-item">Motor: <c:out value="${car.motor}" /></li>
						</ul>
						<div class="card-body">
							<p class="card-text">
							<small class="text-muted"><c:out value="Days Posted: ${car.daysPosted}" /></small></p>
							<a href="#" class="card-link">I'm interested!</a>
						</div>
				</div>
			</div>
		</div>
	</c:forEach>
	</c:if>
	</div>
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
  </body>
</html>