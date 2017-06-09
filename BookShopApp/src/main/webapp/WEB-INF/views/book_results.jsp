<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Results</title>
</head>
<style>
table {
    border-collapse: collapse;
    width: 75%;
}

th, td {
    padding: 8px;
    text-align: left;
    border-bottom: 1px solid #ddd;
}
</style>
<body>

<h1>Book Results</h1>
<table  >
		<tr>
			<th>Title</th>
			<th>Author</th>
			<th>Price (£)</th>
			<th>ISBN</th>
			<th>Number of Pages</th>
			<th>Publisher</th>
		</tr>

<c:forEach items="${allBooks}" var="book">
	<tr> 
	<td>${book.title}</td>
	<td>${book.author}</td> 
	<td>${book.price}</td> 
	<td>${book.isbn}</td> 
	<td>${book.pages}</td> 
	<td>${book.publisher}</td>
	<td><input type="submit" value="Buy Me"/> </td> 
	</tr>

</c:forEach>
</table>

</body>
</html>