

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Result")
public class Result extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		response.setCharacterEncoding("UTF-8"); // 1.charset �� contenttype ������ ��ܺκп��� ó���ؾ��Ѵ�.
//		response.setContentType("text/html; charset=UTF-8");
//		Util.ko(request, response); 4.���� ���ڵ��� ���õ� �޼ҵ带 ����� ȣ��
//		int cnt = Integer.parseInt(request.getParameter("cnt"));
//		String txt = request.getParameter("txt");
//		PrintWriter pw =  response.getWriter();
//		for(int i=0; i < cnt ; i++) {
//			pw.append((i+1)+","+ txt + "</br>");
//		}
		print(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		request.setCharacterEncoding("UTF-8"); // 2.post����� �޾ƿ��� ������(request)�� setCharacterEncoding�� ����Ѵ�. �����Ͱ� body�� ��ܿ��� �����̴�.
//		response.setCharacterEncoding("UTF-8");
//		response.setContentType("text/html; charset=UTF-8");
//		Util.ko(request, response);
		System.out.println("����Ʈ");
//		int cnt = Integer.parseInt(request.getParameter("cnt"));
//		String txt = request.getParameter("txt");
//		PrintWriter pw =  response.getWriter();
//		for(int i=0; i < cnt ; i++) {
//			pw.append((i+1)+","+ txt + "</br>");
//		}
		print(request, response);
	}
///////////3. ko��� �޼ҵ带 ���� �и��Ͽ� Ŭ���� ������ static�� ����Ͽ� �޸𸮸� �׻� �Ҵ��Ѵٸ� �Ź� ���ڵ��ؾ��� �ʿ䰡 ��������.	
//	public void ko(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		request.setCharacterEncoding("UTF-8"); 
//		response.setCharacterEncoding("UTF-8");
//		response.setContentType("text/html; charset=UTF-8");
//		
//	}
	
	private void print(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int cnt = Integer.parseInt(request.getParameter("cnt"));
		String txt = request.getParameter("txt");
		PrintWriter pw =  response.getWriter();
		for(int i=0; i < cnt ; i++) {
			pw.append((i+1)+","+ txt + "</br>");
		}
	} // doGet�� doPost�� ����κ��� �޼ҵ�ȭ ���� �ش� �޼ҵ带 ȣ���ϴ� ������� �Ѵٸ� ����ʿ� ����Ǵ� �κ��� �ѹ��� ó���Ҽ� �մ�.
}
