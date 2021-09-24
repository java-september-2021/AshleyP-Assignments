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
	<h1>Submitted Info</h1>
	<p>Name: ${name}</p>
	<p>Dojo Location: ${dojolocation}</p>
	<p>Favorite Language: ${favoritelanguage}</p>
	<p>Comment: ${comment}</p>
	<a href="/" role="button">Go Back</a>
</body>
</html>