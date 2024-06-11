package user;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import com.servlet.Utils;

import db.Connec;
import db.DBTable;


@WebServlet("/Listpage")
public class Listpage extends HttpServlet {
    
	private final String page = "user/List.jsp";
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		SqlSession sql = Connec.getpool().openSession();
		List<DBTable> list = sql.selectList("user.readAll");
		
		request.setAttribute("list", list);
		
		Utils.print(request, response, page);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		SqlSession sql = Connec.getpool().openSession();
		List<DBTable> list = sql.selectList("user.readAll");
		
		request.setAttribute("list", list);
			
		Utils.print(request, response, page);
	}

}
