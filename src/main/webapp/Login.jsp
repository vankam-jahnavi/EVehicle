<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<style>
.myborder{margin-top:15%;margin-left:40%;}

</style>
</head>
<body>
<div class="myborder">
<h1>Login Form</h1>
<form action="reglogin" method="post">
<table>
<tr><th>LoginId</th></tr>
<tr><td><input type="text" required></td></tr>
<tr><th>Password</th></tr>
<tr><td><input type="password" required></td></tr>
</table><br>
<input type="submit"  style="color:white;background-color:green;width:20%"value="LOGIN"/><br><br><br>
New USER :<a href="Register.jsp"><Font face="Arial" size="2">Register Here</Font></a><br><br><br>
</form>
</div>
</body>
</html>