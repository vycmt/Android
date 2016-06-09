<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- Title and other stuffs -->
<title><decorator:title /></title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="keywords" content="">
<meta name="author" content="">

<title>DASHBOARD ADMIN</title>

<link href="<c:url value="/resources/css/bootstrap.min.css" ></c:url>" rel="stylesheet">

<link href="<c:url value="/resources/css/bootstrap-theme.css" ></c:url>" rel="stylesheet">

<link href="<c:url value="/resources/css/elegant-icons-style.css" ></c:url>" rel="stylesheet">

<link href="<c:url value="/resources/css/font-awesome.min.css" ></c:url>" rel="stylesheet">

<link href="<c:url value="/resources/css/style.css" ></c:url>" rel="stylesheet">

<link href="<c:url value="/resources/css/style-responsive.css" ></c:url>" rel="stylesheet">


</head>


<body>

  <!--   Code goes here -->
  <section id="container" class=""> <!--header start--> <header class="header dark-bg">
  <div class="toggle-nav">
    <div class="icon-reorder tooltips" data-original-title="Toggle Navigation" data-placement="bottom">
      <i class="icon_menu"></i>
    </div>
  </div>
  <a href="index.html" class="logo">Nice <span class="lite">ADMIN</span></a> <!--logo end-->

  <div class="nav search-row" id="top_menu">
    <!--  search form start -->
    <ul class="nav top-menu">
      <li>
        <form class="navbar-form">
          <input class="form-control" placeholder="Search" type="text">
        </form>
      </li>
    </ul>
    <!--  search form end -->
  </div>

  <ul class="nav navbar-nav pull-right">
    <li class="dropdown pull-right"><a data-toggle="dropdown" class="dropdown-toggle" href="#"> <i
        class="fa fa-user"></i> ${sessionScope.username } <b class="caret"></b>
    </a> <!-- Dropdown menu -->
      <ul class="dropdown-menu">
        <li><a href="#"><i class="fa fa-user"></i> Profile</a></li>
        <li><a href="#"><i class="fa fa-cogs"></i> Settings</a></li>
        <li><a href="/food-web/signOut"><i class="fa fa-sign-out"></i> Logout</a></li>
      </ul></li>

  </ul>
  </header> <!--header end--> <!--sidebar start--> <aside>
  <div id="sidebar" class="nav-collapse ">
    <!-- sidebar menu start-->
    <ul class="sidebar-menu">
      <li <c:if test="${activeTab eq 'Dashboard'}">class="open"</c:if> ><a href="/food-web/Admin"><i class="fa fa-home"></i> Dashboard</a>
      
       <li <c:if test="${activeTab eq 'CreatePost'}">class="open"</c:if>><a href="/food-web/CreatePost" id="postCreate"><i class="fa fa-list-alt"></i>Create<span class="pull-right"><i class="fa fa-chevron-right"></i></span></a>
      
<!--         <ul class="sub"> -->
<!--           <li><a class="" href="form_component.html">Form Elements</a></li> -->
<!--           <li><a class="" href="form_validation.html">Form Validation</a></li> -->
<!--         </ul></li> -->
     

      <li <c:if test="${activeTab eq 'ManagePost'}">class="open"</c:if>><a href="/food-web/ManagePost" id="postManage"><i class="fa fa-file-o"></i>Manage <span class="pull-right"><i class="fa fa-chevron-right"></i></span></a>
      
<!--         <ul class="sub"> -->
<!--           <li><a class="" href="">Basic Table</a></li> -->
<!--         </ul></li> -->

      <li class="sub-menu "><a href="javascript:;" class=""> <i class="icon_documents_alt"></i> <span>Pages</span>
          <span class="menu-arrow arrow_carrot-right"></span>
      </a>
        <ul class="sub">
          <li><a class="" href="">Profile</a></li>
          <li><a class="" href=""><span>Login Page</span></a></li>
          <li><a class="active" href="">Blank Page</a></li>
          <li><a class="" href="">404 Error</a></li>
        </ul></li>

    </ul>
    <!-- sidebar menu end-->
  </div>
  
  <!-- Main bar -->
    <div class="mainbar">

      <!-- Page heading -->
      <div class="page-head">
        <h2 class="pull-left"><i class="fa fa-home"></i> ${pageheader}</h2>

        <!-- Breadcrumb -->
        <div class="bread-crumb pull-right">
          <a href="index.html"><i class="fa fa-home"></i> Home</a> 
          <!-- Divider -->
          <span class="divider">/</span> 
          <a href="#" class="bread-current">${pageheader}</a>
        </div>

        <div class="clearfix"></div>

      </div>
      <!-- Page heading ends -->


      <!-- Matter -->

      <div class="matter">
        <div class="container">
          
                <!-- Body -->
                <decorator:body/>
         
        </div>
      </div>

    <!-- Matter ends -->

    </div>

   <!-- Mainbar ends -->        
   <div class="clearfix"></div>

</div>
<!-- Content ends -->


  <script src="<c:url value="/resources/js/jquery.js" ></c:url>"></script>

  <script src="<c:url value="/resources/js/bootstrap.min.js" ></c:url>"></script>

  <script src="<c:url value="/resources/js/jquery.scrollTo.min.js" ></c:url>"></script>

  <script src="<c:url value="/resources/js/jquery.nicescroll.js" ></c:url>"></script>

  <script src="<c:url value="/resources/js/scripts.js" ></c:url>"></script>


</body>
</html>



