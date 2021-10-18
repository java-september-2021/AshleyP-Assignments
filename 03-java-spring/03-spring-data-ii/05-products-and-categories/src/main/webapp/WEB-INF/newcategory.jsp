<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
<body>
<h1>New Category</h1>
<hr>
<form method="POST" action="/categories/new">
<p>
<label for="name">Name</label>
<input type="text" name="category">
</p>
<button>Create</button>
</form>
</body>
</html>