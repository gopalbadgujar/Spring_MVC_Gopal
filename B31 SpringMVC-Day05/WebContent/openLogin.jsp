<%@page import="com.springMVC.model.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Open Login Page</title>
</head>
<body>
	<%
		List<Employee> elist = (List) request.getAttribute("elist");
	%>
	<h1>Employee Details !</h1>

	<form action="del">
		<table border="3">

			<thead>
				<tr>
					<th>Select</th>
					<th>Id</th>
					<th>Name</th>
					<th>Address</th>
					<th>Bday</th>
					<th>Edit</th>
					<th>Delete</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<%
						for (Employee e : elist) {
					%>
					<td><input type="radio" name="eid" value="<%=e.getEid()%>">
					</td>
					<td><%=e.getEid()%></td>
					<td><%=e.getEname()%></td>
					<td><%=e.getEaddress()%></td>
					<td><%=e.getEbirth()%></td>
					<td></td>
					<td><input type="submit" value="delete"> </td>

				</tr>
				<%
					}
				%>
			</tbody>
		</table>
	</form>

</body>
</html>