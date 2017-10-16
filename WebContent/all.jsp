
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@page import="java.util.*"%>
<%@page import="com.summer.pojo.*"%>
<!DOCTYPE HTML>
<html>
<head>
<link
	href="http://cdn.bootcss.com/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
<title>星空图书馆</title>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no" />
<link rel="stylesheet" href="assets/css/main.css" />
<noscript>
	<link rel="stylesheet" href="assets/css/noscript.css" />
</noscript>
<link
	href="http://cdn.bootcss.com/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">

<style type="text/css">
　　.item {
	style ='background: none;
	border: 0;
	width: 100px'
}
　
</style>
</head>
<body class="is-loading">
	<div id="wrapper">
		<header id="header">
			<a href="index.jsp" class="logo">back to cover</a>
		</header>
		<nav id="nav">
			<ul class="links">
				<li><a href="index.jsp">首页</a></li>
				<li class="active"><a href="BookListAction">书籍列表</a></li>
				<li><a href="search.jsp">查询作者</a></li>
				<li><a href="add.jsp">添加图书</a></li>
			</ul>
			<ul class="icons">
				<li><a href="#" class="icon fa-github"><span class="label">GitHub</span></a></li>
			</ul>
		</nav>
		<br> <br>
		<div class="container" style="background-color: #FAFAFA;padding: 40px;opacity:0.9;" >
			<br>
			<table  class="table table-hover" class="table table-condensed"
				class="table table-bordered" class="table table-striped">
				<tr>
					<th>ISBN</th>
					<th>Title</th>
					<th>name</th>
					<th>Publisher</th>
					<th>PublishDate</th>
					<th>Price</th>
					<th>age</th>
					<th>country</th>
					<th>ID</th>
					<th>Delete</th>
					<th>Update</th>
				</tr>

				<s:iterator value="#bkList">
					<s:form action="UpdateAction">
						<tr>
							<td><input name="ISBN" readonly="readonly"
								style='background: none; border: 0; width: 120px' type="text"
								value=<s:property value="ISBN" />></td>
							<td><input name="Title" readonly="readonly"
								style='background: none; border: 0; width: 100px' type="text"
								value=<s:property value="Title" />></td>
							<td><input name="name" width="30px"
								style='background: none; border: 0; width: 90px' type="text"
								value=<s:property value="name" />></td>
							<td><input name="Publisher"
								style='background: none; border: 0; width: 100px' type="text"
								value=<s:property value="Publisher"  />></td>
							<td><input name="PublishDate"
								style='background: none; border: 0; width: 100px' type="text"
								value=<s:property value="PublishDate"  />></td>
							<td><input name="Price" width="30px"
								style='background: none; border: 0; width: 60px' type="text"
								value=<s:property value="Price"   />></td>
							<td><input readonly="readonly" width="30px"
								style='background: none; border: 0; width: 60px' type="text"
								value=<s:property value="age" /> /></td>
							<td><input readonly="readonly" width="30px"
								style='background: none; border: 0; width: 60px' type="text"
								value=<s:property value="country" /> /></td>
							<td><input name="AuthorID" readonly="readonly"
								style='background: none; border: 0; width: 40px' type="text"
								value=<s:property value="AuthorID"   />></td>

							<td><a class="btn btn-default" role="button"
								href="DeleteAction?isbn=<s:property value="ISBN" />">Delete</a></td>
							<td><input type="submit" class="btn btn-default"
								value="Update"></td>


						</tr>
					</s:form>
				</s:iterator>

			</table>
		</div>
		<br> <br> <br> <br> <br>

		<script src="jquery-3.2.1.min.js"></script>
		<script src="bootstrap.min.js"></script>

		<div id="copyright">
			<ul>
				<li>Design: <a href="https://github.com/SummerChaser">Summer
						Chaser</a></li>
			</ul>
		</div>

		<script type="text/javascript">
			var name = document.getElementById("name").value;
			var Publisher = document.getElementById("Publisher").value;
			var PublishDate = document.getElementById("PublishDate").value;
			var Price = document.getElementById("Price").value;
		</script>
		<script src="assets/js/jquery.min.js"></script>
		<script src="assets/js/jquery.scrollex.min.js"></script>
		<script src="assets/js/jquery.scrolly.min.js"></script>
		<script src="assets/js/skel.min.js"></script>
		<script src="assets/js/util.js"></script>
		<script src="assets/js/main.js"></script>
</body>
</html>