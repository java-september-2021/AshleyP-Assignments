<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Search</title>
</head>
<body>
<h3>Songs by artist: ${artist}</h3>
<form action="/search">
	<input type="text" name="artist"/>
	<button>New Search</button>
</form>
<a href="/dashboard">Dashboard</a>
<table border=1>
<thead>
<tr>
<th>Name</th>
<th>rating</th>
<th>actions</th>
</tr>
</thead>
<tbody>
<c:forEach items="${songs}" var="song">
<tr>
<td><a href="/songs/${song.id}">${song.title}</a></td>
<td><a href="/songs/${song.id}">${song.rating}</a></td>
<td><a href="/delete/${song.id}">Delete</a></td>
</tr>
</c:forEach>
</tbody>
</table>
</body>
</html>