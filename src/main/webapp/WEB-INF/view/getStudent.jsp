<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.ResultSet"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Student details </title>

</head>
<body>
<div align ="center">
		
		<h2>Student Details</h2>
		
		<%
			ResultSet result = (ResultSet)request.getAttribute("student");
		
			while(result.next()){
		%>
		
		
		<table border="1">
	
		<tr>
			<th>name</th>
			<th>city</th>
			<th>email</th>
			<th>mobile</th>
		</tr>
		
		<tr>
			<td><%=result.getString(1) %></td>
			<td><%=result.getString(2) %></td>
			<td><%=result.getString(3) %></td>
			<td><%=result.getString(4) %></td>
		</tr>
		
		
		<%} %>
	
	</table>
	<br>
	<a href="findStudent.jsp"><input type="button" value="Back"></a>
	<br>
	</div>
	<br>
	
</body>
</html>
<%@ include file="footer.jsp" %>