<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="WEB-INF/view/menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color:#ffebcd; font-size: 16px">
<div align="center">
<form action ="searchByEmail" method = "post">
<table>	
		<tr>
			<td><h3>Enter Email id.<h3></h3><td>
			<td><input type ="text" name="email"/> <td>
		</tr>	
</table>	
		<button class="btn btn-primary" type="submit">Search</button>
	</form>
	</div>
</body>
</html>