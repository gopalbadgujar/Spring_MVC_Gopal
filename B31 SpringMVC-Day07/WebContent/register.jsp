<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register Page</title>
</head>
<body>
<h1>Register Student Data Here...</h1>

<form action="reg" enctype="multipart/form-data" method="post">
<pre>

Student ID      : <input type="number" name="sid" placeholder="Enter Student ID Here">

Student Name    : <input type="text" name="sname" placeholder="Enter Student Name Here">

Student Address : <input type="text" name="saddress" placeholder="Enter Student Address Here">

Student Birth   : <input type="date" name="sbirth" placeholder="Enter Student Date of Birth Here">

Student File    : <input type="file" name="fileUp">

<button type="submit" value="register">REGISTER</button>

</pre>
</form>

</body>
</html>