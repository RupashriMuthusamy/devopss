<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="java.util.*,kce.student.model.Login"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body>
	<%
		List<Login> students = (List<Login>) request.getAttribute("students");
	%>
	<h1>Here is a list</h1>
	<table border="1">
		<thead>
			<th>Name</th>
			<th>Password</th>
			<th colspan="2">Action</th>
		</thead>
		<%
			for (Login temp : student) {
		%>
		<tr>
			<td><%=temp.getName() %></td>
			<td><%=temp.getpass() %></td>
			<td><a href="http://localhost:8080/Demo/editStudent?id=<%=temp.getId() %>"><button>Edit</button></a></td>
			<td><a href="http://localhost:8080/Demo/deleteStudent?id=<%=temp.getId() %>"><button>Delete</button></a></td>
		</tr>
		<%
			}
		%>
	</table>

</body>
</html>