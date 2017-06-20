package MyServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyLoginServlet
 */
@WebServlet(description = "this is textServlet", urlPatterns = { "/MyLoginServlet" })
public class MyLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*response.getWriter().append("Served at: ").append(request.getContextPath());*/
	
	response.setContentType("text/html;charset=GB2312");
	PrintWriter out=response.getWriter();
	out.println("<HTML>");
	out.println("<HEAD><TITLE>用servlet测试get/post方法</TITLE></HEAD>");
	out.println("<BODY>");
	out.println("<H2>调用了doGet（）方法</H2><P>");
	out.println("<H2>用户输入信息如下：</H2>");
	request.setCharacterEncoding("utf-8");
	String username=request.getParameter("username");
	if(username==null ||username=="")
			username="未输入";
	String userpwd=request.getParameter("password");
	if(userpwd==null ||userpwd=="")
			userpwd="未输入";
	out.println("<H2>用户名:"+username+"</H2>");
	out.println("<H2>密码："+userpwd+"</H2>");
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
