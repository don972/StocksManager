<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Logged out </title>
</head>
<body>



<element>

	<center>
	
			<form action="logoutController" method="post">
	
			<input type="submit" value="logout"/>
			
				<h3 style="color:purple;">You have successfully Logged out!</h3><br>
				
				<a href="login.jsp"><input type="submit" value="login"></a>
		
			</form>
	</center>
	
</element>

</body>

</html>