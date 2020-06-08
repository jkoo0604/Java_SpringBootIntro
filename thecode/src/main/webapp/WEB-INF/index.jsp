<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Enter the Code</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
	<div class="container">
		<p class="errormsg"><c:out value="${error}"/></p>
		<h3 class="title">What is the code?</h3>
		<form method="POST" action="/login">
			<input type="text" placeholder="Enter the code here" name="code">
			<button type="submit">Try Code</button>
		</form>
	</div>
</body>
</html>