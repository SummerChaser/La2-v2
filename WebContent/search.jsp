<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE HTML>
<!--
	Massively by HTML5 UP
	html5up.net | @ajlkn
	Free for personal and commercial use under the CCA 3.0 license (html5up.net/license)
-->
<html>
<head>
<title>星空图书馆</title>
<link
	href="http://cdn.bootcss.com/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no" />
<link rel="stylesheet" href="assets/css/main.css" />
<noscript>
	<link rel="stylesheet" href="assets/css/noscript.css" />
</noscript>
</head>
<body class="is-loading">

	<!-- Wrapper -->
	<div id="wrapper">

		<!-- Header -->
		<header id="header">
			<a href="index.jsp" class="logo">Back to Cover</a>
		</header>

		<!-- Nav -->
		<nav id="nav">
			<ul class="links">
				<li><a href="index.jsp">首页</a></li>
				<li><a href="BookListAction">书籍列表</a></li>
				<li class="active"><a href="search.jsp">查询作者</a></li>
				<li><a href="add.jsp">添加图书</a></li>

			</ul>
			<ul class="icons">
				<li><a href="#" class="icon fa-github"><span class="label">GitHub</span></a></li>
			</ul>
		</nav>

		<!-- Main -->
		<div id="main"  style="opacity:0.9;">

			<!-- Post -->
			<section class="post">

				<h2 align="center">Search Author</h2>

				<!-- Text stuff -->
				<p></p>
				<hr />
				
					<s:form action="SearchAuthorAction">
						

							<h3>Author Name :</h3>
							<input type="text" placeholder="Search" name="name"><br><br>
							<button type="submit">查询作者</button>
						
						

					</s:form>
		</div>



		<div id="copyright">
			<ul>
				<li>Design: <a href="https://github.com/SummerChaser">Summer Chaser</a></li>
			</ul>
		</div> 

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