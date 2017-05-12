<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>include.jsp</title>
</head>
<body>
	<%-- <% int x=100;%>
<h1>include.jsp--<%=x%></h1>
<%@include file="NewFile.jsp" %>
<jsp:include page="forward.jsp"/> --%>
	<!-- ——————————————————————————————————————————————————————————————————————————————————————————————  -->
	<%-- <%request.setAttribute("name", "ND"); %>
 <%request.setAttribute("info", "appq"); %> 
<jsp:forward page="forward.jsp">
	
	<jsp:param name="name" value="wjnd"/>
	<jsp:param name="info" value="app"/>
</jsp:forward>  --%>

	<%-- <%pageContext.setAttribute("name", "WJ") ;%>
<%pageContext.setAttribute("age", "22"); %> --%>
	<!-- pageContext只能在本页面进行操作 不能跳转页面-->
 <%
		application.setAttribute("name", "HeFei");
		application.setAttribute("time", new Date());
	%> 
	<%-- <%
		request.setAttribute("name", "HeFei");
		request.setAttribute("time", new Date());
	%> --%>
 <jsp:forward page="forward.jsp">
 
 
 
 </jsp:forward> 
	<!-- 自动跳转 -->

	<!--  <a href="forward.jsp" target="_blank" >点击跳转</a> -->
	<!-- 超链接跳转 -->
	
<%response.setHeader("refresh", "3;url=forward.jsp"); %>
	
 	<h3>name是： ${name}</h3>
	<h3>time是： ${time}</h3> 


























</body>
</html>