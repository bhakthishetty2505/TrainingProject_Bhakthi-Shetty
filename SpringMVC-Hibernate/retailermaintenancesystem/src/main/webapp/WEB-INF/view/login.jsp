<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>${msg}</h3>
	<fieldset>
		<legend>Login Page</legend>
		<form action="./login" method="post">
			<table>
				<tr>
					<td>ID</td>
					<td><input name="id" type="number"></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input name="password" type="password"></td>
				</tr>
				<tr>
					<td><input type="reset" value="Reset"></td>
					<td><input type="submit" value="Login"></td>
				</tr>
			</table>
		</form>
		<a href="./createprofile">Register</a>
	</fieldset>

</body>
</html>