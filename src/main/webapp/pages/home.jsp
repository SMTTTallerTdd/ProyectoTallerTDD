<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>El Ahorcado</title>
</head>
<body>
<% 
String error = request.getParameter("error");
if(error!=null)
	out.println("<h3>Palabra Inválida</h3>");
%>
<p>Ingrese la palabra:
<form action=beginGame>
<input type="text" name="word" id="word" />
<input type="submit" name="begin" id="begin" value="begin"/>
</form></p>
</body>
</html>