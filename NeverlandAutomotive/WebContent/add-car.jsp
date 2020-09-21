<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Neverland Automotive</title>
	<link rel="stylesheet" type="text/css" href="./styles/styles.css">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
	</head>
<body>
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
			</ul>
			<form class="form-inline my-2 my-lg-0">
				<input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
				<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
			</form>
		</div>
	</nav>
	<div class="jumbotron jumbotron-fluid">
		<div class="container">
    		<h1 class="display-4">Have a car you're interested in listing?</h1>
    		<p class="lead">Fill out the form below and we can add it to our inventory!</p>
		</div>
	</div>
	<div class="container-md">
	<form action="CarRegistrationServlet" method="POST">
		<div class="row">
		<div class="col">
			<input name="image" type="text" class="form-control" placeholder="Image">
		</div>
			<div class="col">
				<input name="vinNumber" type="text" class="form-control" placeholder="Vin number">
			</div>
			</div>
			<div class="form-check">
				<input class="form-check-input" type="checkbox" value=""
					id="defaultCheck1"> <label class="form-check-label" for="defaultCheck1"> Used: </label>
			</div>
			<div class="row">
		<div class="col">
			<input name="make" type="text" class="form-control" placeholder="Make">
		</div>
			<div class="col">
				<input name="model" type="text" class="form-control" placeholder="Model">
			</div>
		</div>
		<div class="row">
			<div class="col">
				<input name="year" type="text" class="form-control" placeholder="Year">
			</div>
			<div class="col">
				<input name="mileage" type="text" class="form-control" placeholder="Mileage">
			</div>
		</div>
		<div class="row">
			<div class="col">
				<input name="price" type="text" class="form-control" placeholder="Price">
			</div>
			<div class="col">
				<input name="color" type="text" class="form-control" placeholder="Color">
			</div>
		</div>
		<div class="row">
			<div class="col">
				<input name="battery" type="text" class="form-control" placeholder="Battery">
			</div>
			<div class="col">
				<input name="motor" type="text" class="form-control" placeholder="Motor">
			</div>
		</div>
		<div class="form-group">
			<label for="exampleFormControlTextarea1"></label>
			<textarea name="description" class="form-control" id="exampleFormControlTextarea1" rows="3" placeholder="Description"></textarea>
			</div>
			<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Submit</button>
	</form>
	</div>
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
	
</body>
</html>