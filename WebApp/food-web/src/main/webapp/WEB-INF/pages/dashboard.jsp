<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<title>Dashboard</title>
<!-- Bootstrap CSS -->
    <link href='<c:url value="resources/css/bootstrap.min.css"></c:url>' rel="stylesheet">
    <!-- bootstrap theme -->
    <link href='<c:url value="resources/css/bootstrap-theme.css"></c:url>' rel="stylesheet">
    <!--external css-->
    <!-- font icon -->
    <link href='<c:url value="resources/css/elegant-icons-style.css"></c:url>' rel="stylesheet">
    <link href='<c:url value="resources/css/font-awesome.min.css"></c:url>' rel="stylesheet">   
    <!-- full calendar css-->
	<link href='<c:url value="resources/css/bootstrap-fullcalendar.css"></c:url>' rel="stylesheet">
	<link href='<c:url value="resources/css/fullcalendar.css"></c:url>' rel="stylesheet">
    <!-- easy pie chart-->
    <link href='<c:url value="resources/css/jquery.easy-pie-chart.css"></c:url>' rel="stylesheet" type="text/css" media="screen"/>
    <!-- owl carousel -->
	<link href='<c:url value="resources/css/owl.carousel.css"></c:url>' rel="stylesheet" type="text/css">
	<link href='<c:url value="resources/css/jquery-jvectormap-1.2.2.css"></c:url>' rel="stylesheet">
    <!-- Custom styles -->
	<link href='<c:url value="resources/css/fullcalendar.css"></c:url>' rel="stylesheet">
	<link href='<c:url value="resources/css/style.css"></c:url>' rel="stylesheet">
	<link href='<c:url value="resources/css/widgets.css"></c:url>' rel="stylesheet">
	<link href='<c:url value="resources/css/style-responsive.css"></c:url>' rel="stylesheet">
	<link href='<c:url value="resources/css/xcharts.min.css"></c:url>' rel="stylesheet">
	<link href='<c:url value="resources/css/jquery-ui-1.10.4.min.css"></c:url>' rel="stylesheet">
</head>

<body>

<!--main content start-->
      <section id="main-content">
          <section class="wrapper">            
              <!--overview start-->
			  <div class="row">
				<div class="col-lg-12">
					<h3 class="page-header"><i class="fa fa-laptop"></i> Dashboard</h3>
					<ol class="breadcrumb">
						<li><i class="fa fa-home"></i><a href="index.html">Home</a></li>
						<li><i class="fa fa-laptop"></i>Dashboard</li>						  	
					</ol>
				</div>
			</div>
              
            <div class="row">
				<div class="col-lg-3 col-md-3 col-sm-12 col-xs-12">
					<div class="info-box blue-bg">
						<i class="fa fa-cloud-download"></i>
						<div class="count">6.674</div>
						<div class="title">Download</div>						
					</div><!--/.info-box-->			
				</div><!--/.col-->
				
				<div class="col-lg-3 col-md-3 col-sm-12 col-xs-12">
					<div class="info-box brown-bg">
						<i class="fa fa-shopping-cart"></i>
						<div class="count">7.538</div>
						<div class="title">Purchased</div>						
					</div><!--/.info-box-->			
				</div><!--/.col-->	
				
				<div class="col-lg-3 col-md-3 col-sm-12 col-xs-12">
					<div class="info-box dark-bg">
						<i class="fa fa-thumbs-o-up"></i>
						<div class="count">4.362</div>
						<div class="title">Order</div>						
					</div><!--/.info-box-->			
				</div><!--/.col-->
				
				<div class="col-lg-3 col-md-3 col-sm-12 col-xs-12">
					<div class="info-box green-bg">
						<i class="fa fa-cubes"></i>
						<div class="count">1.426</div>
						<div class="title">Stock</div>						
					</div><!--/.info-box-->			
				</div><!--/.col-->
				
			</div><!--/.row-->
		
			
           <div class="row">
		    <div class="col-lg-9 col-md-12">
					
					<div class="panel panel-default">
						<div class="panel-heading">
							<h2><i class="fa fa-map-marker red"></i><strong>Countries</strong></h2>
							<div class="panel-actions">
								<a href="index.html#" class="btn-setting"><i class="fa fa-rotate-right"></i></a>
								<a href="index.html#" class="btn-minimize"><i class="fa fa-chevron-up"></i></a>
								<a href="index.html#" class="btn-close"><i class="fa fa-times"></i></a>
							</div>	
						</div>
						<div class="panel-body-map">
							<div id="map" style="height:380px;"></div>	
						</div>
	
					</div>
				</div>
              <div class="col-md-3">
              <!-- List starts -->
				<ul class="today-datas">
                <!-- List #1 -->
				<li>
                  <!-- Graph -->
                  <div><span id="todayspark1" class="spark"></span></div>
                  <!-- Text -->
                  <div class="datas-text">11,500 visitors/day</div>
                </li>
                <li>
                  <div><span id="todayspark2" class="spark"></span></div>
                  <div class="datas-text">15,000 Pageviews</div>
                </li>
                <li>
                  <div><span id="todayspark3" class="spark"></span></div>
                  <div class="datas-text">30.55% Bounce Rate</div>
                </li>
                <li>
                  <div><span id="todayspark4" class="spark"></span></div>
                  <div class="datas-text">$16,00 Revenue/Day</div>
                </li> 
                <li>
                  <div><span id="todayspark5" class="spark"></span></div>
                  <div class="datas-text">12,000000 visitors every Month</div>
                </li>                                                                                                              
              </ul>
              </div>
              
			 
           </div>  
            
		  
		  <!-- Today status end -->
			
              
				
			<div class="row">
               	
				<div class="col-lg-9 col-md-12">	
					<div class="panel panel-default">
						<div class="panel-heading">
							<h2><i class="fa fa-flag-o red"></i><strong>Registered Users</strong></h2>
							<div class="panel-actions">
								<a href="index.html#" class="btn-setting"><i class="fa fa-rotate-right"></i></a>
								<a href="index.html#" class="btn-minimize"><i class="fa fa-chevron-up"></i></a>
								<a href="index.html#" class="btn-close"><i class="fa fa-times"></i></a>
							</div>
						</div>
						<div class="panel-body">
							<table class="table bootstrap-datatable countries">
								<thead>
									<tr>
										<th></th>
										<th>Country</th>
										<th>Users</th>
										<th>Online</th>
										<th>Performance</th>
									</tr>
								</thead>   
								<tbody>
									<tr>
										<td><img src="img/Germany.png" style="height:18px; margin-top:-2px;"></td>
										<td>Germany</td>
										<td>2563</td>
										<td>1025</td>
										<td>
											<div class="progress thin">
												<div class="progress-bar progress-bar-danger" role="progressbar" aria-valuenow="73" aria-valuemin="0" aria-valuemax="100" style="width: 73%">
												</div>
												<div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="27" aria-valuemin="0" aria-valuemax="100" style="width: 27%">
											  	</div>
											</div>
											<span class="sr-only">73%</span>   	
										</td>
									</tr>
									<tr>
										<td><img src="img/India.png" style="height:18px; margin-top:-2px;"></td>
										<td>India</td>
										<td>3652</td>
										<td>2563</td>
										<td>
											<div class="progress thin">
												<div class="progress-bar progress-bar-danger" role="progressbar" aria-valuenow="57" aria-valuemin="0" aria-valuemax="100" style="width: 57%">
												</div>
												<div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="43" aria-valuemin="0" aria-valuemax="100" style="width: 43%">
												</div>
											</div>
											<span class="sr-only">57%</span>   	
										</td>
									</tr>
									<tr>
										<td><img src="img/Spain.png" style="height:18px; margin-top:-2px;"></td>
										<td>Spain</td>
										<td>562</td>
										<td>452</td>
										<td>
											<div class="progress thin">
												<div class="progress-bar progress-bar-danger" role="progressbar" aria-valuenow="93" aria-valuemin="0" aria-valuemax="100" style="width: 93%">
												</div>
												<div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="7" aria-valuemin="0" aria-valuemax="100" style="width: 7%">
											  	</div>
											</div>
											<span class="sr-only">93%</span>   	
										</td>
									</tr>
									<tr>
										<td><img src="img/India.png" style="height:18px; margin-top:-2px;"></td>
										<td>Russia</td>
										<td>1258</td>
										<td>958</td>
										<td>
											<div class="progress thin">
											  	<div class="progress-bar progress-bar-danger" role="progressbar" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100" style="width: 20%">
											  	</div>
												<div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="80" aria-valuemin="0" aria-valuemax="100" style="width: 80%">
											  	</div>
											</div>
											<span class="sr-only">20%</span>   	
										</td>
									</tr>
									<tr>
										<td><img src="img/Spain.png" style="height:18px; margin-top:-2px;"></td>
										<td>USA</td>
										<td>4856</td>
										<td>3621</td>
										<td>
											<div class="progress thin">
											  	<div class="progress-bar progress-bar-danger" role="progressbar" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100" style="width: 20%">
											  	</div>
												<div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="80" aria-valuemin="0" aria-valuemax="100" style="width: 80%">
											  	</div>
											</div>
											<span class="sr-only">20%</span>   	
										</td>
									</tr>
									<tr>
										<td><img src="img/Germany.png" style="height:18px; margin-top:-2px;"></td>
										<td>Brazil</td>
										<td>265</td>
										<td>102</td>
										<td>
											<div class="progress thin">
											  	<div class="progress-bar progress-bar-danger" role="progressbar" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100" style="width: 20%">
											  	</div>
												<div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="80" aria-valuemin="0" aria-valuemax="100" style="width: 80%">
											  	</div>
											</div>
											<span class="sr-only">20%</span>   	
										</td>
									</tr>
									<tr>
										<td><img src="img/Germany.png" style="height:18px; margin-top:-2px;"></td>
										<td>Coloumbia</td>
										<td>265</td>
										<td>102</td>
										<td>
											<div class="progress thin">
											  	<div class="progress-bar progress-bar-danger" role="progressbar" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100" style="width: 20%">
											  	</div>
												<div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="80" aria-valuemin="0" aria-valuemax="100" style="width: 80%">
											  	</div>
											</div>
											<span class="sr-only">20%</span>   	
										</td>
									</tr>
									<tr>
										<td><img src="img/Germany.png" style="height:18px; margin-top:-2px;"></td>
										<td>France</td>
										<td>265</td>
										<td>102</td>
										<td>
											<div class="progress thin">
											  	<div class="progress-bar progress-bar-danger" role="progressbar" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100" style="width: 20%">
											  	</div>
												<div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="80" aria-valuemin="0" aria-valuemax="100" style="width: 80%">
											  	</div>
											</div>
											<span class="sr-only">20%</span>   	
										</td>
									</tr>
								</tbody>
							</table>
						</div>
	
					</div>	

				</div><!--/col-->
				<div class="col-md-3">
					
					<div class="social-box facebook">
						<i class="fa fa-facebook"></i>
						<ul>
							<li>
								<strong>256k</strong>
								<span>friends</span>
							</li>
							<li>
								<strong>359</strong>
								<span>feeds</span>
							</li>
						</ul>
					</div><!--/social-box-->
				</div>
				<div class="col-md-3">
					
					<div class="social-box google-plus">
						<i class="fa fa-google-plus"></i>
						<ul>
							<li>
								<strong>962</strong>
								<span>followers</span>
							</li>
							<li>
								<strong>256</strong>
								<span>circles</span>
							</li>
						</ul>
					</div><!--/social-box-->			
					
				</div><!--/col-->
				<div class="col-md-3">
					
					<div class="social-box twitter">
						<i class="fa fa-twitter"></i>
						<ul>
							<li>
								<strong>1562k</strong>
								<span>followers</span>
							</li>
							<li>
								<strong>2562</strong>
								<span>tweets</span>
							</li>
						</ul>
					</div><!--/social-box-->			
					
				</div><!--/col-->
				
              </div>
                <!-- statics end -->
          </section>
      </section>
      <!--main content end-->

<!-- javascripts -->
    <script src="<c:url value="/resources/js/jquery.js" ></c:url>"></script>
    <script src="<c:url value="/resources/js/jquery-ui-1.10.4.min.js" ></c:url>"></script>
    <script src="<c:url value="/resources/js/jquery-1.8.3.min.js" ></c:url>"></script>
    <script src="<c:url value="/resources/js/jquery-ui-1.9.2.custom.min.js" ></c:url>"></script>
    <!-- bootstrap -->
    <script src="<c:url value="/resources/js/bootstrap.min.js" ></c:url>"></script>
    <!-- nice scroll -->
    <script src="<c:url value="/resources/js/jquery.scrollTo.min.js" ></c:url>"></script>
    <script src="<c:url value="/resources/js/jquery.nicescroll.js" ></c:url>"></script>
    <!-- charts scripts -->
    <script src="<c:url value="/resources/js/jquery.knob.js" ></c:url>"></script>
    <script src="<c:url value="/resources/js/jquery.sparkline.js" ></c:url>"></script>
    <script src="<c:url value="/resources/js/jquery.easy-pie-chart.js" ></c:url>"></script>
    <script src="<c:url value="/resources/js/owl.carousel.js" ></c:url>"></script>
    <!--script for this page only-->
	<script src="<c:url value="/resources/js/calendar-custom.js" ></c:url>"></script>
	<script src="<c:url value="/resources/js/jquery.rateit.min.js" ></c:url>"></script>
    <!-- custom select -->
	<script src="<c:url value="/resources/js/jquery.customSelect.min.js" ></c:url>"></script>
	<script src="<c:url value="/resources/js/Chart.js" ></c:url>"></script>
   
    <!--custome script for all page-->
	<script src="<c:url value="/resources/js/sparkline-chart.js" ></c:url>"></script>
	<script src="<c:url value="/resources/js/easy-pie-chart.js" ></c:url>"></script>
	<script src="<c:url value="/resources/js/jquery-jvectormap-1.2.2.min.js" ></c:url>"></script>
	<script src="<c:url value="/resources/js/jquery-jvectormap-world-mill-en.js" ></c:url>"></script>
	<script src="<c:url value="/resources/js/xcharts.min.js" ></c:url>"></script>
	<script src="<c:url value="/resources/js/jquery.autosize.min.js" ></c:url>"></script>
	<script src="<c:url value="/resources/js/jquery.placeholder.min.js" ></c:url>"></script>
	<script src="<c:url value="/resources/js/gdp-data.js" ></c:url>"></script>
	<script src="<c:url value="/resources/js/morris.min.js" ></c:url>"></script>
	<script src="<c:url value="/resources/js/sparklines.js" ></c:url>"></script>
	<script src="<c:url value="/resources/js/charts.js" ></c:url>"></script>
	<script src="<c:url value="/resources/js/jquery.slimscroll.min.js" ></c:url>"></script>
  <script>
      //knob
      $(function() {
        $(".knob").knob({
          'draw' : function () { 
            $(this.i).val(this.cv + '%')
          }
        })
      });

      //carousel
      $(document).ready(function() {
          $("#owl-slider").owlCarousel({
              navigation : true,
              slideSpeed : 300,
              paginationSpeed : 400,
              singleItem : true

          });
      });

      //custom select box

      $(function(){
          $('select.styled').customSelect();
      });
	  
	  /* ---------- Map ---------- */
	$(function(){
	  $('#map').vectorMap({
	    map: 'world_mill_en',
	    series: {
	      regions: [{
	        values: gdpData,
	        scale: ['#000', '#000'],
	        normalizeFunction: 'polynomial'
	      }]
	    },
		backgroundColor: '#eef3f7',
	    onLabelShow: function(e, el, code){
	      el.html(el.html()+' (GDP - '+gdpData[code]+')');
	    }
	  });
	});
</script>

</body>
</html>