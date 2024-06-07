package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Utils {
	
	public static void print(HttpServletRequest request, HttpServletResponse response, String page) throws ServletException, IOException {
		String root = "/WEB-INF/views/";
		RequestDispatcher view = request.getRequestDispatcher(root.concat(page)); //concat 은 문자와 문자를 합치는 메소드
		view.forward(request, response); 
	}

}
