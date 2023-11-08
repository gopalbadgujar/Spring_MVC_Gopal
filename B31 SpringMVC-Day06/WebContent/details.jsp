<%@page import="com.springMVC.model.Student"%>
<%@page import="java.util.List"%>
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
	alert("U want to edit");
	document.mypage.action="edit";
	document.mypage.submit();
}

function delData() {
	alert("U want to delete");
	document.mypage.action="del";
	document.mypage.submit();
}

</script>

<%
	List<Student> slist = (List) request.getAttribute("slist");
%>
<body>
	<h1>Student Details</h1>

	<form name="mypage">
		<table border="3">
			<thead>
				<tr>
					<th>SELECT</th>
					<th>ID</th>
					<th>NAME</th>
					<th>ADDRESS</th>
					<th>BIRTH</th>
					<th>EDIT</th>
					<th>DELETE</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<%
						for (Student s : slist) {
					%>
					<td><input type="radio" name="sid" value="<%=s.getSid()%>">
					</td>
					<td><%=s.getSid()%></td>
					<td><%=s.getSname()%></td>
					<td><%=s.getSaddress()%></td>
					<td><%=s.getSbirth()%></td>
					<td><input type="submit" value="edit" onclick="editData()"></td>
					<td><input type="submit" value="delete" onclick="delData()"></td>
				</tr>
				<%
					}
				%>
			</tbody>
		</table>
	</form>
</body>
</html>