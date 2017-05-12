<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<body>
	<p align="center">书柜展示</p>
	<hr>
	<table border="1" aligin="center">
		<tr>
			<jsp:include page="tu.html" flush="true"></jsp:include>
		</tr>
		<tr>
			<td bgcolor="grenn"><jsp:include page="book2.html" flush="true"></jsp:include></td>
			<td bgcolor="yellow"><jsp:include page="book1.html" flush="true"></jsp:include></td>
		</tr>
		<tr>
			<td bgcolor="pink"><jsp:include page="book3.html" flush="true"></jsp:include></td>
			<td bgcolor="red"><jsp:include page="book4.html" flush="true"></jsp:include></td>
		</tr>

	</table>

</body>
</html>