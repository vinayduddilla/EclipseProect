<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
	<thead>
	<tr>
	<th>Product</th>
	<th>Category<th>
	<th>Actions</th>
	</tr>
	</thead>
	<tbody>
	<c:forEach items = "${product}" var = "product">
	<tr>
	<td>${product.productName }</td>
	<td>${product.productCategory }</td>
	<td><a href = "/VCart/delete-product.do?product=${product.productName}&productCategory=${product.productCategory}"> Delete Product</a>
	</td>
	<td><a href = "/VCart/update-product.do?product=${product.productName}&productCategory=${product.productCategory}"> Update Product</a>
	</td>
	</tr>
	</c:forEach>
	</tbody>
</table>
<a href="/VCart/add-product.do">Add new Product</a>

</body>
</html>