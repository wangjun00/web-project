package com.wjnd.Servlet;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * Servlet Filter implementation class EncodingFilter
 */
@WebFilter(
		urlPatterns = { "/EncodingFilter" }, 
		initParams = { 
				@WebInitParam(name = "charset", value = "GBK")
		})
public class EncodingFilter implements Filter {
			private String charSet;
			public void init(FilterConfig Config) throws ServletException {
				System.out.println("---------------过滤前");
				this.charSet=Config.getInitParameter("charset");
				System.out.println(charSet);
				System.out.println("---------------过滤后");
			}
			public void doGET(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException{
				
				
				
			}
			public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
					request.setCharacterEncoding(this.charSet);
				
			}
   
	
	public void destroy() {
		System.out.println("---------销毁");
	}

	
	

}
