<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!-- Esto es una directiva para utilizar la clase Date  -->

<%@ page import="java.util.Date"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mi JSP</title>
</head>
<body>

	<!-- atajo para comentario ctrl + shift + c -->


	<br>
	<!-- Comentario : Esto es un comentario HTML -->
	<%-- Comentario : Esto es un comentario JSP --%>


	<!-- Esto es un Scriplet -->
	<%
	out.print("hola mundo desde un jsp ");
	%>

	<!-- 	Esto es una Expresion JSP -->

	<%="Esto es una expresion"%>

	<!-- 	Utilizamos la clase Date (codigo java en un jsp) -->
	<%
	Date d = new Date();
	out.println("Fecha Actual: " + d);
	%>

	<br>
	<!--  Declaraciones en jsp -->
	<%!public static int contador = 7;%>
	<%
	out.print("Valor de la variable contador es : " + contador);
	%>

	<br>
	<!-- 	Navegador y version del sistema operativo , aqui utilizamos el obejeto Request previamente utilizado en los Servlet  -->
	<%
	out.print(request.getHeader("USER-AGENT"));
	%>


	<!-- resultado de una expresion aritmetica -->
	<%=(5 + 4) / 3%>




</body>
</html>