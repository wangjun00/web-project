<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
 <%@page import="java.util.*"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8");
	%>
	<center>
		<table border="1">
			<tr>
				<td>参数名称</td>
				<td>参数内容</td>
			</tr>
			<% 
			Enumeration enu=request.getParameterNames();
			
while(enu.hasMoreElements()){
		String paramName=(String)enu.nextElement();%>

			<tr>
				<td><%=paramName%></td>
				<td><%
				if(paramName.startsWith("**")){
					String paramValue[]=request.getParameterValues(paramName);
					for(int x=0;x<paramValue.length;x++){
						%>
						<%=paramValue[x]%>
						<%
					}
					
				}else{String paramValue=request.getParameter(paramName);
				%>
				<%=paramValue%>
				
				<%
				}
				%>
			
				
			</td>
			</tr>

<% } %>
	
		</table>




	</center>


</body>
</html>