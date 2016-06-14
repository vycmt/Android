<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<title>Dashboard</title>
</head>

<body>

  <div class="row">
    <div class="col-md-12">
      <!-- List starts -->
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



  <div class="col-md-4">

    <div class="widget">

      <div class="widget-head">
        <div class="pull-left">Today Status</div>
        <div class="widget-icons pull-right">
          <a href="#" class="wminimize"><i class="fa fa-chevron-up"></i></a> <a href="#" class="wclose"><i
            class="fa fa-times"></i></a>
        </div>
        <div class="clearfix"></div>
      </div>

      <div class="widget-content">
        <div class="padd">

          <!-- Visitors, pageview, bounce rate, etc., Sparklines plugin used -->
          <ul class="current-status">
            <li><span id="status1"></span> <span class="bold">Visits : 2000</span></li>
            <li><span id="status2"></span> <span class="bold">Unique Visitors : 1,345</span></li>
            <li><span id="status3"></span> <span class="bold">Pageviews : 2000</span></li>
            <li><span id="status4"></span> <span class="bold">Pages / Visit : 2000</span></li>
            <li><span id="status5"></span> <span class="bold">Avg. Visit Duration : 2000</span></li>
            <li><span id="status6"></span> <span class="bold">Bounce Rate : 2000</span></li>
            <li><span id="status7"></span> <span class="bold">% New Visits : 2000</span></li>
          </ul>

        </div>
      </div>

    </div>

  </div>


</body>
</html>