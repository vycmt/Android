<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<meta name="decorator" content="home" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>Mon ngon moi ngay</title>
	<link href='<c:url value="resources/css/style1.css"></c:url>' rel="stylesheet">

</head>

<body>
	<div id="background">
		<div id="page">
			<div id="header">
				<span id="connect">
					<a href="http://facebook.com/freewebsitetemplates" target="_blank" class="facebook"></a>
					
				</span>
				<img id="logo" src="<c:url value="/resources/img/logo.png"></c:url>"></a> <!-- /#logo -->
				<ul id="navigation">
					<li><a href="/food-web/Admin" class="col-md-6">Sign In</a></li>
				</ul>
			</div> <!-- /#header -->
			<div id="contents">
				<div id="main">
					<div id="adbox">
						<img src="<c:url value="/resources/img/nen1.jpg"></c:url>" class="img-responsive" alt="Image">
					</div>
				</div>
				<div id="featured">
					<ul>
						<li><img src="<c:url value="/resources/img/nen2.jpg"></c:url>" class="img-responsive" alt="Image"></li>
						<li><img src="<c:url value="/resources/img/nen3.jpg"></c:url>" class="img-responsive" alt="Image"></li>
						<li><img src="<c:url value="/resources/img/nen4.jpg"></c:url>" class="img-responsive" alt="Image"></li>
						<li class="last"><img src="<c:url value="/resources/img/nen5.jpg"></c:url>" class="img-responsive" alt="Image"></li>
					</ul>
				</div>
			</div> <!-- /#contents -->
			<div id="footer">
				<div  class="navigation">
					<span>&copy; Copyright &copy; 2016. <a href="">VTTH</a> All rights reserved</span>
				</div>
			</div> <!-- /#footer -->
		</div> <!-- /#page -->
	</div> <!-- /#background -->

</body>
</html>

