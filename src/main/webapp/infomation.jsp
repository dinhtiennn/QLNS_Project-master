<%@page import="javax.crypto.Mac"%>
<%@page import="bean.nhanvienbean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tài khoản của tôi </title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
	<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js" integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+" crossorigin="anonymous"></script>
	<link rel="stylesheet" href="aset/css/style.css">
	<!-- <link rel="stylesheet" href="aset/script/js.js"> -->
</head>
<body>
	
	<jsp:include page="header.jsp"></jsp:include>
	<%
		nhanvienbean nhanvien = (nhanvienbean)session.getAttribute("nhanvien");	
	
		String name = nhanvien.getTenNV();
		String gioiTinh = nhanvien.getGioiTinh();
		String ngaySinh = nhanvien.getNgaySinh().toString();
		String email = nhanvien.getEmail();
		String soDienThoai = nhanvien.getSDT();
		String maCV = nhanvien.getMaCV();
		String dVCT = nhanvien.getDVCT();
		String chucDanh = nhanvien.getChucDanh();
		String username = nhanvien.getTenDangNhap();
	%>
	
	<div class="mx-4 mt-4">
		<div class="container">
			<div class="col-lg-9">
				<form action="" method="post">
					    <div class="mb-3 row">
							    <label for="hovaten" class="col-sm-2 col-form-label"><span class="required">*</span>Họ và tên:</label>
							    <div class="col-sm-10">
							      <input type="text" class="form-control" id="hovaten" value="<%=name%>" name="name" required="required">
							    </div>
					    </div>
					    <div class="mb-3">
						   
						   
						</div>
					    <div class="mb-3 row">
							    <label for="gioitinh" class="col-sm-2 col-form-label">Giới tính:</label>
							    <div class="col-sm-10">
							       <select class="form-select" id="gioitinh" aria-label="Default select example" name="gioitinh" >
									  <option <%=gioiTinh.equals("")?"selected='selected'":"" %>>Chọn giới tính</option>
									  <option value="1" <%=(gioiTinh.equals("Nam"))?"selected='selected'":"" %>>Nam</option>
									  <option value="2" <%=(gioiTinh.equals("Nữ"))?"selected='selected'":"" %>>Nữ</option>
									</select>
							    </div>
					    </div>
					    <div class="mb-3 row">
							    <label for="ngaysinh" class="col-sm-2 col-form-label">Ngày sinh:</label>
							    <div class="col-sm-10">
							      <input type="date" class="form-control" id="ngaysinh" value="<%=ngaySinh%>" name="ngaysinh">
							    </div>
					    </div>
					    <div class="mb-3 row">
							    <label for="email" class="col-sm-2 col-form-label"><span class="required">*</span>Email:</label>
							    <div class="col-sm-10">
							      <input type="email" class="form-control" id="email" value="<%=email%>" name="email" required="required">
							    </div>
					    </div>		    
					    <div class="mb-3 row">
							    <label for="sodienthoai" class="col-sm-2 col-form-label"><span class="required">*</span>Số điện thoại:</label>
							    <div class="col-sm-10">
							      <input type="number" class="form-control" id="sodienthoai" value="<%=soDienThoai%>" name="phonenumber" required="required">
							    </div>
					    </div> 
					    <div class="mb-3 row">
							    <label for="usename-register" class="col-sm-2 col-form-label">Tên đăng nhập:</label>
							    <div class="col-sm-10">
							      <input type="text" readonly class="form-control-plaintext" id="usename-register" value="<%=username%>" name="username-register">
							    </div>
					    </div>   
					    <div class="mb-3 row">
							    <label for="diachikhachhang" class="col-sm-2 col-form-label"><span class="required">*</span>Mã chức vụ:</label>
							    <div class="col-sm-10">
							      <input type="text" readonly class="form-control-plaintext" id="diachikhachhang" value="<%=maCV%>" name="macv" required="required">
							    </div>
					    </div>
					    <div class="mb-3 row">
							    <label for="diachinhanhang" class="col-sm-2 col-form-label">Đơn vị công tác:</label>
							    <div class="col-sm-10">
							      <input style="user-select: none;" type="text" readonly class="form-control-plaintext" id="diachinhanhang" value="<%=dVCT%>" name="dvct">
							    </div>
					    </div>
						<div class="">
						        <a href="index" class="btn btn-secondary">Trang chủ</a>
						        <button type="submit" id="submit" class="btn btn-primary " name="action" value="changeinformationuser">Lưu</button>
						</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>