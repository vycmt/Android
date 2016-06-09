<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

</head>

<body>


  <section id="main-content"> <section class="wrapper">
  <div class="row">
    <div class="col-lg-12">
      <h3 class="page-header">
        <i class="fa fa fa-bars"></i> Pages
      </h3>
      <ol class="breadcrumb">
        <li><i class="fa fa-home"></i><a href="index.html">Home</a></li>
        <li><i class="fa fa-bars"></i>Pages</li>
        <li><i class="fa fa-square-o"></i>Pages</li>
      </ol>
    </div>
  </div>
  <!-- page start-->
  <form class="form-horizontal" role="form">
    <div class="form-group">
      <label class="col-lg-2 control-label">Food Name</label>
      <div class="col-lg-5">
        <input type="text" class="form-control" placeholder="Input title Here">
      </div>
    </div>
    <div class="form-group">
      <label class="col-lg-2 control-label">Decription</label>
      <div class="col-lg-6">
        <textarea class="cleditor" name="input"></textarea>
      </div>
    </div>
    <div class="form-group">
      <label class="col-lg-2 control-label">List Material</label>
      <div class="col-lg-6">
        <textarea class="cleditor" name="input"></textarea>
      </div>
    </div>
    <div class="form-group">
      <label class="col-lg-2 control-label">Images</label>
      <div class="col-lg-6">
        <button>Upload Images</button>
      </div>
    </div>

    <div class="form-group">
      <div class="col-lg-offset-2 col-lg-6">
        <button type="button" class="btn btn-sm btn-default">Submit</button>
        <button type="reset" class="btn btn-sm btn-primary">Cancel</button>
      </div>
    </div>
  </form>
  <!-- page end--> </section> </section>

</body>
</html>