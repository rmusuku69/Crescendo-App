<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Crescendo Login</title>
</head>
<body>
<form action="loginVerify" method="post">
 <h3>${msg}</h3>
 <table>
 <tr><td><input type="text" name="username" placeHolder="Username or Email"></td></tr>
 <tr><td><input type="password" name="password" placeHolder="Password"></td></tr>
 <tr><td><input type="submit" value="Login"></td></tr>
 </table>
 </form>
</body>
</html>