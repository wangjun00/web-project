<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Success</title>
<link rel="stylesheet" href="../Site/site.css" type=""text/css">
</head>
<body id="b">
	<%
		String userid = (String) session.getAttribute("userid");
	%>

	<%
		if (null != userid) {
	%>
	<h2>亲爱的<span><%=userid%></span>
		您好，欢迎您登录本系统！
	</h2>
	<hr />
	
	<a href="loginOut.jsp">离开</a>
	<%
		} else {
	%>
	<h2>
		请先进行系统登录！<a href="LoginSelf.jsp"> 登录</a>
	</h2>
	<%
		}
	%>

</body>
</html>