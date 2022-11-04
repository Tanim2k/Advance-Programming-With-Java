<%--
  Created by IntelliJ IDEA.
  User: TANIM
  Date: 11/4/2022
  Time: 3:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculation</title>
</head>
<body>
<!doctype html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>Calculation !</title>
</head>
<body>

<form action="processform" method="post">
    <div class="container mt-5">
        <h2 class="Text-center"> Calculator</h2>
        <div class="form-group">

            <label for="quantity">First number:</label><br>
            <input type="number" id="quantity" name="quantity" ><br>
            <label for="quantity2">Second number:</label><br>
            <input type="number" id="quantity2" name="quantity2" ><br>

        </div>

        <input type="radio" id="Sum" name="calculator" value="Summation">
        <label for="Sum">Summation</label><br>
        <input type="radio" id="Sub" name="calculator" value="Subtraction">
        <label for="Sub">Subtraction</label><br>

        <input type="radio" id="Mul" name="calculator" value="Multiplication">
        <label for="Mul">Multiplication</label><br>

        <input type="radio" id="div" name="calculator" value="Division">
        <label for="div">Division</label><br>



        <button type="submit" class="btn btn-success">Submit</button>
    </div>

</form>

<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>
</body>
</html>
