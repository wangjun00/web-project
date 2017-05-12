<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>



</head>


<%
	pageContext.setAttribute("color", "red");
	request.setAttribute("color", "yellow");
	session.setAttribute("color", "black");
	application.setAttribute("color", "pink");
%>

<body<%-- bgcolor=${requestScope["color"]} --%>>






	<%
		pageContext.setAttribute("info", "page");
	%>
	<%
		request.setAttribute("info", "request");
	%>
	<%
		session.setAttribute("info", "session");
	%>
	<%
		application.setAttribute("info", "application");
	%>

	<h1>${pageScope.info}</h1>
	<h1>${requestScope.info}</h1>
	<h1>${sessionScope.info}</h1>
	<h1>${applicationScope.info}</h1>
	<hr>
	<table border="1">
		<tr>
			<td>关系运算符</td>
			<td>说 明</td>
			<td>范 例</td>
			<td>结 果</td>
		</tr>

		<tr>
			<td>==或eq</td>
			<td>等于</td>
			<td>${"${"}1==1}或${"${"} 1eq1}</td>
			<td>${ 1==1 }或${ 1 eq 1 }</td>
		</tr>
		<%-- <tr>
			<td>!= 或 ne</td>
			<td>不等于</td>
			<td>${"${"}1!=1}或${"${"} 1 ne 1}</td>
			<td>${ 1 != 1 }或${ 1 ne 1 }</td>
		</tr> --%>
		<tr>
			<td>< 或 lt</td>
			<td>小于</td>
			<td>${"${"}3 < 5}或${"${"} 3 lt 5}</td>
			<td>${ 3 < 5}或${3 lt 5}</td>
		</tr>
		<tr>
			<td>> 或 gt</td>
			<td>大于</td>
			<td>${"${"}3 > 5}或${"${"} 3 gt 5}</td>
			<td>${ 3 > 5}或${3 gt 5}</td>
		</tr>
		<tr>
			<td><= 或 le</td>
			<td>小于等于</td>
			<td>${"${"}3 <= 5}或${"${"} 3 le 5}</td>
			<td>${ 3 <= 5}或${3 le 5}</td>
		</tr>
		<tr>
			<td>>= 或 ge</td>
			<td>大于等于</td>
			<td>${"${"}3 >= 5}或${"${"} 3 ge 5}</td>
			<td>${ 3 >= 5}或${3 ge 5}</td>
		</tr>
	</table>
	<hr>
	
	<h3>IP地址： ${pageContext.request.remoteAddr }</h3>
	<h3>SESSION ID: ${pageContext.session.id }</h3>
 	<h3>是否是新 session： ${pageContext.session}</h3> 
 	<h3>是否是新 session： ${pageContext.session.creationTime}</h3> 
 	<h3>是否是新 session： ${pageContext.session.servletContext}</h3> 
 	<hr>
  
 	
	
	
	
	
	
</body>
</html>