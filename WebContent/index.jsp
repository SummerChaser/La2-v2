<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<!DOCTYPE HTML>
<html>
<head>
<title>星空图书馆</title>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no" />
<link rel="stylesheet" href="assets/css/main.css" />
<noscript>
	<link rel="stylesheet" href="assets/css/noscript.css" />
</noscript>
</head>
<body class="is-loading">
	<div id="wrapper" class="fade-in">
		<div id="intro">
			<h1>
				HIT<br />Library System<br /> <br />
			</h1>
			<p>
				This is a easy library management system <br /> enjoy the reading
				now
			</p>
			<ul class="actions">
				<li><a href="#header"
					class="button icon solo fa-arrow-down scrolly">Continue</a></li>
			</ul> 
		</div>

		<header id="header">
			<a href="index.jsp" class="logo">Back to Cover</a>
		</header>

		<nav id="nav">
			<ul class="links">
				<li class="active"><a href="index.jsp">首页</a></li>
				<li><a href="BookListAction">书籍列表</a></li>
				<li><a href="search.jsp">查询作者</a></li>
				<li><a href="add.jsp">添加图书</a></li>
			</ul>
			<ul class="icons">
				<li><a href="https://github.com/SummerChaser" class="icon fa-github"><span class="label">GitHub</span></a></li>
			</ul>
		</nav>

		<div id="main" style="opacity:0.9;">
			<article class="post featured">
				<header class="major">
					<span class="date">April 25, 2017</span>
				   <h2 style="font-size: 40px">
						<a href="BookListAction">Click<br />
						</a>
					</h2> 
					<p>
					Click the button <br /> you can browse the book list
					<br /> you can also modify the information on the table 
					<br /> ( you can delete a item or change author name , publisher , publish date  )
					</p>
					
					
					<a href="BookListAction" class="image fit"><img src="images/c.png" alt="" /></a>
				</header>
			</article>

		</div>
		
		<div id="copyright">
			<ul>
				<li>Design: <a href="https://github.com/SummerChaser">Summer Chaser</a></li>
			</ul>
		</div>

		<!-- Scripts -->
		<script src="assets/js/jquery.min.js"></script>
		<script src="assets/js/jquery.scrollex.min.js"></script>
		<script src="assets/js/jquery.scrolly.min.js"></script>
		<script src="assets/js/skel.min.js"></script>
		<script src="assets/js/util.js"></script>
		<script src="assets/js/main.js"></script>
</body>
</html>