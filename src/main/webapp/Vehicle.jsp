<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Vehicle details page</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<style>
.myborder{
margin-top:8%;
margin-left:28%;
border:2px solid black;
width:50%;
height:50%;
font-size:150%;
text-align:center;
background-color:lightyellow;
}
a{color:black;}
</style>
</head>
<body style="background-color:#F1B9FE ">
<form action="vehicleDetails" method="post">
<div class="myborder">
<h1 style="color:red"> Vehicle Details</h1><br>
<div class="row">
	<div class="col-md-6"> 
	<label> Vehicle Number:</label>
	</div>
		<div class="col-md-6">
		<input type="text" name="vno" placeholder="Enter vehicle number" required> 
		</div>

</div><br>

<div class="row">
	<div class="col-md-6"> 
	<label> Vehicle name:</label>
	</div>
		<div class="col-md-6">
		<input type="text" name="vname" placeholder="Enter vehicle name" required> 
		</div>

</div><br>
<div class="row">
	<div class="col-md-6"> 
	<label> Vehicle Type</label>
	</div>
		<div class="col-md-6">
		<input type="text" name="vtype" placeholder="Enter vehicle type" required> 
		</div>

</div><br>
<div class="row">
	<div class="col-md-6"> 
	<label> Vehicle model:</label>
	</div>
		<div class="col-md-6">
		<input type="text" name="vmodel" placeholder="Enter vehicle model" required> 
		</div>

</div><br>
<div class="row">
	<div class="col-md-6"> 
	<label> Color:</label>
	</div>
		<div class="col-md-6">
		<input type="text" name="vcolor" placeholder="Enter vehicle color" required> 
		</div>

</div><br>

<div class="row">
                
                <div class="col-md-12">
                    <button class="btn btn--radius btn--blue" type="submit" name="submit" style="background-color: green;color: white">Submit</button>
                </div>
                </div><br>
                

<%---main div --%>
</div>
</form>
</body>
</html>