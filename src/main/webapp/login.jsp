<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">

	<style>
		img{
			width: 30%;
			height: 30%;
		}
	</style>

<title>Login Page</title>

	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>

	<body style="background-color:#ffebcd; font-size: 16px">
	
	<element>

		<div align ="center">
		
		<h2> Student Registration System </h2>
	
		<img src="https://zestechinc.com/wp-content/uploads/2017/02/registration.jpg" alt="logo">
	
		<h1> Login Here....</h1>
		
		<form action ="log" method = "post">
	
	
			 <tr>
				
				<br> <td> email <input type ="email" name="email"/> <td> <br/>
				
			</tr>	
			
			<tr>
				
				<br> <td> password <input type ="password" name="password"/> </td> <br/>
				
			</tr>
			
			<tr>
			
				<br> <td> <input type = "submit" value= "login"/></td> <td><a href="userReg.jsp"><input type="button" value="Sign up"></a></td> </br>
					
			</tr>
			
		
	</form>
	
	<%
		if(request.getAttribute("error")!=null){
	
		out.println(request.getAttribute("error"));
		}
	
	%>
	
		</div>
	
	</element>
	
</body>

</html>