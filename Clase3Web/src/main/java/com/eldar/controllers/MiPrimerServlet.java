package com.eldar.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//a este servlet llegamos mediante la URL localhost:8080/Clase3Web/MiPrimerServlet
//@WebServlet("/MiPrimerServlet")
public class MiPrimerServlet extends HttpServlet {

	public MiPrimerServlet() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String teamColor = getServletConfig().getInitParameter("teamColor");

		// capturamos los parametros que se envian desde el form
		// utilizando su name del html
		String em = request.getParameter("email");
		String un = request.getParameter("uname");
		String pa = request.getParameter("pass");
		String ge = request.getParameter("gender");
		String[] co = request.getParameterValues("course");

		response.setContentType("text/html");

		PrintWriter pw = response.getWriter();
		pw.write("<h3>Recibi estos parametros en el Request Amego! </h3>");
		pw.write("<h3>Email:" + em + "</h3>");
		pw.write("<h3>User Name:" + un + "</h3>");
		pw.write("<h3>Genero:" + ge + "</h3>");
		pw.write("<h3>Cursos:");
		for (String aux : co) {
			pw.write(aux + " ");
		}
		pw.write("</h3>");

		/*
		 * PrintWriter pw = response.getWriter();
		 * 
		 * pw.write("<h2>Recibimos tu peticion y esto es un codigo html</h2>");
		 * pw.write("<h3>de volver a 2001 </h3>");
		 * pw.write("<h3>estamos viviendo la comvetibilidad </h3>");
		 */
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("llego el request por post amegooo!");
		doGet(request, response);
	}

}
