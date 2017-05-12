<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%--这是我的第一个JSP文件 --%>
	<!-- 这是我的第一个JSP文件 -->
	<center>
		<%
			Date today = new Date();
			int hours = today.getHours();
			int minute = today.getMinutes();
			if (hours >= 0 && hours < 12) {
				out.println("<h1>早上好</h1>");
			} else if (hours >= 12 && hours < 19) {
				out.println("<h1>下午好</h1>");
			} else
				out.println("<h1>晚上好</h1>");
		%>
	</center>
</body>
</html>