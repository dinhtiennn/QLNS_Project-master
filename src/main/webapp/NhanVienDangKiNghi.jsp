<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.min.js" integrity="sha384-0pUGZvbkm6XF6gxjEnlmuGrJXVbNuzT9qBBavbLwCsOGabYfZo0T0to5eqruptLy" crossorigin="anonymous"></script>
<title>Đăng kí nghỉ</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<div class="container">
		<form>
	    <legend>Đăng kí nghỉ</legend>
	    <div class="mb-3">
	      <label for="" class="form-label">Chọn ngày:</label>
	      <select id="" class="form-select">
	        <option>Disabled select</option>
	        <option>Disabled select</option>
	        <option>Disabled select</option>
	        <option>Disabled select</option>
	      </select>
	    </div>
	    <div class="mb-3">
	      <label for="" class="form-label">Chọn loại ca:</label>
	      <select id="" class="form-select">
	        <option>Disabled select</option>
	        <option>Disabled select</option>
	        <option>Disabled select</option>
	        <option>Disabled select</option>
	      </select>
	    </div>
	    <button type="submit" class="btn btn-primary">Gửi</button>
	</form>
</div>
</body>
</html>