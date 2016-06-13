<%@ page language="java" contentType="text/html; charset=utf-8"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
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

<title>DASHBOARD</title>

  <!-- Stylesheets -->
  <link  href="<c:url value="/resources/css/bootstrap.min.css" ></c:url>"  rel="stylesheet">
  <!-- Font awesome icon -->
  <link rel="stylesheet" href="<c:url value="/resources/css/font-awesome.min.css" ></c:url>"> 
  <!-- jQuery UI -->
  <link rel="stylesheet" href="<c:url value="/resources/css/jquery-ui.css" ></c:url>"> 
  <!-- Calendar -->
  <link rel="stylesheet" href="<c:url value="/resources/css/fullcalendar.css" ></c:url>">
  <!-- prettyPhoto -->
  <link rel="stylesheet" href="<c:url value="/resources/css/prettyPhoto.css" ></c:url>">  
  <!-- Star rating -->
  <link rel="stylesheet" href="<c:url value="/resources/css/rateit.css" ></c:url>">
  <!-- Date picker -->
  <link rel="stylesheet" href="<c:url value="/resources/css/bootstrap-datetimepicker.min.css" ></c:url>">
  <!-- CLEditor -->
  <link rel="stylesheet" href="<c:url value="/resources/css/jquery.cleditor.css" ></c:url>">  
  <!-- Data tables -->
<link rel="stylesheet" href="<c:url value="/resources/css/jquery.dataTables.css" ></c:url>">
  <!-- Bootstrap toggle -->
  <link rel="stylesheet" href="<c:url value="/resources/css/jquery.onoff.css" ></c:url>">
  <!-- Main stylesheet -->
  <link href="<c:url value="/resources/css/style2.css" ></c:url>" rel="stylesheet">
  <!-- Widgets stylesheet -->
  <link href="<c:url value="/resources/css/widgets.css" ></c:url>" rel="stylesheet">   

  

  
</head>

<body>
<div class="se-pre-con"></div>
<div class="navbar navbar-fixed-top bs-docs-nav" role="banner">
  
    <div class="conjtainer">
      <!-- Menu button for smallar screens -->
      <div class="navbar-header">
		  <button class="navbar-toggle btn-navbar" type="button" data-toggle="collapse" data-target=".bs-navbar-collapse">
			<span>Menu</span>
		  </button>
		  <!-- Site name for smallar screens -->
<!-- 		  <a href="index.html" class="navbar-brand hidden-lg">MacBeth</a> -->
		</div>
      
      

      <!-- Navigation starts -->
      <nav class="collapse navbar-collapse bs-navbar-collapse" role="navigation">         

        <ul class="nav navbar-nav">  
              <a class="navbar-brand" href="">DASHBOARD</a>
        </ul>

        <!-- Search form -->
        <form class="navbar-form navbar-left" role="search">
			<div class="form-group">
				<input type="text" class="form-control" placeholder="Search">
			</div>
		</form>
        <!-- Links -->
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
      </nav>

    </div>
  </div>

<!-- Main content starts -->

<div class="content">

  	<!-- Sidebar -->
    <div class="sidebar">
        <div class="sidebar-dropdown"><a href="#">Navigation</a></div>

        <!--- Sidebar navigation -->
        <!-- If the main navigation has sub navigation, then add the class "has_sub" to "li" of main navigation. -->
       
        <ul id="nav">
          <!-- Main menu with font awesome icon -->
          <li <c:if test="${activeTab eq 'Dashboard'}">class="open"</c:if> ><a href="/food-web/Admin"><i class="fa fa-home"></i> Trang chủ</a>
            <!-- Sub menu markup 
            <ul>
              <li><a href="#">Submenu #1</a></li>
              <li><a href="#">Submenu #2</a></li>
              <li><a href="#">Submenu #3</a></li>
            </ul>-->
          </li>
          <li <c:if test="${activeTab eq 'CreatePost'}">class="open"</c:if>><a href="/food-web/CreatePost" id="postCreate"><i class="fa fa-list-alt"></i>Tạo món ăn <span class="pull-right"><i class="fa fa-chevron-right"></i></span></a>
          </li>  
          <li <c:if test="${activeTab eq 'ManagePost'}">class="open"</c:if>><a href="/food-web/ManagePost" id="postManage"><i class="fa fa-file-o"></i>Quản lý món ăn <span class="pull-right"><i class="fa fa-chevron-right"></i></span></a>
          </li> 
        </ul>
        
        
    </div>

    <!-- Sidebar ends -->

  	<!-- Main bar -->
  	<div class="mainbar">

      <!-- Page heading -->
      <div class="page-head">
        <h2 class="pull-left"><i class="fa fa-home"></i> ${pageheader}</h2>

        <!-- Breadcrumb -->
        

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

<!-- Footer starts -->
<footer>
  <div class="container">
    <div class="row">
      <div class="col-md-12">
            <!-- Copyright info -->
            <p class="copy">Copyright by VTTH &copy; 2016 </p>
      </div>
    </div>
  </div>
</footer> 	

<!-- Footer ends -->

<!-- Scroll to top -->
<span class="totop"><a href="#"><i class="fa fa-chevron-up"></i></a></span> 

<!-- JS -->
<script src="<c:url value="/resources/js/jquery.js" ></c:url>"></script> <!-- jQuery -->
<script src="<c:url value="/resources/js/bootstrap.min.js" ></c:url>"></script> <!-- Bootstrap -->
<script src="<c:url value="/resources/js/jquery-ui.min.js" ></c:url>"></script> <!-- jQuery UI -->
<script src="<c:url value="/resources/js/moment.min.js" ></c:url>"></script> <!-- Moment js for full calendar -->
<script src="<c:url value="/resources/js/fullcalendar.min.js" ></c:url>"></script> <!-- Full Google Calendar - Calendar -->
<script src="<c:url value="/resources/js/jquery.rateit.min.js" ></c:url>"></script> <!-- RateIt - Star rating -->
<script src="<c:url value="/resources/js/jquery.prettyPhoto.js" ></c:url>"></script> <!-- prettyPhoto -->
<script src="<c:url value="/resources/js/jquery.slimscroll.min.js" ></c:url>"></script> <!-- jQuery Slim Scroll -->
<script src="<c:url value="/resources/js/jquery.dataTables.min.js" ></c:url>"></script> <!-- Data tables -->
  <script src="<c:url value="/resources/js/respond.min.js" ></c:url>"></script>

<!-- jQuery Flot -->
<script src="<c:url value="/resources/js/excanvas.min.js" ></c:url>"></script>
<script src="<c:url value="/resources/js/jquery.flot.js" ></c:url>"></script>
<script src="<c:url value="/resources/js/jquery.flot.resize.js" ></c:url>"></script>
<script src="<c:url value="/resources/js/jquery.flot.pie.js" ></c:url>"></script>
<script src="<c:url value="/resources/js/jquery.flot.stack.js" ></c:url>"></script>

 <!-- jQuery Notification - Noty -->
<script src="<c:url value="/resources/js/jquery.noty.js" ></c:url>"></script> <!-- jQuery Notify -->
<script src="<c:url value="/resources/js/themes/default.js" ></c:url>"></script> <!-- jQuery Notify -->
<script src="<c:url value="/resources/js/layouts/bottom.js" ></c:url>"></script> <!-- jQuery Notify -->
<script src="<c:url value="/resources/js/layouts/topRight.js" ></c:url>"></script> <!-- jQuery Notify -->
<script src="<c:url value="/resources/js/layouts/top.js" ></c:url>"></script> <!-- jQuery Notify -->
<!-- jQuery Notification ends -->
 
<script src="<c:url value="/resources/js/sparklines.js" ></c:url>"></script> <!-- Sparklines -->
<script src="<c:url value="/resources/js/jquery.cleditor.min.js" ></c:url>"></script> <!-- CLEditor -->
<script src="<c:url value="/resources/js/bootstrap-datetimepicker.min.js" ></c:url>"></script> <!-- Date picker -->
<script src="<c:url value="/resources/js/jquery.onoff.min.js" ></c:url>"></script> <!-- Bootstrap Toggle -->
<script src="<c:url value="/resources/js/filter.js" ></c:url>"></script> <!-- Filter for support page -->
<script src="<c:url value="/resources/js/custom.js" ></c:url>"></script> <!-- Custom codes -->
<script src="<c:url value="/resources/js/charts.js" ></c:url>"></script> <!-- Charts & Graphs -->

<script type="text/javascript" src='<c:url value="/resources/js/ajaxload.js"></c:url>'></script>  <!-- load database -->
</body>
</html>