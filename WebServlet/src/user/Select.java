package user;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.servlet.Utils;

import db.DBTable;

@WebServlet("/Select")
public class Select extends HttpServlet {
	
	private final String page = "user/Select.jsp";
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DBTable dto = new DBTable();

		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String pwd = request.getParameter("pwd");
		String gender = request.getParameter("gender");
		
		request.setAttribute("name", name );
		request.setAttribute("email", email);
		request.setAttribute("pwd", pwd);
		request.setAttribute("gender", gender);
		
		Utils.print(request, response, page);
	}

}
