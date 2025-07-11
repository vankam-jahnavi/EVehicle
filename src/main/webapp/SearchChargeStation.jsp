<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search charging station</title>
<style>
.myloc{
margin-top:15%;
margin-left:37%;
}
h2{font-size:180%}
table{border:2px solid black;font-size:200%}
input{font-size:70%}
</style>
</head>
<body>
<div class="myloc">
<h2>Search charging station</h2>
<form action="search_charge_station" method="post">
<table>
<tr><th>Location</th></tr>
<tr><td><input type="text" name="location" placeholder="Enter staion location"></td>
</tr>
<tr><td><input type="submit" style="width:100%;height:5%;background-color:green;color:white;margin-bottom:5%;" value="Search"/></td></tr>
</table><br>

</form>
</div>
</body>
</html>