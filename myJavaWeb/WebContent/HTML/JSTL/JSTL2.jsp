<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String[] books = { "水浒", "三国", "红楼", "西游记" };
		request.setAttribute("book", books);
	%>
	全部书目：
	<br />
	<c:forEach var="bookName" items="${book}">
${bookName}<br>
	</c:forEach>
	显示从10到15的整数值：
	<br />
	<c:forEach var="i" begin="1" end="100" step="2">
${i}&nbsp;
</c:forEach>
	<c:forEach var="i" begin="1" end="100" step="3">
${i}&nbsp;
</c:forEach>

</body>
</html>