<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator" %>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>[springapp] <decorator:title> TEST DEMO SITEMESH </decorator:title> </title>
</head>
<body>
      <div id="container">
            [HEADER] <hr/>
                <div id="content">
                      <decorator:body><a href="index.jsp"></a></decorator:body>
                </div>
               <hr/> [FOOTER]
      </div>
</body>
</html>