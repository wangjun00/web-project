<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<% String Name=request.getParameter("userName"); 
String Pwd=request.getParameter("passWord");
if(Name.equals("QWE")&& Pwd.equals("123456")){
	%> 
	<jsp:forward page="loginError.html"/>
	<% }
else  %>
<jsp:forward page="loginCorrect.html"/>
	
	

%>

</body>
</html>