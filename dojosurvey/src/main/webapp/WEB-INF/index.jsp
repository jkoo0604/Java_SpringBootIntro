<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dojo Survey Index</title>
<link href="webjars/bootstrap/4.5.0/css/bootstrap.min.css" rel="stylesheet" />
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
	<div class="container">
		<form method="POST" class="surveyform" action="/postsurvey">
			<div class="col-sm-12 error">
  				<c:out value="${error}"/>
  			</div>
			<div class="form-group row">
    			<label for="name" class="col-sm-2 col-form-label">Name:</label>
    			<div class="col-sm-10">
      				<input type="text" class="form-control" id="name" name="name">
    			</div>
  			</div>
  			<div class="form-group row">
  				
    			<label for="location" class="col-sm-2 col-form-label">Dojo Location:</label>
    			<div class="col-sm-10">
      				<select id="location" class="form-control" name="location">
        				<option value="na" selected>Choose...</option>
        				<option value="San Jose">San Jose</option>
        				<option value="Seattle">Seattle</option>
        				<option value="Burbank">Burbank</option>
        				<option value="Orange County">Orange County</option>
      				</select>
    			</div>
  			</div>
  			<div class="form-group row">
    			<label for="langauge" class="col-sm-2 col-form-label">Favorite Language:</label>
    			<div class="col-sm-10">
      				<select id="language" class="form-control" name="language">
        				<option value="na" selected>Choose...</option>
        				<option value="Python">Python</option>
        				<option value="Java">Java</option>
        				<option value="C#">C#</option>
        				<option value="Other">Other</option>
      				</select>
    			</div>
  			</div>
  			<div class="form-group row">
    			<label for="comments" class="col-sm-12 col-form-label">Comments (optional):</label>
    			<div class="col-sm-12">
      				<textarea name="comments"></textarea>
    			</div>
  			</div>
  			<button class="btn btn-dark" type="submit">Submit</button>
		</form>
	</div>
</body>
</html>