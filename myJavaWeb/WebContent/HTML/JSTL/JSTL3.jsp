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
		String address = "Beijin,vShanghai;vNanjin!vXian,vJinan";
		request.setAttribute("address", address);
	%>
	<c:forTokens items="${address}" delims="v" var="addr"
		varStatus="status">
${status.count}、${addr}<br />
	</c:forTokens>
</body>
</html>