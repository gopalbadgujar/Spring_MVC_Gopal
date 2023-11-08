<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register Page</title>
</head>
<body>
<h1>Register User Information Here...</h1>

<form action="reg">
<pre>

Account Username : <input type="text" name="username" placeholder="Enter Account Username Here" required="required">

Account Password : <input type="password" name="password" placeholder="Enter Account Password Here" required="required">

Account ID       : <input type="number" name="id" placeholder="Enter Account ID Here" required="required">

Account Number   : <input type="number" name="accNo" placeholder="Enter Account Number Here" required="required">

Account Name     : <input type="text" name="accName" placeholder="Enter Account Name Here" required="required">

Account Address  : <input type="text" name="accAddress" placeholder="Enter Account Address Here" required="required">

Account Email    : <input type="text" name="accEmail" placeholder="Enter Account Address Here" required="required">

Account PanNo    : <input type="text" name="accPanNumber" placeholder="Enter Account Address Here" required="required">

Account Mobile   : <input type="text" name="accMobNumber" placeholder="Enter Account Address Here" required="required">

Account Deposit  : <input type="number" name="deposit" placeholder="Enter Account Deposit Here" required="required">


                   <button type="submit" value="register">REGISTER</button>

</pre>
</form>

</body>
</html>