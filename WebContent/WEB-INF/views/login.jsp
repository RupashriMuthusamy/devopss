<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>student information management</title>
</head>
<body>
<form:form name="insertUser" method="POST" action="stu">
  <table>
  <tr>
  <th>Student Information Management</th></tr>
  <tr>
  <td>ID:</td>
  <td><input type=" text" name="id" required></td></tr>
  
  <tr>
  <td>NAME:</td>
  <td><input type=" text" name="name" required></td></tr>
  <tr>
  <td>PASSWORD:</td>
  <td><input type="password" name="pass" required></td></tr>
  <tr>
<td><input type="submit" value="submit" /></td>
  
  </table>
</form:form>
</body>
</html>