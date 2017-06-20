package MyServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BServlet
 */
@WebServlet("/BServlet")
public class BServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置相应内容类型
		response.setContentType("text/html;charset=UTF-8");
		
		//利用创建printWriter对象，将内容输出到页面上
		PrintWriter out=response.getWriter();
	
		//输出内容：
		String title="Using GET Method to Read Form Data";
		String docType = "<!doctype html public \"-//w3c//dtd html 4.0 transitional//en\">";
        out.println(docType + 
                "<html>" + 
                    "<head>" +
                        "<title>" + title+ "</title>" +
                    "</head>" + 
                    "<body>"+ 
                        "<h1 align=\"center\">" + title + "</h1>" + "<ul>"+ 
                        "<li><b>username</b>:" + request.getParameter("username")+ 
                        "<li><b>password</b>:" + request.getParameter("password")+"</ul>" + 
                    "</body>" +
                "</html>");
    }

	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
