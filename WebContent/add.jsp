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
				<li><a href="search.jsp">查询作者</a></li>
				<li class="active"><a href="add.jsp">添加图书</a></li>

			</ul>
			<ul class="icons">
				<li><a href="#" class="icon fa-github"><span class="label">GitHub</span></a></li>
			</ul>
		</nav>

		<div id="main"  style="opacity:0.9;">
			<s:form class="form-horizontal" action="AddAction"
				onsubmit="return check();">
				<div class="field">
					<label for="name">ISBN</label>

					<s:textfield id="ISBN" class="form-control" name="bk.ISBN"
						placeholder="5623"></s:textfield>

				</div>
				<div class="field">
					<label for="name">Title</label>

					<s:textfield id="Title" class="form-control" name="bk.Title"
						value="数据结构"></s:textfield>

				</div>
				<div class="field">
					<label for="inputEmail3" class="col-sm-2 control-label">Publisher</label>

					<s:textfield id="Publisher" class="form-control"
						name="bk.Publisher" value="清华出版"></s:textfield>

				</div>
				<div class="field">
					<label for="inputEmail3" class="col-sm-2 control-label">PublishDate</label>

					<s:textfield id="PublishDate" class="form-control"
						name="bk.PublishDate" value="2007-03-20"></s:textfield>

				</div>
				<div class="field">
					<label for="inputEmail3" class="col-sm-2 control-label">AuthorID</label>

					<s:textfield id="AuthorID" class="form-control" name="bk.AuthorID"
						value="6"></s:textfield>

				</div>
				<div class="field">
					<label for="inputEmail3" class="col-sm-2 control-label">Price</label>

					<s:textfield id="Price" class="form-control" name="bk.Price"
						value="35.0"></s:textfield>

				</div>
				<div class="field">
					<label for="inputEmail3" class="col-sm-2 control-label">age</label>

					<s:textfield id="age" class="form-control" name="bk.age" value="35"></s:textfield>

				</div>
				<div class="field">
					<label for="inputEmail3" class="col-sm-2 control-label">country</label>

					<s:textfield id="country" class="form-control" name="bk.country"
						value="中国"></s:textfield>

				</div>
				<div class="field">
					<label for="inputEmail3" class="col-sm-2 control-label">name</label>

					<s:textfield id="name" class="form-control" name="bk.name"></s:textfield>

				</div>

				<div class="field">

					<button type="submit" class="btn btn-primary btn-lg">增加图书</button>
				</div>
				<br>
				<br>
				<br>
				<br>
				<br>
		</div>
		</s:form>

		<!-- 对插入的数据进行初步验证 -->
		<script type="text/javascript">
			function check() {
				var ISBN = $("#ISBN");
				var PublishDate = $("#PublishDate");
				var AuthorID = $("#AuthorID");
				var Price = $("#Price");
				var age = $("#age");
				var Title = $("#Title");
				var Publisher = $("#Publisher");
				var country = $("#country");
				var name = $("#name");
				if (ISBN.val().trim().length == 0
						|| Title.val().trim().length == 0
						|| PublishDate.val().trim().length == 0
						|| AuthorID.val().trim().length == 0
						|| Price.val().trim().length == 0
						|| age.val().trim().length == 0
						|| Publisher.val().trim().length == 0
						|| country.val().trim().length == 0
						|| name.val().trim().length == 0) {
					alert("存在输入为空，请重新检查输入！");
					return false;
				} else if (isNaN(AuthorID.val())) {
					alert("AuthorID必须是个数字");
					return false;
				} else if (isNaN(Price.val())) {
					alert("Price必须是个数字");
					return false;
				} else if (isNaN(age.val())) {
					alert("age必须是个数字");
					return false;
				} else if (isNaN(ISBN.val())) {
					alert("ISBN必须是个数字");
					return false;
				}

				return true;
			}
		</script>

		<div id="copyright">
			<ul>
				<li>Design: <a href="https://github.com/SummerChaser">Summer
						Chaser</a></li>
			</ul>
		</div>

		<script src="jquery-3.2.1.min.js"></script>
		<script src="bootstrap.min.js"></script>

		<!-- Scripts -->
		<script src="assets/js/jquery.min.js"></script>
		<script src="assets/js/jquery.scrollex.min.js"></script>
		<script src="assets/js/jquery.scrolly.min.js"></script>
		<script src="assets/js/skel.min.js"></script>
		<script src="assets/js/util.js"></script>
		<script src="assets/js/main.js"></script>
	</div>
</body>
</html>