package com.wjnd.Servlet;

import java.io.IOException;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class Filter
 */
@WebFilter("/Filter")
public class Filter implements javax.servlet.Filter {

    /**
     * Default constructor. 
     */
	public void init(FilterConfig fConfig) throws ServletException {
		
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req=(HttpServletRequest) request;
		HttpSession ses=req.getSession();
		if (ses.getAttribute("userid")!=null) {
			chain.doFilter(request, response);
			
		}else {
			request.getRequestDispatcher("http://www.baidu.com");
		}
		
	}
   
	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	

}
