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
	
	Search for a product : 
	<form action="searchProduct" method="post">
		<input type="text" name="product"/>
		<input type="submit" value="search"/>
	</form>
	<h3>Following are the products:</h3>    
	<table border=1>
		<tr>
			<td>Product Id</td>
			<td>Product Name</td>
			<td>Price</td>
			<td>Quantity</td>
			
		</tr>
	
	<c:forEach var="productList" items="${requestScope.ProductList}" >
		<tr>
			<td><c:out value="${productList.id}"/></td>
			<td><c:out value="${productList.name}"/></td>
			<td><c:out value="${productList.price}"/></td>
			<td><c:out value="${productList.quantity}"/></td>
			
		</tr>
	
    </c:forEach>
	</table>
	
</body>
</html>