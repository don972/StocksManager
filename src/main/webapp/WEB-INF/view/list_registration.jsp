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
<a href="searchStudent.jsp"><button type="button" class="btn btn-outline-primary">Search</button></a>

	<h2>All Registrations....</h2>
	<table border='1' cellspacing='1' cellpadding='7'>
	
		<tr>
			<th>name</th>
			<th>city</th>
			<th>email</th>
			<th>mobile</th>
			<th>Delete</th>
			<th>Update</th>
		</tr>
		
		<%
			ResultSet res = (ResultSet)request.getAttribute("result");
			while(res.next()){
		%>
		
		<tr>
			<td><%=res.getString(1) %></td>
			<td><%=res.getString(2) %></td>
			<td><%=res.getString(3) %></td>
			<td><%=res.getString(4) %></td>
			<td><a href="delete?email=<%=res.getString(3)%>"><input type="button" value="Delete"></a></td>
			
			<td><a href="update?name=<%=res.getString(1)%>&city=<%=res.getString(2)%>&email=<%=res.getString(3)%>&mobile=<%=res.getString(4)%>"><input type="button" value="Update"></a></td>
		</tr>
		
		
		<%} %>
	
	</table>
	</div>
	<br>
</body>
</html>
<%@ include file="footer.jsp" %>