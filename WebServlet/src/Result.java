

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
		
//		response.setCharacterEncoding("UTF-8"); // 1.charset 과 contenttype 설정은 상단부분에서 처리해야한다.
//		response.setContentType("text/html; charset=UTF-8");
//		Util.ko(request, response); 4.따로 인코딩과 관련된 메소드를 만들어 호출
//		int cnt = Integer.parseInt(request.getParameter("cnt"));
//		String txt = request.getParameter("txt");
//		PrintWriter pw =  response.getWriter();
//		for(int i=0; i < cnt ; i++) {
//			pw.append((i+1)+","+ txt + "</br>");
//		}
		print(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		request.setCharacterEncoding("UTF-8"); // 2.post방식은 받아오는 데이터(request)도 setCharacterEncoding을 써야한다. 데이터가 body에 담겨오기 때문이다.
//		response.setCharacterEncoding("UTF-8");
//		response.setContentType("text/html; charset=UTF-8");
//		Util.ko(request, response);
		System.out.println("포스트");
//		int cnt = Integer.parseInt(request.getParameter("cnt"));
//		String txt = request.getParameter("txt");
//		PrintWriter pw =  response.getWriter();
//		for(int i=0; i < cnt ; i++) {
//			pw.append((i+1)+","+ txt + "</br>");
//		}
		print(request, response);
	}
///////////3. ko라는 메소드를 따로 분리하여 클래스 생성후 static를 사용하여 메모리를 항상 할당한다면 매번 인코딩해야할 필요가 없어진다.	
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
	} // doGet과 doPost의 공통부분을 메소드화 시켜 해당 메소드를 호출하는 방식으로 한다면 기능쪽에 변경되는 부분을 한번에 처리할수 잇다.
}
