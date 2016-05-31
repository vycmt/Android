<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spring"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<title>LOG IN</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="keywords" content="">
<meta name="author" content="">
<meta name="decorator" content="login" />

<!-- Core CSS - Include with every page -->
<link href='<c:url value="resources/css/bootstrap.min.css"></c:url>' rel="stylesheet">

<link href='<c:url value="resources/css/bootstrap-theme.css"></c:url>' rel="stylesheet">

<link rel="stylesheet" href='<c:url value="resources/css/font-awesome.min.css"></c:url>'>

<link rel="stylesheet" href='<c:url value="resources/css/elegant-icons-style.css"></c:url>'>

<link href="<c:url value="resources/css/style.css"></c:url>" rel="stylesheet">

<!-- Import for JavaScript -->
<script src="<c:url value="resources/js/respond.min.js"></c:url>"></script>
<script src="<c:url value="resources/js/jquery.js"></c:url>"></script>
<script src="<c:url value="resources/js/bootstrap.min.js"></c:url>"></script>

</head>
<body>
  <!-- Form area -->
  <div class="container">

      <form class="login-form" action="index.html">        
        <div class="login-wrap">
            <p class="login-img"><i class="icon_lock_alt"></i></p>
            <div class="input-group">
              <span class="input-group-addon"><i class="icon_profile"></i></span>
              <input type="text" class="form-control" placeholder="Username" autofocus>
            </div>
            <div class="input-group">
                <span class="input-group-addon"><i class="icon_key_alt"></i></span>
                <input type="password" class="form-control" placeholder="Password">
            </div>
            <label class="checkbox">
                <input type="checkbox" value="remember-me"> Remember me
                <span class="pull-right"> <a href="#"> Forgot Password?</a></span>
            </label>
            <button class="btn btn-primary btn-lg btn-block" type="submit">Login</button>
            <button class="btn btn-info btn-lg btn-block" type="submit">Signup</button>
        </div>
      </form>

    </div>

</body>
</html>