<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
		<p style="color:red"><c:out value="${error}"/></p>
		
		<h1>What is the code?</h1>
		<form method="POST" action="/code">
			<input type="text" name="password"></input>
			<button>Try Code</button>
		</form>
		
</body>
</html>