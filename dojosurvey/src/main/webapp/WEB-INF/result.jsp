<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dojo Survey Result</title>
<link href="webjars/bootstrap/4.5.0/css/bootstrap.min.css" rel="stylesheet" />
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
	<div class="container">
		<h3>Submitted Info</h3>
		<div class="row">
			<div class="col-sm-3">
				Name:
			</div>
			<div class="col-sm-9">
				<c:out value="${name}"/>
			</div>
		</div>
		<div class="row">
			<div class="col-sm-3">
				Dojo Location:
			</div>
			<div class="col-sm-9">
				<c:out value="${location}"/>
			</div>
		</div>
		<div class="row">
			<div class="col-sm-3">
				Favorite Language:
			</div>
			<div class="col-sm-9">
				<c:out value="${language}"/>
			</div>
		</div>
		<div class="row">
			<div class="col-sm-3">
				Comments:
			</div>
			<div class="col-sm-9">
				<c:out value="${comments}"/>
			</div>
		</div>
		<div class="row">
			<div class="col-sm-12 text-right">
				<a class="btn btn-outline-dark" href="/" role="button">Go back</a>
			</div>
		</div>
	</div>
</body>
</html>