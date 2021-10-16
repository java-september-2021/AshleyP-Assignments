<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Add Song</title>
</head>
<body>
<a href="/dashboard">Dashboard</a>
<form:form action="/songs/new" method="POST" modelAttribute="song">
<p>
<form:label path="title">Title</form:label>
<form:errors path="title"/>
<form:input path="title"/>
</p>
<p>
<form:label path="artist">Artist</form:label>
<form:errors path="artist"/>
<form:input path="artist"/>
</p>
<p>
<form:label path="rating">Rating (1-10)</form:label>
<form:errors path="rating"/>
<form:select path="rating">
	<form:option value="1"/>
	<form:option value="2"/>
	<form:option value="3"/>
	<form:option value="4"/>
	<form:option value="5"/>
	<form:option value="6"/>
	<form:option value="7"/>
	<form:option value="8"/>
	<form:option value="9"/>
	<form:option value="10"/>
</form:select>
</p>

<button>Add Song</button>
</form:form>
</body>
</html>