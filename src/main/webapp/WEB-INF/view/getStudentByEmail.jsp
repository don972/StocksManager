<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.ResultSet"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> registrations </title>
</head>
<body>
<div align ="center">
<!--  <a href="findStudent.jsp"><input type="button" value="Search"></a> -->
	<h2>Student Details</h2>
		
		<%
			ResultSet reg = (ResultSet)request.getAttribute("student");
			while(reg.next()){
		%>
		
		<table border='1' cellspacing='1' cellpadding='7'>
	
		<tr>
			<th>name</th>
			<th>city</th>
			<th>email</th>
			<th>mobile</th>
		</tr>
		
		<tr>
			<td><%=reg.getString(1) %></td>
			<td><%=reg.getString(2) %></td>
			<td><%=reg.getString(3) %></td>
			<td><%=reg.getString(4) %></td>
		</tr>
		
		<%} %>
	
	</table>
	</div>
	<br>
</body>
</html>
<%@ include file="footer.jsp" %>