
<%@page import="javax.sound.midi.MidiDevice.Info"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.*"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div><%
	Map map=new HashMap();
	map.put("midn","www.MLDNJAVA.cn");
	map.put("lxh","LIXH");
	map.put("lxhds","LIXHgdsfgr");
	pageContext.setAttribute("ref", map);
	%>
	<c:forEach items="${ref}" var="mem">
		<h3>${mem.key}-->${mem.value}</h3>
	</c:forEach></div><hr>
	
	<% 
	List all=new ArrayList();
	all.add("www.");
	all.add("baidu.");
	all.add("com");
	pageContext.setAttribute("qq", all);
	%>
	<h3>输出全部：
	<c:forEach items="${qq}" var="mem">
			${mem}
	</c:forEach>
	</h3><hr>
	<%
		String inforString[]={"www.","baidu.","com"};
	pageContext.setAttribute("ee", inforString);
	
	%>
	<h3>输出全部：
	<c:forEach items="${ee}" var="mem">
		${mem}
	</c:forEach></h3>
	
<h3>输出全部（间隔为二）：
<c:forEach items="${ee}" var="mem" step="2">
	${mem}
</c:forEach></h3>
<h3>输出前两个：
<c:forEach items="${ee}" var="mem" begin="0" end="1">
${mem}
</c:forEach></h3>

	
</body>
</html>