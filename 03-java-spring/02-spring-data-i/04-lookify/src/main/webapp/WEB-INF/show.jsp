<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Details</title>
</head>
<body>
<a href="/dashboard">Dashboard</a>

<p><c:out value="${thisSong.title}"/></p>
<p><c:out value="${thisSong.artist}"/></p>
<p><c:out value="${thisSong.rating}"/></p>
<form method="POST" action="/delete/${thisSong.id}">
<input type="submit" name="_method" value="Delete">
</form>
</body>
</html>