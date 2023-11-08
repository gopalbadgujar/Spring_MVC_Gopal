<%@page import="com.model.Account"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Successfully deposited</title>
</head>
<%
	Account a = (Account) request.getAttribute("accDepositMoney");
%>
<body>

		<div id="header">
			<h1>
				APANA - BANK<span class="style1"></span>
			</h1>
			<h2>ExtraOrdinary Service</h2>
			<A href="index.html"><IMG SRC="images/home1.gif"></IMG></A>
		</div>

		<div id="navigation">
			<ul>
				<li><a href="create.jsp">NEW ACCOUNT</a></li>
				<li><a href="balance1.jsp">BALANCE</a></li>
				<li><a href="deposit1.jsp">DEPOSIT</a></li>
				<li><a href="withdraw1.jsp">WITHDRAW</a></li>
				<li><a href="transfer1.jsp">TRANSFER</a></li>
				<li><a href="about.jsp">ABOUT US</a></li>
			</ul>
		</div>

		<h1>Account Balance...</h1>

		<pre>
			<b>
					Account Holder Name         : <%=a.getAccName()%>
					Account Number is           : <%=a.getAccNo()%>
					
                   Your Current Account Balance : <%=a.getInitialBalance()%>
			</b> 	
			</pre>
		<hr>
		<br> Close Account : <a href="index.jsp"><button
				type="submit">LOGOUT</button></a>
</body>
</html>