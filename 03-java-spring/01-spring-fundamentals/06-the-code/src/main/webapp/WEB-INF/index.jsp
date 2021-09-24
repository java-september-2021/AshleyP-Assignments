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
	<title>Secret Code</title>
</head>
<body>
	<h1>The Code</h1>
	<p class="error">${errorMessage}</p>
	<form method="POST" action="/code"> 
	<label>What is the code?</label>
	<input type="text" name="code">
	<button>Try Code</button>
	</form>
</body>
</html>
