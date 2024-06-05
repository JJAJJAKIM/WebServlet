

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Result")
public class Result extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setCharacterEncoding("UTF-8"); // charset 과 contenttype 설정은 상단부분에서 처리해야한다.
		response.setContentType("text/html; charset=UTF-8");

		int cnt = Integer.parseInt(request.getParameter("cnt"));
		String txt = request.getParameter("txt");
		PrintWriter pw =  response.getWriter();
		for(int i=0; i < cnt ; i++) {
			pw.append((i+1)+","+ txt + "</br>");
		
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8"); // post방식은 받아오는 데이터(request)도 setCharacterEncoding을 써야한다. 데이터가 body에 담겨오기 때문이다.
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		int cnt = Integer.parseInt(request.getParameter("cnt"));
		String txt = request.getParameter("txt");
		PrintWriter pw =  response.getWriter();
		for(int i=0; i < cnt ; i++) {
			pw.append((i+1)+","+ txt + "</br>");
		}
	}

}
