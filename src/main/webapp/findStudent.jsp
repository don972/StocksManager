<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="WEB-INF/view/menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Search Page </title>
</head>
<body>
<div align="center">
	<h1> Search Student</h1>
	
	<form action ="searchController" method = "post">
	
		 <tr>
			
			<td>Enter Mob no.<td>
			<td><input type ="text" name="mobile"/> <td>
			
		</tr>	
		
		 <!--  <tr>
		
			<td> <input type = "submit" value= "Search"/> </td>
			
		</tr>     -->
		<button class="btn btn-primary" type="submit">Search</button>
		
		<tr>
		
			<td>Enter Email id.<td>
			<td><input type ="text" name="email"/> <td>
		</tr>	
 <!--  <tr>
		
			<td> <input type = "submit" value= "Search"/> </td>
			
		</tr>     -->
		<button class="btn btn-primary" type="submit">Search</button>
		
	</form>
	
	<%
		if(request.getAttribute("msg")!=null){
		
		out.println(request.getAttribute("msg"));
		}
	%>
</div>
</body>
</html>
<%@ include file="WEB-INF/view/footer.jsp" %>