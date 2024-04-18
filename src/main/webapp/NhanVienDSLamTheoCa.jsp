<%@page import="java.time.LocalDate"%>
<%@page import="java.time.format.DateTimeFormatter"%>
<%@page import="bean.nhanvienbean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<jsp:include page="header.jsp"></jsp:include>
		<%
			nhanvienbean nhanvien = (nhanvienbean)session.getAttribute("nhanvien"); 
			String dateString = (request.getAttribute("date")!=null?request.getAttribute("date").toString():"");
			String loaicaString = (request.getAttribute("loaica")!=null?request.getAttribute("loaica").toString():"");
			String loaica = "";
			if(loaica.equals("LC1")){
				loaica = "Ca sáng";
			}else if(loaica.equals("LC2")){
				loaica = "Ca chiều";
			}else{
				loaica = "Ca tối";
			}
	        // Định dạng ngày
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

	        // Chuyển đổi thành đối tượng LocalDate
	        LocalDate date = LocalDate.parse(dateString, formatter);

	        // Định dạng lại thành "dd/MM/yyyy"
	        String formattedDate = date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

		%>
		
		<div class="row">
			<div class="col-2  mt-5">
				<jsp:include page="Slidebar.jsp"></jsp:include>
			</div>
			<div class="col-6  mt-5">
				Danh sách làm của:
				<br>
				<br>
					Ngày: <%=formattedDate%> 
				<br>
				 	Loại ca: <%=loaica%>
				<table class="table">
				  <thead>
				    <tr>
				      <th scope="col">#</th>
				      <th scope="col">Mã nhân viên</th>
				      <th scope="col">Tên nhân viên</th>
				    </tr>
				  </thead>
				  <tbody>
				    <tr>
				      <th scope="row">1</th>
				      <td>Mark</td>
				      <td>Otto</td>
				    </tr>
				  </tbody>
				</table>
			</div>
			<div class="col-4  mt-5 px-5">
				<a href="dangkinghi??date=<%=date%>&lc=<%=loaica%>&manv=<%=nhanvien.getMaNV()%>">
					<button type="button" class="btn btn-warning">Đăng kí nghỉ phép cho ngày này</button>
				</a>
			</div>
		</div>
</body>
</html>