<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Retrieve Account</title>
</head>
<body>

Confirm user identity:
<form action = "ForgotPasswordController" method = "POST"> 
	Username*: <input type = "text" name = "fname">
	<br>
	RUID*: <input type = "text" name = "ruid">
	<br>
<input type = "submit" value = "Reset Password">	
</form>


</body>
</html>