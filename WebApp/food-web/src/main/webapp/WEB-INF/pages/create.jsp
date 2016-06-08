<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Create</title>
</head>
<body>

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
  <div id="page-wrapper">
    <div class="col-lg-12">
      <div class="panel panel-default">
        <div class="panel-heading">Nhập món ăn</div>
        <form class="form-horizontal" role="form">
          <div class="form-group">
            </br> <label class="col-lg-2 control-label">Tên món</label>
            <div class="col-lg-5">
              <input type="text" class="form-control" placeholder="Input food name Here" id="txtFoodName">
            </div>
          </div>
          <div class="form-group">
            <label class="col-lg-2 control-label">Chủ đề</label>
            <div class="col-lg-5">
              <select class="form-control" id="cbbCategory">
              </select>
            </div>
          </div>
          <div class="form-group">
            <label class="col-lg-2 control-label">Miêu tả</label>
            <div class="col-lg-5">
              <textarea class="cleditor" name="input" id="txtDescription"></textarea>
            </div>
          </div>
          <div class="form-group">
            <label class="col-lg-2 control-label">Danh sách nguyên liệu</label>
            <div class="col-lg-5">
              <textarea class="cleditor" name="input" id="txtMaterialLst"></textarea>
            </div>
          </div>
          <div class="form-group">
            <label class="col-lg-2 control-label">Chi tiết</label>
            <div class="col-lg-5">
              <textarea class="cleditor" name="input" id="txtMaterialDetail"></textarea>
            </div>
          </div>
          <div class="form-group">
            <label class="col-lg-2 control-label">Hướng dẫn</label>
            <div class="col-lg-6">
              <textarea class="cleditor" name="input" id="txtContent"></textarea>
            </div>
          </div>
          <div class="form-group">
            <label class="col-lg-2 control-label">Nguồn</label>
            <div class="col-lg-6">
              <input type="text" class="form-control imagelink" placeholder="Input title Here" id="txtSource">
            </div>
          </div>

          <div class="form-group">
            <div class="col-lg-offset-2 col-lg-6">
              <button type="button" class="btn btn-sm btn-default">Submit</button>
              <button type="reset" class="btn btn-sm btn-primary">Cancel</button>
            </div>
          </div>
        </form>
      </div>
    </div>
  </div>
</body>
</html>