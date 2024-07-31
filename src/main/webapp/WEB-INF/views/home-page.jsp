<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Home Page</title>
</head>
<body>
	<h1 align="center">For the Emperor!</h1>
	<div align="center">
		<table border="1">
			<thead>
				<tr>
					<td>id</td>
					<td>name</td>
					<td>mobile</td>
					<td>country</td>
				</tr>
			</thead>

			<c:forEach var="student" items="${students}">
				<tr>
					<td>${student.id}</td>
					<td>${student.name}</td>
					<td>${student.mobile}</td>
					<td>${student.country}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>