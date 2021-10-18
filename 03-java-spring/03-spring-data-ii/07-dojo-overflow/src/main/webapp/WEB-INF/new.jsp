<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>New Question</title>
</head>
<body>
<h1>What is your question?</h1>	
<form:form method="POST" action="/newQuestion" modelAttribute="question">
<p>
<form:label path="qtext">Question:</form:label>
<form:errors path="qtext"/>
<form:textarea path="qtext"/>
</p>
<p>
<form:label path="tagsFromFrontEnd">Tags (separate by comma):</form:label>
<form:errors path="tagsFromFrontEnd"/>
<form:textarea path="tagsFromFrontEnd"/>
</p>
<button>Submit</button>
</form:form>
</body>
</html>