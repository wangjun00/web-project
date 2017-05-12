<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"  import="com.wjnd.javaweb.*"%>

<%-- <%@ page import="com.wjnd.javaweb.*"%> --%>
<jsp:useBean id="book" class="com.wjnd.javaweb.bean" scope="page">
	<jsp:setProperty property="bookName" name="book" />
	<jsp:setProperty property="bookNum" name="book" />
</jsp:useBean>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>订购图书清单</p>
	<hr/>
	<span>书名：</span><jsp:getProperty property="bookName" name="book" />
	<br>
	<span>数量：</span><jsp:getProperty property="bookNum" name="book" />
	<br>
</body>
</html>











