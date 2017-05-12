<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Session</title>
</head>
<body style="background:url('q.jpg')">
	<center><div style="background-color:transparency ; height:400px;width:300px"><form action="LoginSelf.jsp" method="post">
		<p style="font-style: italic;font-size: 30px">账&nbsp;&nbsp;号</p> <input name="userName" type="text"  /> <br /> 
		<p style="font-style: italic;font-size: 30px">密&nbsp;&nbsp;码</p> <input name="passWord" type="password" /> <br /> 
		 
		<input name="submit" type="submit" value="G&nbsp;&nbsp;O" /> 
		
	</form></div></center>

	<%
		String userName = request.getParameter("userName");
		String passWord = request.getParameter("passWord");
		if( (null != userName) && (null != passWord )) {
		if ( "wj".equals(userName) && passWord.equals("123")) {
			response.setHeader("refresh", "3;url=loginOK.jsp");
			session.setAttribute("userid", userName);
	%>
	<h1>登录成功！3秒后跳转到登录成功的页面！</h1>
	<h3>
		如果没有成功跳转，请点击<a href="loginOK.jsp">这里</a>进行手动跳转
	</h3>
	<%
		} else {
	%>
	<h1><jsp:forward page="off.jsp"/></h1>
	<% 
		}}
	%>
</body>
</html>