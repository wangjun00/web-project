<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="javax.servlet.http.Cookie" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>forward.jsp</title>
</head>
<body>
	<h1>这是跳转后页面的内容</h1>
	<hr>
	<%-- <h3>参数一：<%=request.getParameter("name") %></h3>
<h3>参数二：<%=request.getParameter("info") %></h3>  
<h3>参数三：${name}</h3>
<h3>参数四：${info}</h3> --%>



	<h3>参数三：${name}</h3>
	<h3>参数四：${time}</h3>
	
	
	
	<%-- <h3>参数三：${requestScope.name}</h3>
		<h3>参数四：${requestScope[time]}</h3> --%>


</body>
</html>