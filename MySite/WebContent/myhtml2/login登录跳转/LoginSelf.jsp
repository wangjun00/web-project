<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>有雾却黎</title>
<link rel="stylesheet" href="../Site/site.css" type=""text/css">
</head>
<body  class="big-img"bgcolor="black"><img height="400" id="showImg" src="" width="1440" />
<center><h3>——欢迎来到我的个人页面——</h3></center><hr><hr>
	<center><form action="LoginSelf.jsp" method="post">
		<p style="color:red">账&nbsp;号：</p> <input name="userName" type="text" /> <br /> 
		<p style="color:red">密&nbsp;码：</p><input name="passWord" type="password" /> <br /> 
		
		
		 <input name="submit" type="submit" value="登录" style="background-color:aqua;"/> 
		<input name="submit" type="reset" value="重置" style="background-color:aqua;" />
	
	</form></center>
	<!-- <div class="big-img"> -->
		<!-- <img height="400" id="showImg" src="" width="1440" /> -->
	<!-- </div> -->
	<div id="imgList">
		<img src="../tu/a.jpg" width="100" height="100"/>
		<img src="../tu/b.jpg" width="100" height="100"/>
		<img src="../tu/c.jpg" width="100" height="100"/>
		<img src="../tu/d.jpg" width="100" height="100"/>
	</div>
	<script type="text/javascript">
		var imgL = document.getElementById("imgList").getElementsByTagName(
				"img");
		var imgURL = "/";
		var bigImg = new Array("a.jpg","b.jpg","c.jpg", "d.jpg");
		var imgshow = new Image();
		for (var i = 0; i < imgL.length; i++) {
			(function() {
				var p = i
				imgL[i].onclick = function() {
					document.getElementById("showImg").src = this.src;
					imgshow.src = imgURL + bigImg[p];
					imgshow.onload = function() {
						document.getElementById("showImg").src = this.src;
					}
				}
			})()
		}
	</script>

	<%
		String userName = request.getParameter("userName");
		String passWord = request.getParameter("passWord");
		if(null != userName && null != passWord){
		if (  "wjnd".equals(userName) && passWord.equals("123")) {
			response.setHeader("refresh", "3;url=loginOK.jsp");
			session.setAttribute("userid", userName);
	%>
	
	<h1>登录成功！3秒后跳转到登录成功的页面！</h1>
	<h3>
		如果没有成功跳转，请点击<a href="loginOK.jsp">这里</a>进行手动跳转
	</h3>
	<%
		} else {
			response.setHeader("refresh", "0;url=off.jsp");
	%>
	
	
	

	<h1>登录失败，错误的用户名或者密码</h1>
	<% 
		}}
	%>
</body>
</html>