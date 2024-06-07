package com.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Result")
public class Result extends HttpServlet {
	
	private final String page = "Result.jsp";
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		Utils.print(request, response, page);
		int cnt = Integer.parseInt(request.getParameter("cnt"));
		String txt = request.getParameter("txt");
		System.out.println(cnt + " , " + txt);
		
		request.setAttribute("cnt", cnt); // setAttribute(String name,Object o) 형식으로 앞에는 String 이름으로 받는다.
		request.setAttribute("txt", txt);
		
		Utils.print(request, response, page);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int cnt = Integer.parseInt(request.getParameter("cnt"));
		String txt = request.getParameter("txt");
		System.out.println(cnt + " , " + txt);
		
		request.setAttribute("cnt", cnt); // setAttribute(String name,Object o) 형식으로 앞에는 String 이름으로 받는다.
		request.setAttribute("txt", txt);
		
		Utils.print(request, response, page);
		}

}
