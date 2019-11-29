<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:useBean id="msg" class = "java.lang.String" scope = "request"/>
<body>
		<a href="./home">Home </a>
		<a href="./logout" style="float : right">Logout</a> 
		<h4><%=msg %></h4>
	<fieldset align="center">
		<legend>Change Password</legend>
		<form action="./changepassword" method="post">
			<table>
				<tr>
					<td>New Password :</td>
					<td><input name="newpassword" type="password"></td>
				</tr>
				<tr>
					<td>Confirm Password :</td>
					<td><input name="confirmpassword" type="password"></td>
				</tr>
				<tr>
					<td><input type="reset" value="Reset"></td>
					<td><input type="submit" value="Change Password"></td>
				</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>