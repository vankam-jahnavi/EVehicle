<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Charging Station</title>
<style>
.myborder{
margin-top:15%;
margin-left:25%;
border:2px solid black;
width:50%;
height:50%;
font-size:150%;
text-align:center;
background-color:lightyellow;
}
</style>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

</head>
<body style="background-color:lightskyblue">
<form action="Displaying_Charge_station" method="post">
<div class="myborder">
<h1 style="color:red"> Charge Station</h1><br>

<div class="row">
	<div class="col-md-4"> 
	<label> Location:</label>
	</div>
		<div class="col-md-4">
		<input type="text" name="location" placeholder="Enter station location" required> 
		</div>                
        <div class="col-md-4">
        <input type="submit" value="Book" style="color:white;background-color:green"/>
        </div><br><br><br><br>
</div>
</div>
</form>
</body>
</html>