package com.wjnd.javaweb;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloWord extends HttpServlet {
	private String message;
	public void  init() throws ServletException{
			
	message ="HelloWord";		
	}
	
	public void doGet(HttpServletRequest request,
			HttpServletResponse response)
	throws ServletException, IOException{
		response.setContentType("text/html");
		
		PrintWriter out =((ServletResponse) request).getWriter();
		out.println("<h1>" + message +"</h1>");
		
	}
	public void destroy(){
		
	}
	

}
