<%@page import="com.tyss.retailermaintenancesystem.DTO.RetailerBean"%>
<%@page import="com.tyss.retailermaintenancesystem.DTO.ProductBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
	RetailerBean bean = (RetailerBean) session.getAttribute("bean");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<a href="./updatepassword">Update Password</a>
	<a href="./logout" style="float: right;">Logout</a>
	<h2>Welcome <%=bean.getName()%></h2>
		<fieldset>
		<legend>Search Product</legend>
		<form action="./search" method = "post">
			<table>
				<tr>
					<td>ID:</td>
					<td><input name = "id" type = "number"></td>
					<td><input type = "submit" value = "Search"></td>
				</tr>
			</table>
		</form>
	</fieldset>

	<%ProductBean productBean =(ProductBean)request.getAttribute("bean");%>
	<%
	if (productBean !=null){
	%>
	<table>
		<tr>
			<th>PID</th>
			<th>ProductName</th>
			<th>Price</th>
		</tr>
		<tr>
			<td><%=productBean.getPid()%></td>
			<td><%=productBean.getProductName()%></td>
			<td><%=productBean.getPrice()%></td>
		</tr>
	</table>
	<% 
	}
	%>
</body>


</html>