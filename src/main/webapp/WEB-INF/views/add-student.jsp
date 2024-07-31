<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Student</title>
</head>
<body>
<div align="center">
	<h3 align="center">Add Student</h3>
	<form:form modelAttribute="student">
		<label>Name : </label>
		<form:input path="name" />
		<br />
		<label>Mobile : </label>
		<form:input path="mobile" />		
		<br />		
		<label>Country : </label>
		<form:input path="country" />		
		<br/>		
		<input type="submit" value="Submit">

	</form:form>
</div>
</body>
</html>