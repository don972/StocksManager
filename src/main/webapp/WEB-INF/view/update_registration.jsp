<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Update Registration Page </title>
</head>
<body>

<div align ="center">

	<h2> Update registration </h2>
	
	<form action ="update" method="post">
		
		<tr>
			<th> name </th>
			<th> <input type = "text" name ="name"value="<%=request.getAttribute("name")%>"/></th> 
		</tr>
		<tr>
			<th> city </th>
			<th> <input type = "text" name ="city"value="<%=request.getAttribute("city")%>"/></th> 
		</tr>
		<tr>
			<th> email </th>
			<th> <input type = "text" name ="email"value="<%=request.getAttribute("email")%>"/></th> 
		</tr>
		<tr>
			<th> mobile </th>
			<th> <input type = "text" name ="mobile"value="<%=request.getAttribute("mobile")%>"/></th> 
		</tr>
		<tr>
			<th> <input type ="submit" value = "save"/></th>
		</tr>
		
	</form>
	
	<%
		if(request.getAttribute("msg")!=null){
		
		out.println(request.getAttribute("msg"));
		}
	%>
	</div>
</body>
</html>