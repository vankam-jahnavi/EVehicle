<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
  <head>
    <title>Title</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
  </head>
  <body>
      
   
  </body>
  <br>
  <br>
  <br>
  <br>
  <br>
  <br>
  <div class="card w-50 container text-light mt-4 mb-4" id="card">
    <br>
    <br>
    <br>
    <form action="search" method="post" name="form1" class="mb-4" onsubmit="fun()">
       <center><mark class="bg-warning"><strong>Search Your Account Here</strong></mark></center> <br>
        <input type="text" name="uid" id="serch" class="form-control mb-2" placeholder="For Serch Enter Your Id Here">
        <br>
       <center> <input type="submit" value="search" class="btn btn-danger w-50"> </center>
        <a href="index.jsp" id="back" class="text-success"><h5>Home</h5></a>
    </form>
  </div>

  <style>
    #card:hover
    {
        box-shadow:3px 4px 50px blue;
    }
    a:hover
    {
        background-color: rgb(255, 9, 9);
    }
  </style>
</html>