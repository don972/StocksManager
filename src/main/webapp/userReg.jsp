<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
		img{
			width: 30%;
			height: 30%;
		}
	</style>
</head>
<body style="background-color:#ffebcd; font-size: 16px">
<element>
	<center>
		<h2> Student Registration System </h2><br>
		
		<img src="https://zestechinc.com/wp-content/uploads/2017/02/registration.jpg" alt="logo">
		
		<h3> Registration Here.....</h3>
		
		<form action="userRegistrationController" method="post">
		
			<table>
				<tr>
					<td>Enter your Username</td>
					<td><input type="email" name="email"></td>
				</tr>
				<tr>
					<td>Enter your Password</td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<td>Confirm your Password</td>
					<td><input type="password" name="cnf_password"></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Sign up"></td> <td><a href="login.jsp"><input type="button" value="Sign in"></a></td>
				</tr>
			</table>
		</form>
		
		<%
			if(request.getAttribute("alert") != null) {
				
				out.println(request.getAttribute("alert"));
			}
		%>
	</center>
</element>
</body>
</html>