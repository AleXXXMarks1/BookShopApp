<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Alex's Book Shop</title>
</head>
<body>

<h1 align=center>Alex's Book Shop</h1> 

<h1> Search Books</h1>

<form action="/bookresults" method="get">
<input type="text" name="Search"/> <input type="submit" value="Search"/>
</form>

<br>

<button type="button" onclick="window.location.href='/register'"> Register </button>
<button type="button" onclick="window.location.href='/login'"> Login </button>

</body>
</html>