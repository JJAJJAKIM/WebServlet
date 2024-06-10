package user;

import java.io.IOException;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import com.servlet.Utils;

import db.Connec;
import db.DBTable;


@WebServlet("/Insert")
public class Insert extends HttpServlet {

	//private final String page = "user/Select.jsp";
	
	/* *************** 내가 작성한 부분 주석처리 *************************
	 * protected void doPost(HttpServletRequest request, HttpServletResponse
	 * response) throws ServletException, IOException {
	 * 
	 * boolean key = false; String name = request.getParameter("name"); String email
	 * = request.getParameter("email"); String pwd = request.getParameter("pwd");
	 * int gender = Integer.parseInt(request.getParameter("gender"));
	 * 
	 * Connection conn = null; PreparedStatement pstmt = null;
	 * 
	 * try { String url = "jdbc:mariadb://localhost:23306/edu"; String user =
	 * "root"; String password = "1234";
	 * 
	 * Class.forName("org.mariadb.jdbc.Driver"); conn =
	 * DriverManager.getConnection(url, user, password); String sql =
	 * "INSERT INTO user VALUES (?,?,?,?)"; pstmt = conn.prepareStatement(sql);
	 * pstmt.setString(1, name); pstmt.setString(2, email); pstmt.setString(3, pwd);
	 * pstmt.setInt(4, gender); pstmt.executeUpdate();
	 * 
	 * key = true; pstmt.close(); conn.close();
	 * 
	 * } catch (SQLException | ClassNotFoundException e) { e.printStackTrace(); }
	 * 
	 * request.setAttribute("name", name); request.setAttribute("email", email);
	 * request.setAttribute("pwd", pwd); request.setAttribute("gender", gender);
	 * 
	 * Utils.print(request, response, page);
	 * 
	 * }
	 ************************************************************************/
	 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 DBTable dto = new DBTable();
		 
		 dto.setName(request.getParameter("name"));
		 dto.setEmail(request.getParameter("email"));
		 dto.setPwd(request.getParameter("pwd"));
		 dto.setGender(request.getParameter("gender"));
		 
//		 String name = request.getParameter("name");
//		 String email = request.getParameter("email");
//		 String pwd = request.getParameter("pwd");
//		 String gender = request.getParameter("gender");
		 
		 Map<String, String> userMap = new HashMap<String, String>();
		 userMap.put("name", dto.getName() );
		 userMap.put("email", dto.getEmail() );
		 userMap.put("pwd", dto.getPwd());
		 userMap.put("gender", dto.getGender());
		 
		 SqlSession sql = Connec.getpool().openSession();
		 int status = sql.insert("user.add", userMap);
		 System.out.println("상태값 : "+ status );
		 sql.commit();
		 
//		 Utils.print(request, response, page);
	  
	  }
}
