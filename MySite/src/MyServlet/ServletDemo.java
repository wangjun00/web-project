package MyServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletDemo
 */
@WebServlet("/ServletDemo")	//方法一：在WEB-INF中web.xml里配置；方法二：使用注解的方式配置；
public class ServletDemo extends HttpServlet {//继承与httpServlet的ServletDemo类；
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletDemo() {//空参构造函数
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//重写doGet方法
	
	response.setContentType("text/html;Charset=UTF-8");//设置生成的文档类型
		PrintWriter out =response.getWriter();
		out.println("<HTML>");
		out.println("<BODY>");
		out.println("<H2>我们正在学习Servlet编程</H2>");
		out.println("<H3>现在的时间是："+new Date()+"</H3>");
		out.println("</BODY>");
		out.println("</HTML>");
		out.close();
	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		

		
	}

}
