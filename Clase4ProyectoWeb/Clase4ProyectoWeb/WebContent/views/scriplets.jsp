<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!-- 	Directiva include  -->

<!-- Permite incluir el codigo almacenado en otro archivo en el lugar donde se indique esta directiva  -->
<!-- , especificando la rula a dicho archivo en el atributo file -->

<%@ include file="/navbar.html"%>


<%-- <%@ include file="/cabecera.jsp" %> --%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Ejemplo de Scriplet</h1>

	<%-- 	<% --%>
	<!-- 	// int numero = 7, factorial = 1; // for (int i = numero; i > 1; i--) { -->
	<!-- 	// factorial *= i; // } -->
	<%-- 	%> --%>

	<%-- 	se muestra el numero y el resultado del factorial  --%>

	<%-- 	<%="El factorial de <b>" + numero + "</b> es <b>" + factorial + "</b>"%> --%>

	<h3>Objetos que estan predefinidos para ser usados en un JSP</h3>

	request : permite obtener datos de la peticion http que se realiza ,
	Por ejemplo : los parametros GET y POST que son enviados a la pagina

	session : contiene los datos de sesion , permitiendo guardar iy
	recuperar informacion durante la figencia de la session out: posibilita
	enviar informacion a la salida HTML que se termina generando


	<!-- 		formulario que solicita al usuario el numero a usar en el calculo  -->

	<form action="scriplets.jsp" method="get">
		<p>
			Número: <input type="text" name="numero"> <input
				type="submit" value="Calcular">
		</p>
	</form>

	<%
	//A traves del objeto request se obtiene el valor pasado por el formulario 
	String numeroGet = request.getParameter("numero");

	if (numeroGet != null) {
		int numero = 0;
		double factorial = 1;
		boolean error = false;

		try {
			numero = Integer.valueOf(numeroGet);

			if (numero < 1) {
		error = true;
			} else {
		for (int i = numero; i > 1; i--) {
			factorial *= 1;
		}
			}
		} catch (NumberFormatException e) {
			error = true;
		}

		if (error) {
			out.print("<p> Debe indicar un numero entero mayor que cero </p>");
		} else {
			//mostramos el resultado en la pagina utulizando el objeto out 
			out.print("<p> Resultado : " + numero + " !=  " + factorial + "  </p>");
		}
	}

	//Uso del objeto session para contar las veces que se ejecuta nuestra aplicacion
	Integer contador = (Integer) session.getAttribute("contadorVisitas");

	if (contador != null) {
		contador = Integer.valueOf(contador);
	} else {
		contador = 0;
	}

	if (contador != 0) {
		out.println("<p>Ejecuciones de la aplicacion en esta sesión : " + contador + "</p>");
	}
	contador++;
	session.setAttribute("contadorVisitas", contador);
	%>



</body>
</html>