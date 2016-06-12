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

<link  href="<c:url value="/resources/css/bootstrap.min.css" ></c:url>"  rel="stylesheet">

<link href="<c:url value="/resources/css/bootstrap-theme.css" ></c:url>" rel="stylesheet">

<link href="<c:url value="/resources/css/elegant-icons-style.css" ></c:url>" rel="stylesheet">

<link href="<c:url value="/resources/css/font-awesome.min.css" ></c:url>" rel="stylesheet">

<link href="<c:url value="/resources/css/style.css" ></c:url>" rel="stylesheet">

<link href="<c:url value="/resources/css/style2.css" ></c:url>" rel="stylesheet">

<link href="<c:url value="/resources/css/style-responsive.css" ></c:url>" rel="stylesheet">

<!-- // Add thư viện sau dòng này -->
<link rel="stylesheet" href="<c:url value="/resources/css/widgets.css" ></c:url>">
<!-- Data tables -->
<link rel="stylesheet" href="<c:url value="/resources/css/jquery.dataTables.css" ></c:url>">
<!-- Bootstrap toggle -->
<link rel="stylesheet" href="<c:url value="/resources/css/jquery.onoff.css" ></c:url>">

<link rel="stylesheet" href="<c:url value="/resources/css/jquery-ui.css" ></c:url>"> 

<link rel="stylesheet" href="<c:url value="/resources/css/rateit.css" ></c:url>">

<link rel="stylesheet" href="<c:url value="/resources/css/jquery.cleditor.css" ></c:url>">
  <!-- Date picker -->
<link rel="stylesheet" href="<c:url value="/resources/css/bootstrap-datetimepicker.min.css" ></c:url>">


<!-- Star rating -->

</head>


<body>

  <!--   Code goes here -->
  <section id="container" class=""> <!--header start--> 
  <header class="header dark-bg">
  <div class="toggle-nav">
    <div class="icon-reorder tooltips" data-original-title="Toggle Navigation" data-placement="bottom">
      <i class="icon_menu"></i>
    </div>
  </div>
  <a class="navbar-brand" href="">ADMIN</a>

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
  <div>
    <ul class="nav navbar-nav pull-right">
          <li class="dropdown pull-right">            
            <a data-toggle="dropdown" class="dropdown-toggle" href="#">
              <i class="fa fa-user"></i> ${sessionScope.username } <b class="caret"></b>              
            </a>
            
            <!-- Dropdown menu -->
            <ul class="dropdown-menu">
              <li><a href="#"><i class="fa fa-user"></i> Profile</a></li>
              <li><a href="#"><i class="fa fa-cogs"></i> Settings</a></li>
              <li><a href="/food-web/signOut"><i class="fa fa-sign-out"></i> Logout</a></li>
            </ul>
          </li>
          
        </ul>
    </div>
  </header> <!--header end--> <!--sidebar start--> <aside>
  <div id="sidebar" class="nav-collapse ">
    <!-- sidebar menu start-->
    <ul class="sidebar-menu">
      <li <c:if test="${activeTab eq 'Dashboard'}">class="open"</c:if>><a href="/food-web/Admin"><i
          class="fa fa-home"></i> Dashboard</a></li>
      <li <c:if test="${activeTab eq 'CreatePost'}">class="open"</c:if>><a href="/food-web/CreatePost"
        id="postCreate"><i class="fa fa-list-alt"></i>Create new <span class="pull-right"><i
            class="fa fa-chevron-right"></i></span></a></li>
      <li <c:if test="${activeTab eq 'ManagePost'}">class="open"</c:if>><a href="/food-web/ManagePost"
        id="postManage"><i class="fa fa-file-o"></i>Manage <span class="pull-right"><i
            class="fa fa-chevron-right"></i></span></a></li>
    </ul>
    <!-- sidebar menu end-->
  </div>
  </aside> <!--sidebar end--> <!--main content start-->
  <div>

    <div class="page-head">
      <h2 class="pull-left">
        <i class="fa fa-home"></i> ${pageheader}
      </h2>

      <!-- Breadcrumb -->
      <div class="bread-crumb pull-right">
        <a href="index.html"><i class="fa fa-home"></i> Home</a>
        <!-- Divider -->
        <span class="divider">/</span> <a href="#" class="bread-current">${pageheader}</a>
      </div>
    </div>

    <!-- page start-->
    <div class="matter">
      <div class="container">

        <!-- Body -->
        <decorator:body />

      </div>
    </div>

    <!-- page end-->

  </div>
  <!--main content end--> </section>
  <!-- container section end -->


  <script src="<c:url value="/resources/js/jquery.js" ></c:url>"></script>
  <script src="<c:url value="/resources/js/bootstrap.min.js" ></c:url>"></script>
  <script src="<c:url value="/resources/js/jquery.scrollTo.min.js" ></c:url>"></script>
  <script src="<c:url value="/resources/js/jquery.nicescroll.js" ></c:url>"></script>
  <script src="<c:url value="/resources/js/scripts.js" ></c:url>"></script>
  
<!--   // Từ dòng này -->
    <script src="<c:url value="/resources/js/jquery.slimscroll.min.js" ></c:url>"></script>
  <script src="<c:url value="/resources/js/jquery-ui.min.js" ></c:url>"></script>
  <script src="<c:url value="/resources/js/jquery.cleditor.min.js" ></c:url>"></script>
  <!-- jQuery UI -->
  <script src="<c:url value="/resources/js/respond.min.js" ></c:url>"></script>
  <script src="<c:url value="/resources/js/jquery-ui.min.js" ></c:url>"></script>

  <!-- Full Google Calendar - Calendar -->
  <script src="<c:url value="/resources/js/jquery.rateit.min.js" ></c:url>"></script>
  <!-- RateIt - Star rating -->
  <script src="<c:url value="/resources/js/jquery.prettyPhoto.js" ></c:url>"></script>

  <!-- jQuery Slim Scroll -->
  <script src="<c:url value="/resources/js/jquery.dataTables.min.js" ></c:url>"></script>
  <!-- Data tables -->

  <script type="text/javascript" src='<c:url value="/resources/js/ajaxload.js"></c:url>'></script>
  <!-- load database -->


</body>
</html>



