<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Juego</title>
</head>
<body>
Juego
<h1 id="guess"></h1>
<p>Ingrese una letra:
<form action="http://localhost:8080/ahorcado/game" id="forma">
<input type="text" name="letter" id="letter" />
<input type="submit" name="inputletter" id="inputletter" value="Input Letter"/>
</form>
</p>
</body>
</html>