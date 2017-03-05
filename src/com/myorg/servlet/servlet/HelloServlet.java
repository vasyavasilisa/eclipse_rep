package com.myorg.servlet.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/begin.html")
public class HelloServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.service(arg0, arg1);
		doPost(arg0,arg1);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		PrintWriter out = resp.getWriter();

		out.println("<head>");
		out.println("<meta charset=UTF-8\">");
		out.println("<title>Server</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h4>Фамилия: </h4>");
		out.println("<h4>Имя: </h4>");
		out.println("<h4>Фамилия: </h4>");
		out.println("<h4>Имя:</h4>");
		out.println("<h4>Фамилия: </h4>");
		out.println("<h4>Имя: </h4>");
		out.println("<h4>Фамилия: </h4>");
		out.println("<h4>Имя:</h4>");
		out.println("<h4>Фамилия: </h4>");
		out.println("<h4>Имя: </h4>");
		out.println("<h4>Фамилия: </h4>");
		out.println("<h4>Имя:</h4>");
		out.println("<h4>Фамилия: </h4>");
		out.println("<h4>Имя: </h4>");
		out.println("<h4>Фамилия: </h4>");
		out.println("<h4>Имя:</h4>");
//////////////////////////////////////////////////
		////////////////////



	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	
	}
	
	

}
