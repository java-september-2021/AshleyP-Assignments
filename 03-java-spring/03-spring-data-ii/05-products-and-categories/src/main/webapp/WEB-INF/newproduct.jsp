<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>New Product</title>
</head>
<body>
<h1>New Product</h1>
<hr>
<form method="POST" action="/products/new">
<p>
<label for="name">Name</label>
<input type="text" name="name">
</p>
<label for="name">Description</label>
<textarea name="desc"></textarea>
<p>
<label for="price">Price</label>
<input type="text" name="price"> <!-- If used double for price, have to add step="0.01" to be able to add prices with decimal values.  -->
</p>
<button>Create</button>
</form>
</body>
</html>