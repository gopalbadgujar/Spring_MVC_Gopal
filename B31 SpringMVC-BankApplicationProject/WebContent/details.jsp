<%@page import="java.util.List"%>
<%@page import="com.model.Account"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Details Page</title>
</head>
<script type="text/javascript">
	function editData() {
		alert(" U want to edit");
		document.mypage.action = "edit";
		document.mypage.submit();
	}

	function delData() {
		alert(" U want to delete");
		document.mypage.action = "del";
		document.mypage.submit();
	}
</script>

<%
	List<Account> listAccount = (List) request.getAttribute("listAcc");    
%>
<body>
	<h1>User Details...</h1>

	<form name="mypage">

		<table border="4">

			<thead>
				<tr>
					<th>SELECT</th>
					<th>Id</th>
					<th>USERNAME</th>
					<th>PASSWORD</th>
					<th>ACCOUNT NUMBER</th>
					<th>ACCOUNT HOLDER NAME</th>
					<th>HOME ADDRESS</th>
					<th>EMAIL ADDRESS</th>
					<th>PAN_NUMBER</th>
					<th>MOB NUMBER</th>
					<th>INITIAL BALANCE</th>
					<th>EDIT</th>
					<th>DELETE</th>
					
				</tr>
			</thead>

			<tbody>
				<tr>
					<%
						 for (Account a : listAccount) { 
					%>
					<td><input type="radio" name="id" value="<%=a.getId()%>">
					</td>
					<td><%=a.getId()%></td>
					<td><%=a.getUsername()%></td>
					<td><%=a.getPassword()%></td>
					<td><%=a.getAccNo()%></td>
					<td><%=a.getAccName()%></td>
					<td><%=a.getAccAddress()%></td>
					<td><%=a.getAccEmail()%></td>
					<td><%=a.getAccPanNumber()%></td>
					<td><%=a.getAccMobNumber()%></td>
					<td><%=a.getInitialBalance()%></td>
					<td><input type="submit" value="edit" onclick="editData()"></td>
					<td><input type="submit" value="delete" onclick="delData()"></td>

				</tr>
				<%
					} 
				%>
			</tbody>

		</table>

	</form>


	<br>
	<br>
	<h3>Register Account</h3>
	<pre>

<a href="register.jsp"><button type="submit">Account Registration</button></a>


<a href="home.jsp"><button type="submit">Go Back To Home</button></a>


<a href="index.jsp"><button type="submit">Go Back To Login</button></a>


</pre>
</body>
</html>