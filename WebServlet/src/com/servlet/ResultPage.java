package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ResultPage")
public class ResultPage extends HttpServlet {


	private final String page = "Result.jsp";
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int cnt = Integer.parseInt(request.getParameter("cnt"));
		String txt = request.getParameter("txt");
		System.out.println(cnt + " : "+ txt);
		
		request.setAttribute("cnt", cnt);
		request.setAttribute("txt", txt);
		
		Utils.print(request, response, page); // ��û�̶�� ������ ��� �־ ���� response�� ������� ������ ����.
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Utils.print(request, response, page);
	}

}
