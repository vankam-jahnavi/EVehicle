<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Charging Station</title>
<style>
.myborder{
margin-top:3%;
margin-left:27%;
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
<div class="myborder"><br>
<h1 style="color:red"> User Booking</h1><br>
<form action="bookdetails" method="post">
<div class="row">
	<div class="col-md-6"> 
	<label> User Id:</label>
	</div>
		<div class="col-md-6">
		<input type="text" name="uid" placeholder="Enter User Id" required> 
		</div>

</div><br>
<div class="row">
	<div class="col-md-6"> 
	<label> Vehicle No:</label>
	</div>
		<div class="col-md-6">
		<input type="text" name="vno" placeholder="Enter Vehicle Number" required> 
		</div>

</div><br>
<div class="row">
	<div class="col-md-6"> 
	<label> Model Name:</label>
	</div>
		<div class="col-md-6">
		<input type="text" name="vmodel" placeholder="Enter model name" required> 
		</div>

</div><br>
<div class="row">
	<div class="col-md-6"> 
	<label>Customer Name</label>
	</div>
		<div class="col-md-6">
		<input type="text" name="uname" placeholder="Enter customer name" required> 
		</div>

</div><br>
<div class="row">
	<div class="col-md-6"> 
	<label>Location</label>
	</div>
		<div class="col-md-6">
		<input type="text" name="location" placeholder="Enter EV Slot Location " required> 
		</div>

</div><br>

<div class="row">
	<div class="col-md-6"> 
	<label>Date:</label>
	</div>
		<div class="col-md-6">
		<input type="date" name="vdate"  required> 
		</div>

</div><br>
<div class="row">
	<div class="col-md-6"> 
	<label> Time:</label>
	</div>
		<div class="col-md-6">
		<input type="time" name="vtime" placeholder="Enter station location" required> 
		</div>

</div><br>

<div class="row">
                
                <div class="col-md-5">
                     <input type="submit" style="background-color:pink;color:blue" value="Book"/>
                </div><br><br>
</div></form>
</div>

</body>
</html>