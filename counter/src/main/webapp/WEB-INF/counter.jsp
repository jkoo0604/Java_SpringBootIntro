<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Current Visit Count</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
	<div class="container">
		<h2>You have visited <a href="/">here</a> <c:out value="${counter}"/> times.</h2>
		<h2><a href="/">Test another visit?</a></h2>
		<a href="/reset"><button type="button">Reset Counter</button></a>
	</div>
</body>
</html>