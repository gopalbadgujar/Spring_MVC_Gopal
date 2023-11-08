<%@page import="com.springMVC.model.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Page</title>
</head>
<%
	Student s = (Student) request.getAttribute("stu");
%>
<body>
	<h1>Edit Student Details Here...</h1>

	<form action="up">

		<pre>
Student ID      : <input type="number" name="sid"
				value="<%=s.getSid()%>" placeholder="Enter Student ID Here">

Student Name    : <input type="text" name="sname"
				value="<%=s.getSname()%>"
				placeholder="Enter Updated Student Name Here">

Student Address : <input type="text" name="saddress"
				value="<%=s.getSaddress()%>"
				placeholder="Enter Updated Student Address Here">

Student Birth   : <input type="date" name="sbirth"
				value="<%=s.getSbirth()%>"
				placeholder="Enter Updated Student Date of Birth Here">

<button type="submit" value="update">Update</button>
</pre>

	</form>
</body>
</html>