<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="big-img">
		<img height="400" id="showImg" src="" width="1000" />
	</div>
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
</body>
</html>