<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Questions Dashboard</title>
</head>
<body>
<h1>Questions Dashboard</h1>
<table>
<tr>
<th>Question</th>
<th>Tags</th>
</tr>
<c:forEach items="${allqs}" var="q">
<tr>
<td><a href="/show/${q.id}">${q.qtext}</a></td>
<td>
<c:forEach items="${q.qtags}" var="tagtext">
${tagtext.subject},
</c:forEach>
</td>
</tr>
</c:forEach>
</table>
</body>
</html>