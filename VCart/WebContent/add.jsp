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
	<form method = "POST" action = "/VCart/add-product.do">
		<fieldset>
		<label>Description</label><input name = "product" type = "text"/>
		<br/>
		</fieldset>
		<fieldset>
		<label>Category</label><input name = "category" type = "text"/>
		<br/>
		</fieldset>
		<input name = "add" type = "submit" value="Submit" />
	</form>

</body>
</html>