
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<fieldset>
		<legend>Register Form</legend>
		<form action="./form" method="post">
			<table>
				<tr>
					<td>ID</td>
					<td><input name="id" type="number"></td>
				</tr>
				<tr>
					<td>Name</td>
					<td><input name="name" type="text"></td>
				</tr>
				<tr>
					<td>Gender</td>
					<td><input name="gender" type="text"></td>
				</tr>
				<tr>
					<td>DOJ</td>
					<td><input name="doj" type="date"></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input name="password" type="password"></td>
				</tr>
				<tr>
					<td><input type="reset" value="Reset"></td>
					<td><input type="submit" value="Register"></td>
				</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>