<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Menu</title>
</head>
<body>
<h1 align="center">MENU</h1>
	<table border="1" cellpadding="30%" align="center">
	<tr>
		<th>ID</th>
		<th>ITEM</th>
		<th>PRICE</th>
	</tr>
		<c:forEach var="items" items="${foodItems}">
			<tr>

				<td>${items.id}</td>
				<td>${items.item}</td>
				<td>${items.price}</td>

			</tr>
		</c:forEach>
	</table>
</body>
</html>