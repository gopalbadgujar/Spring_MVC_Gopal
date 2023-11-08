<%@page import="com.model.Account"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Page</title>
</head>

<%  Account a =(Account) request.getAttribute("account"); %>
<body>
<h1>Edit User Details Here...</h1>

<form action="up">
<pre>

Account ID               : <input type="number" name="id" value="<%=a.getId()%>" hidden="true">

Account UserName         : <input type="text" name="username" value="<%=a.getUsername()%>" placeholder="Enter Updated Username Here" >

Account PassWord         : <input type="text" name="password" value="<%=a.getPassword()%>" placeholder="Enter Updated Password Here" >

Account Number           : <input type="number" name="accNo" value="<%=a.getAccNo()%>" placeholder="Enter Updated Account Number Here" hidden="true">

Account Name             : <input type="text" name="accName" value="<%=a.getAccName()%>" placeholder="Enter Updated Name Here" >

Account Address          : <input type="text" name="accAddress" value="<%=a.getAccAddress()%>" placeholder="Enter Updated Account Address Here">

Account Email            : <input type="text" name="accEmail" value="<%=a.getAccEmail()%>" placeholder="Enter Updated Account Email Here">

Account Mobile           : <input type="number" name="accMobNumber" value="<%=a.getAccMobNumber()%>" placeholder="Enter Updated Account Mobile Number Here">

Account PanNumber        : <input type="text" name="accPanNumber" value="<%=a.getAccPanNumber()%>" placeholder="Enter Updated Account Pan Number Here">

Account Initial Balance  : <input type="number" name="initialBalance" value="<%=a.getInitialBalance()%>" placeholder="Enter Updated Account Initial Balance Here">

         
<button type="submit" value="update">UPDATE ACCOUNT</button>

</pre>

</form>
</body>
</html>