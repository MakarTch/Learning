<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<link rel="stylesheet" href="Tut2.css">
</head>
<body>
<div class="navbar"></div>
<div class="content">
<h3>Add an alien</h3>
<form action="addAlien">
	<label for ="aid">Alien ID</label>
	<input type="text" name="aid" autocomplete="off"><br>
	<label for ="name">Alien Name</label>
	<input type="text" name="name" autocomplete="off"><br>
	<label for ="tech">Alien Tech</label>
	<input type="text" name= "tech" autocomplete="off"><br>
	<input type="submit"><br>
</form><br>

<h3>Get an alien</h3>
<form action="getAlien">
	<label for="aid">Alien ID</label>
	<input type="text" name="aid" autocomplete="off"><br>
	<input type="submit"><br>
</form><br>

<h3>Delete an alien, doesnt work</h3>
<form action="deleteAlien">
<label for="aid">Alien ID</label>
<input type="text" name="aid" autocomplete="off"><br>
<input type="submit"><br>
</form><br>

<form action="displayAliens">
<input type="text" name="color" autocomplete="off">
<input type="text" name="model" autocomplete="off">
<input type="text" name="brand" autocomplete="off">
<input type="submit">

</form>


</div>
</body>
</html>