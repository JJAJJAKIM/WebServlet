package user;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import com.servlet.Utils;

import db.Connec;
import db.DBTable;


@WebServlet("/Update")
public class Update extends HttpServlet {
	
	private final String page = "user/Update.jsp";
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String no = request.getParameter("no");
		
		SqlSession sql = Connec.getpool().openSession();
		DBTable dto = sql.selectOne("user.readOne", no);
		
		request.setAttribute("user", dto);
				
		Utils.print(request, response, page);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String no = request.getParameter("no");
		
		SqlSession sql = Connec.getpool().openSession();
		DBTable dto = sql.selectOne("user.readOne", no);
		
		request.setAttribute("user", dto);
				
		Utils.print(request, response, page);
	}

}
