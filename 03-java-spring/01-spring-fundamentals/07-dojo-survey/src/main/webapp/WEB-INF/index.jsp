<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/style.css"/>
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
	<title>Dojo Survey Index</title>
</head>
<body>
	<form method="POST" action="/result">
		<label for="name">Your Name:</label>
		<input type="text" name="name">
		<label for="dojolocation">Dojo Location:</label>
		<select name="dojolocation" id="dojolocation">
			<option value="San Jose">San Jose</option>
			<option value="Online">Online</option>
			<option value="Seattle">Seattle</option>
		</select>
		<label for="favoritelanguage">Favorite Language:</label>
		<select name="favoritelanguage" id="favoritelanguage">
			<option value="Python">Python</option>
			<option value="Java">Java</option>
			<option value="MongoDB">MongoDB</option>
		</select>
		<label for="comment">Comment (optional):</label>
		<input type="text" name="comment">
		<button>Button</button>
	</form>
</body>
</html>