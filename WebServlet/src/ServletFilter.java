import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletFilter implements Filter {

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("chain전");
		req.setCharacterEncoding("UTF-8"); 
		res.setCharacterEncoding("UTF-8");
		res.setContentType("text/html; charset=UTF-8");
		chain.doFilter(req, res); // 그다음 Servlet으로 넘어가라는 의미.
		System.out.println("chain후");
	}

}
