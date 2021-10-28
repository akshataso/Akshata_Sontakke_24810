<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Home</title>
</head>
<body>
	
	<h3>Following are the products:</h3>    
	<table border=1>
		<tr>
			<td>Product Id</td>
			<td>Product Name</td>
			<td>Price</td>
			<td>Quantity</td>
			<td>Update</td>
			<td>Delete</td>
		</tr>
	
	<c:forEach var="productList" items="${requestScope.ProductList}" >
		<tr>
			<td><c:out value="${productList.id}"/></td>
			<td><c:out value="${productList.name}"/></td>
			<td><c:out value="${productList.price}"/></td>
			<td><c:out value="${productList.quantity}"/></td>
			<td><a href="${pageContext.request.contextPath}/AdminController?action=EDIT&id=${productList.id}">Update</a></td>
			<td><a href="${pageContext.request.contextPath}/AdminController?action=DELETE&id=${productList.id}">Delete</a></td>
		</tr>
	
    </c:forEach>
	</table>
	
</body>
</html>