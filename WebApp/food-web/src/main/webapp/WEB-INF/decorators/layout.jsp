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
      <li class=""><a class="" href=""> <i class="icon_house_alt"></i> <span>Dashboard</span>
      </a></li>
      <li class="sub-menu"><a href="/food-web/Create" id="postCreate" class=""> <i class="icon_document_alt"></i> <span>Create</span>
          
      </a>
<!--         <ul class="sub"> -->
<!--           <li><a class="" href="form_component.html">Form Elements</a></li> -->
<!--           <li><a class="" href="form_validation.html">Form Validation</a></li> -->
<!--         </ul></li> -->
     

      <li class="sub-menu"><a href="/food-web/manage" class=""> <i class="icon_table"></i> <span>Manage</span> 
      </a>
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
  </aside> <!--sidebar end--> <!--main content start--> <section id="main-content"> <section class="wrapper">
  <div class="row">
    <div class="col-lg-12">
      <h3 class="page-header">
        <i class="fa fa fa-bars"></i> Pages
      </h3>
      <!--       <ol class="breadcrumb"> -->
      <!--         <li><i class="fa fa-home"></i><a href="index.html">Home</a></li> -->
      <!--         <li><i class="fa fa-bars"></i>Pages</li> -->
      <!--         <li><i class="fa fa-square-o"></i>Pages</li> -->
      <!--       </ol> -->
      
<!--       Include a part of dashboard.jsp -->


      <ul class="today-datas">
        <!-- List #1 -->
        <li>
          <!-- Graph -->
          <div>
            <span id="todayspark1" class="spark"></span>
          </div> <!-- Text -->
          <div class="datas-text">12,000 visitors/day</div>
        </li>
        <li>
          <div>
            <span id="todayspark2" class="spark"></span>
          </div>
          <div class="datas-text">30,000 Pageviews</div>
        </li>
        <li>
          <div>
            <span id="todayspark3" class="spark"></span>
          </div>
          <div class="datas-text">15.66% Bounce Rate</div>
        </li>
        <li>
          <div>
            <span id="todayspark4" class="spark"></span>
          </div>
          <div class="datas-text">$12,000 Revenue/Day</div>
        </li>
        <li>
          <div>
            <span id="todayspark5" class="spark"></span>
          </div>
          <div class="datas-text">15,000000 visitors till date</div>
        </li>
      </ul>
      
    </div>
  </div>
  <!-- page start--> <!-- page end--> </section> </section> <!--main content end--> </section>


  <script src="<c:url value="/resources/js/jquery.js" ></c:url>"></script>

  <script src="<c:url value="/resources/js/bootstrap.min.js" ></c:url>"></script>

  <script src="<c:url value="/resources/js/jquery.scrollTo.min.js" ></c:url>"></script>

  <script src="<c:url value="/resources/js/jquery.nicescroll.js" ></c:url>"></script>

  <script src="<c:url value="/resources/js/scripts.js" ></c:url>"></script>


</body>
</html>



