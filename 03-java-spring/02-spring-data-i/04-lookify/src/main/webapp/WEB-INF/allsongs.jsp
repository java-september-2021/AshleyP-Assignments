<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="css/main.css"/>
	<title>Lookify!</title>
</head>
<body>
<nav>
<a href="/songs/new">Add New</a>  |  <a href="/search/topTen">Top Songs</a>
<form action="/search">
	<input type="text" name="artist"/>
	<button>Search Artists</button>
</form>
</nav>
<table border=1>
<thead>
<tr>
<td>Name</td>
<td>Rating</td>
<td>actions</td>
</tr>
</thead>
<tbody>
<c:forEach items="${allSongs}" var="song">
<tr>
<td><a href="/show/${song.id}">${song.title}</a></td>
<td>${song.artist}</td>
<td>${song.rating}</td>
<td><a href="/delete/${song.id}">Delete</a>
</c:forEach>
</tbody>
</table>
</body>
</html>