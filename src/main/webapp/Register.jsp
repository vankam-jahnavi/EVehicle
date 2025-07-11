<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EV Registration</title>
<style>
.myline{margin-top:10%;margin-left:40%;width:30%;height:50%;border:2px solid white;border-shadow:4px green;}
s</style>
</head>
<body>
<div class="myline">
<h2> USER REGISTRATION</h2>

<form action="userRegForm" method="post">
<table>
<tr><th>User Id</th></tr>
<tr><td><input type="text" name="uid" required></td></tr>
<tr><th>Name</th></tr>
<tr><td><input type="text" name="uname" required></td></tr>
<tr><th>Phone</th></tr>
<tr><td><input type="text" name="uphone" required></td></tr>
<tr><th>Email</th></tr>
<tr><td><input type="email" name="uemail" required></td></tr>
<tr><th>Password</th></tr>
<tr><td><input type="password" name="upassword" required></td></tr>
<tr></tr><tr><td></td></tr><tr></tr><tr><td></td></tr>

<tr><td><input type = "Submit" style="color:white;background-color:green;width:100%;height:150%"value ="Register"/></td></tr>

</table><br>
<form><a href="Login.jsp">Already have an account? Login Here </a><br>
</div>
</body>
</html>