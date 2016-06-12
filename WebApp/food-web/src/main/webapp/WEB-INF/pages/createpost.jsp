<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Create post</title>
</head>

<body>
  <section id="container" class=""> <section id="main-content"> <section class="wrapper">
  <div class="row">
    <div class="col-lg-12">
      <h3 class="page-header">
        <i class="fa fa fa-bars"></i> Dashboard
      </h3>
      <ol class="breadcrumb">
        <li><i class="fa fa-home"></i><a href="">Home</a></li>
        <li><i class="fa fa-bars"></i>Pages</li>
        <li><i class="fa fa-square-o"></i>Pages</li>
      </ol>
    </div>
  </div>

  <div class="page-wrapper">
  <div class="row">
    <div class="col-md-12">

      <div class="widget">
        <div class="widget-head">
          <div class="pull-left">Thông tin món ăn</div>
          <div class="widget-icons pull-right">
            <a href="#" class="wminimize"><i class="fa fa-chevron-up"></i></a> <a href="#" class="wclose"><i
              class="fa fa-times"></i></a>
          </div>
          <div class="clearfix"></div>
        </div>
        <div class="widget-content">
          <div class="padd">
            <!-- Content goes here -->
            <form class="form-horizontal" role="form">
              <div class="form-group">
                <label class="col-lg-2 control-label">Tên món ăn:</label>
                <div class="col-lg-5">
                  <input type="text" class="form-control" placeholder="Nhập tên món ăn" id="txtFoodName">
                </div>
              </div>
              <div class="form-group">
                <label class="col-lg-2 control-label">Chủ đề:</label>
                <div class="col-lg-2">
                  <select class="form-control" id="cbbCategory" >
                  </select>
                </div>
              </div>
              <div class="form-group">
                <label class="col-lg-2 control-label">Ảnh:</label>
                <div class="col-lg-5">
                  <input type="text" class="form-control imagelink" placeholder="Link hình ảnh" id="txtImages">
                </div>
              </div>
              <div class="form-group">
                <label class="col-lg-2 control-label">Mô tả:</label>
                <div class="col-lg-6">
                  <textarea id="txtDescription" cols="100" rows="8" style="resize: none"></textarea>
                </div>
              </div>
              <div class="form-group">
                <label class="col-lg-2 control-label">Nguyên liệu:</label>
                <div class="col-lg-6">
                  <textarea id="txtMaterialLst" cols="100" rows="8" style="resize: none"></textarea>
                </div>
              </div>
              <div class="form-group">
                <label class="col-lg-2 control-label">Chi tiết nguyên liệu:</label>
                <div class="col-lg-6">
                  <textarea id="txtMaterialDetail" class="cleditor"></textarea>
                </div>
              </div>
              <div class="form-group">
                <label class="col-lg-2 control-label">Hướng dẫn:</label>
                <div class="col-lg-6">
                  <textarea class="cleditor" id="txtContent"></textarea>
                </div>
              </div>
              <div class="form-group">
                <label class="col-lg-2 control-label">Nguồn:</label>
                <div class="col-lg-5">
                  <input type="text" class="form-control imagelink" placeholder="Nguồn" id="txtSource">
                </div>
              </div>
              <div class="form-group">
                <div class="col-lg-offset-2 col-lg-6">
                  <button id="btnSubmit" type="button" class="btn btn-sm btn-default">Submit</button>
                  <button id="btnReset" type="button" class="btn btn-sm btn-primary">Cancel</button>
                </div>
              </div>
              <div class="form-group">
                <div class="col-lg-offset-2 col-lg-6" id="createSuccess"></div>
              </div>
            </form>
          </div>
          <div class="widget-foot">
            <!-- Footer goes here -->
          </div>
        </div>
      </div>

    </div>
    </div>
  </div>
  </section> </section> </section>
</body>
</html>