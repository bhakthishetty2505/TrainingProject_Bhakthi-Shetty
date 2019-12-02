<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="./home">Home</a>
	<a href="./logout" style="float: right;">Logout</a>
	<h3>${msg}</h3>
	<fieldset>
		<legend>Change Password</legend>
		<form action = "./updatepassword" method = "post">
			<table>
				<tr>
					<td>New Password</td>
					<td><input name="password" type="password"></td>
				</tr>
				<tr>
					<td>Confirm Password</td>
					<td><input name="confirmpassword" type="password"></td>
				</tr>
				<tr>
					<td><input type = "submit" value = "Change Password" ></td>
					
				</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>