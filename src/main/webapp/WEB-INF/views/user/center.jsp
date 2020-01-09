<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>个人中心</title>
<link href="/public/css/bootstrap.min.css" rel="stylesheet">
<link href="/public/css/index.css" rel="stylesheet">
</head>
<body>
	<div class="header">
		<ul class="nav">
			<li class="nav-item" style="margin-left: 12px;"><a
				class="navbar-brand" href="#"> <img
					src="https://v4.bootcss.com/docs/4.3/assets/brand/bootstrap-solid.svg"
					width="30" height="30" alt="">
			</a></li>
			<li class="nav-item"><a class="nav-link active" href="/">首页</a>
			</li>
			<li class="nav-item"><a class="nav-link" href="#">个人中心</a></li>
			<li class="nav-item"><a class="nav-link" href="#">登录</a></li>
			<li class="nav-item"><a class="nav-link disabled" href="#"
				tabindex="-1" aria-disabled="true">退出</a></li>
		</ul>
	</div>
	<div class="container-fluid" style="margin-top: 6px;">
		<div class="row offset-1" style="margin-top: 10px;">
			<div class="col-2">
				<div class="nav flex-column nav-pills" aria-orientation="vertical">
					<a class="nav-link active" href="#v-pills-home">发布文章</a> <a
						class="nav-link" href="#v-pills-home">我的文章</a> <a class="nav-link"
						href="#v-pills-home">我的评论</a>
				</div>
			</div>
			<div class="col-8">
				<form>
					<div class="form-group row">
						<label for="inputEmail3" class="col-sm-2 col-form-label">文章标题</label>
						<div class="col-sm-10">
							<input type="email" class="form-control" id="inputEmail3">
						</div>
					</div>
					<div class="form-group row">
						<label for="inputPassword3" class="col-sm-2 col-form-label">文章图片</label>
						<div class="col-sm-10">
							<input type="file" class="form-control" id="inputPassword3">
						</div>
					</div>
					<div class="form-group row">
						<label for="inputPassword3" class="col-sm-2 col-form-label">所属频道</label>
						<div class="col-sm-10">
							<select class="form-control" id="exampleFormControlSelect1">
								<option>1</option>
								<option>2</option>
								<option>3</option>
								<option>4</option>
								<option>5</option>
							</select>
						</div>
					</div>

					<div class="form-group row">
						<label for="inputPassword3" class="col-sm-2 col-form-label">所属分类</label>
						<div class="col-sm-10">
							<select class="form-control" id="exampleFormControlSelect1">
								<option>1</option>
								<option>2</option>
								<option>3</option>
								<option>4</option>
								<option>5</option>
							</select>
						</div>
					</div>
					<div class="form-group row">
						<div class="col-sm-2">文章内容</div>
						<div class="col-sm-10">
							<div class="form-check">
								<textarea rows="3" cols=""></textarea>
							</div>
						</div>
					</div>
					<button type="submit" class="btn btn-primary mb-2">保存</button>
					<button type="submit" class="btn btn-primary mb-2">保存并提交审核</button>
				</form>
			</div>
		</div>
	</div>
	<script src="/public/js/jquery.min.1.12.4.js"></script>
	<script src="/public/js/bootstrap.min.js"></script>
</body>
</html>