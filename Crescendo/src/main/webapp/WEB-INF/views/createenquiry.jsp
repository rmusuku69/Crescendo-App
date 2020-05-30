<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Enquiry</title>
</head>
<body>
<h1>CREATE ENQUIRY</h1>
<form action="/ENQUIRY/create" method="post">
 <table>
	 <tr><td><input type="text" name="firstName" placeHolder="Username or Email"></td></tr>
	 <tr><td><input type="password" name="password" placeHolder="Password"></td></tr>
	 <tr><td><input type="submit" value="Create Enquiry"></td></tr>
 </table>
 </form>
</body>
</html>