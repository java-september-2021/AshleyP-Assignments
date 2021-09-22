<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
	<title>Current visit count</title>
</head>
<body>
	<h2>You have visited <a href="/" role="button">http://localhost8080</a> <c:out value="${countToShow}"></c:out> times.</h2>
	<h2><a href="/" role="button">Test another visit?</a> | <a href="/reset" role="button">Reset</a></h2>
</body>
</html>