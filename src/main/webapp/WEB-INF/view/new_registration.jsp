
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Registration Page </title>
</head>

<body style="background-color:#ffebcd; font-size: 16px">

<div align ="center">

	<h2> Registration Form</h2>
	
	<h2> Please fill the below details </h2>
	
	<form action ="saveReg" method="post">
	
	
		<tr>
			<td> name </td>
		    <td> <input type = "text" name ="name"/> </td> <br/>
		</tr>
		<tr>
		    <td> city </td>
		 	<td> <input type = "text" name ="city"/> </td> <br/>
		</tr>
		<tr>
			<td> email </td>
			<td> <input type = "text" name ="email"/></td> <br/>
		</tr>
		<tr>
			<td> mobile </td>
			<td> <input type = "text" name ="mobile"/></td> <br/>
		</tr>
		<tr>
			<td><input type ="submit" value = "Save"/></td>  <td><input type="reset" value="Reset"></td>
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
<%@ include file="footer.jsp" %>