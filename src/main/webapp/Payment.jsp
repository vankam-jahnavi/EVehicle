<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Payment</title>
    <!-- Add your CSS stylesheets and JavaScript files here -->
    <style>
        /* Example CSS for styling purposes */
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
        }
        header {
            background-color: green;
            color: #fff;
            padding: 20px;
            text-align: center;
        }
        form {
            margin: 0 auto;
            max-width: 400px;
            padding: 20px;
        }
        input[type="text"],
        input[type="number"],
        select {
            width: 100%;
            padding: 10px;
            margin: 5px 0;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
        }
        input[type="submit"] {
            background-color: #333;
            color: #fff;
            padding: 10px 20px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }
        input[type="submit"]:hover {
            background-color: #555;
        }
        footer {
            background-color: #333;
            color: #fff;
            padding: 10px 20px;
            text-align: center;
            position: fixed;
            bottom: 0;
            width: 100%;
        }
    </style>
</head>
<body style="background-image:url(1.jpg);background-repeat:no-repeat;background-size:100%200%">
    <header>
        <h1>Payment - EV slot booking system</h1>
    </header>
    
    <form action="payment" method="post">
    <fieldset style="width:80%;border:3px solid black;background-color:lightyellow;margin-top:2%"> 
    
    <label for="customerid">Customer id:</label>
        <input type="text" id="customerid" name="customerid" required>
        <label for="cardnumber">Card Number:</label>
        <input type="text" id="cardnumber" name="cardnumber" required>
        <label for="cvv">CVV:</label>
        <input type="number" id="cvv" name="cvv" required>
        <label for="paymentdate">Payment Date:</label>
        <input type="date" id="paymentdate" name="paymentdate" required><br><br>
        <label for="amount">Amount:</label>
        <input type="text" id="amount" name="amount" required><br><br>
        <label for="cardholdername">CardHolder Name:</label>
        <input type="text" id="cardholdername" name="cardholdername" required>
        
        <input type="submit" value="Pay Now">
        </fieldset>
    </form>
    <footer>
        <p>&copy; 2024 Online EV charging Slot Booking System. All rights reserved.</p>
    </footer>
</body>
</html>
