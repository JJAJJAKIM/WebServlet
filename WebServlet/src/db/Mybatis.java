package db;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;




@WebServlet("/Mybatis")
public class Mybatis extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		String resource = "mybatis.xml";
//		InputStream inputStream = Resources.getResourceAsStream(resource);
//		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		// 위의 3줄은 mybatis 사용 및 connection pool을 생성하기 위한 코드
		
		SqlSession sql = Connec.getpool().openSession();

		int no = sql.selectOne("sql.test");
		System.out.println(no);
	}

}
