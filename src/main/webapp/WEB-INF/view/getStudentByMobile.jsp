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
	<h2>Student Details</h2>
		
		<%
			ResultSet data = (ResultSet)request.getAttribute("res");
			while(data.next()){
		%>
		
		<table border='1' cellspacing='1' cellpadding='7'>
	
		<tr>
			<th>name</th>
			<th>city</th>
			<th>email</th>
			<th>mobile</th>
		</tr>
		
		<tr>
			<td><%=data.getString(1) %></td>
			<td><%=data.getString(2) %></td>
			<td><%=data.getString(3) %></td>
			<td><%=data.getString(4) %></td>
		</tr>
		
		<%} %>
	
	</table>
	</div>
	<br>
</body>
</html>
<%@ include file="footer.jsp" %>