<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ninja Gold</title>
<link href="webjars/bootstrap/4.5.0/css/bootstrap.min.css" rel="stylesheet" />
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-sm-3">Your Gold:</div>
			<div class="col-sm-9">
				<p class="score"><c:out value="${score}"/></p>
				
			</div>
		</div>
		<div class="row flex-nowrap d-flex justify-content-around align-items-center">
			<div class="col location">
				<p class="placename">Farm</p>
				<p class="scorerange">(earns 10-20 golds)</p>
				<form action="/processgold" method="POST">
					<input name="location" value="farm" type="hidden">
					<button class="btn btn-dark shadow" type="submit">Find Gold</button>
				</form>
			</div>
			<div class="col location">
				<p class="placename">Cave</p>
				<p class="scorerange">(earns 5-10 golds)</p>
				<form action="/processgold" method="POST">
					<input name="location" value="cave" type="hidden">
					<button class="btn btn-dark shadow" type="submit">Find Gold</button>
				</form>
			</div>
			<div class="col location">
				<p class="placename">House</p>
				<p class="scorerange">(earns 2-5 golds)</p>
				<form action="/processgold" method="POST">
					<input name="location" value="house" type="hidden">
					<button class="btn btn-dark shadow" type="submit">Find Gold</button>
				</form>
			</div>
			<div class="col location">
				<p class="placename">Casino</p>
				<p class="scorerange">(earns/takes 0-50 golds)</p>
				<form action="/processgold" method="POST">
					<input name="location" value="casino" type="hidden">
					<button class="btn btn-dark shadow" type="submit">Find Gold</button>
				</form>
			</div>
		</div>
		<div class="row activity">
			<div class="col">
			Activities:
			</div>
		</div>
		<div class="row">
			<div class="col activitycontent">
				<c:out value="${activitystr}" escapeXml="false"/>
			</div>
		</div>
	</div>
</body>
</html>