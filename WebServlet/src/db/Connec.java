package db;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Connec {
	
	
	private static SqlSessionFactory sqlSessionFactory;
	
	public static void pool() throws IOException {
		
		String resource = "mybatis.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		if(sqlSessionFactory == null)
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

	}
	
	public static SqlSessionFactory getpool() throws IOException {
		pool();
		return sqlSessionFactory;
	}
}
