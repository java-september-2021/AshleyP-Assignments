<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Search</title>
</head>
<body>
<h1>Top Ten Songs</h1>
<a href="/dashboard">Dashboard</a>
<table border=1">
<thead>
<tr>
<th>Rating</th>
<th>Title</th>
<th>Artist</th>
</tr>
</thead>
<tbody>
<c:forEach items="${songs}" var="song">
<tr>
<td>${song.rating}</td>
<td><a href="/songs/${song.id}">${song.title}</a></td>
<td>${song.artist}</td>
</tr>
</c:forEach>
</tbody>
</table>
</body>
</html>