<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>EV Charging Profile</title>
    <style>
    }
    body {
    font-family: Arial, sans-serif;
    margin: 0;
    padding: 0;
}

.navbar {
    background-color: #333;
    overflow: hidden;
}

.navbar ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
}

.navbar ul li {
    float: left;
}

.navbar ul li a {
    display: block;
    color: white;
    text-align: center;
    padding: 14px 20px;
    text-decoration: none;
}

.navbar ul li a:hover {
    background-color: #ddd;
    color: black;
}

.container {
    max-width: 800px;
    margin: 20px auto;
}

h1, h2 {
    text-align: center;
    color: white;
    font-size:250%;
    background-color:green;
}

.section {
    margin-bottom: 20px;
}
    </style>
</head>
<body style="background-image:evcar.jpg">
<h1 >Electric vehicle charging slot booking and payment management </h1>
    <nav class="navbar">
        <ul>
            <li><a href="Vehicle.jsp">Vehicle Details</a></li>
            <li><a href="SearchChargeStation.jsp">Search Charge Station</a></li>
            <li><a href="DisplayCharge.jsp">Slot Checking</a></li>
            <li><a href="EVBookingDetails.jsp">Slot Booking</a></li>
            <li><a href="Payment.jsp">Payment Page</a></li>
        </ul>
    </nav><br><br>
<marquee style="font-size:150%">Note:<lable style="color:red">*Before going to conform your station please search the <b>Charge Stations<b>s*</marquee>
  
</body>
</html>