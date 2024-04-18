<%@page import="java.util.Locale"%>
<%@page import="java.time.format.DateTimeFormatter"%>
<%@page import="java.time.DayOfWeek"%>
<%@page import="java.time.LocalDate"%>
<%@page import="bean.nhanvienbean"%>
<%@page import="bean.bangdangkybean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bo.bangdangkybo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.min.js" integrity="sha384-0pUGZvbkm6XF6gxjEnlmuGrJXVbNuzT9qBBavbLwCsOGabYfZo0T0to5eqruptLy" crossorigin="anonymous"></script>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
<div class="row">
	<div class="col-2  mt-5">
		<jsp:include page="Slidebar.jsp"></jsp:include>
	</div>
	<div class="col-10 mt-4">
			 <h2 class="text-center mb-3">Lịch trình tuần hiện tại</h2>
   		<div class="container-fluid">
	    	<%
		    	LocalDate currentDate = LocalDate.now();
	    		nhanvienbean nhanvien = (nhanvienbean)session.getAttribute("nhanvien");
		        // Tính toán ngày bắt đầu và kết thúc của tuần
		        LocalDate startOfWeek = currentDate.with(DayOfWeek.MONDAY);
		        LocalDate endOfWeek = currentDate.with(DayOfWeek.SATURDAY);
		        DateTimeFormatter dayFormatter = DateTimeFormatter.ofPattern("EEEE", new Locale("vi", "VN"));
		        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	    	%>
	        <table class="table table-bordered">
	            <thead>
	                <tr>
	                	<%                	
	                	// In ra các ngày từ thứ 2 đến thứ 7 của tuần
	                	while (!startOfWeek.isAfter(endOfWeek)) {
	                        String dayOfWeek = startOfWeek.format(dayFormatter);
	                        String date = startOfWeek.format(dateFormatter);
	                        %>
	       	        		<th style="width:14%" class="text-center table-primary">
		                        <%=dayOfWeek%><br />
		                        <%=date%>
		                    </th>
	        	        	<%
	                        startOfWeek = startOfWeek.plusDays(1);
	                    }
	                	%>
	                </tr>
	            </thead>
	            <tbody>
	                    <tr>
	                    </tr>
	                    <tr>
	                    	 <%    
	                    	startOfWeek = currentDate.with(DayOfWeek.MONDAY);
		                	// In ra các ngày từ thứ 2 đến thứ 7 của tuần
                        	try {
                        		
                        		ArrayList<bangdangkybean> ds = (ArrayList<bangdangkybean>)request.getAttribute("bdk");
			                	while (!startOfWeek.isAfter(endOfWeek)) {
			                		int n =0;
			                        String date = startOfWeek.toString();
			            				for (bangdangkybean bangdangkybean : ds) {
			            					if(bangdangkybean.getNgayDangKy().toString().equals(date)){%>
						                        <%if(bangdangkybean.getMaLoaiCa().equals("LC1")){
						                        n=1;%>
							       	        		<th style="width:14%" class="text-center">
							       	        		<a href="nv_dsnvlamtheongay?date=<%=date%>&lc=<%=bangdangkybean.getMaLoaiCa()%>">							       	        		
							       	        			Sáng
							       	        		</a>
								                    </th>
						                        <%}%>
			            				<%}%>
			            				<% }%>
			        	        	<%
			                        startOfWeek = startOfWeek.plusDays(1);%>
			                        <%if(n==0){ %>
			            				<th style="width:14%" class="text-center">&nbsp;
					                    </th>
					                    <%} %>
			                  <%  }
	            			} catch (Exception e) {
	            				e.printStackTrace();
	            			}
		                	%>
	                    </tr>
	                    <tr>
	                    </tr>
	                    <tr>
	                    	 <%    
	                    	startOfWeek = currentDate.with(DayOfWeek.MONDAY);
		                	// In ra các ngày từ thứ 2 đến thứ 7 của tuần
                        	try {
                        		ArrayList<bangdangkybean> ds = (ArrayList<bangdangkybean>)request.getAttribute("bdk");
			                	while (!startOfWeek.isAfter(endOfWeek)) {
			                		int n =0;
			                        String date = startOfWeek.toString();
			            				for (bangdangkybean bangdangkybean : ds) {
			            					if(bangdangkybean.getNgayDangKy().toString().equals(date)){%>
						                        <%if(bangdangkybean.getMaLoaiCa().equals("LC2")){
						                        n=1;%>
							       	        		<th style="width:14%" class="text-center">
							       	        			<a href="nv_dsnvlamtheongay?date=<%=date%>&lc=<%=bangdangkybean.getMaLoaiCa()%>">	       	        		
							       	        				Chiều
							       	        			</a>
								                    </th>
						                        <%}%>
			            				<%}%>
			            				<% }%>
			        	        	<%
			                        startOfWeek = startOfWeek.plusDays(1);%>
			                        <%if(n==0){ %>
			            				<th style="width:14%" class="text-center">&nbsp;
					                    </th>
					                    <%} %>
			                  <%  }
	            			} catch (Exception e) {
	            				e.printStackTrace();
	            			}
		                	%>
	                    </tr>
	                    <tr>
	                    </tr>
	                    <tr>
                          <%    
	                    	startOfWeek = currentDate.with(DayOfWeek.MONDAY);
		                	// In ra các ngày từ thứ 2 đến thứ 7 của tuần
                        	try {
	            				
                        		ArrayList<bangdangkybean> ds = (ArrayList<bangdangkybean>)request.getAttribute("bdk");
			                	while (!startOfWeek.isAfter(endOfWeek)) {
			                		int n =0;
			                        String date = startOfWeek.toString();
			            				for (bangdangkybean bangdangkybean : ds) {
			            					if(bangdangkybean.getNgayDangKy().toString().equals(date)){%>
						                        <%if(bangdangkybean.getMaLoaiCa().equals("LC3")){
						                        n=1;%>
							       	        		<th style="width:14%" class="text-center">
														<a href="nv_dsnvlamtheongay?date=<%=date%>&lc=<%=bangdangkybean.getMaLoaiCa()%>">			       	        		
							       	        				Tối
							       	        			</a>
								                    </th>
						                        <%}%>
			            				<%}%>
			            				<% }%>
			        	        	<%
			                        startOfWeek = startOfWeek.plusDays(1);%>
			                        <%if(n==0){ %>
			            				<th style="width:14%" class="text-center">&nbsp;
					                    </th>
					                    <%} %>
			                  <%  }
	            			} catch (Exception e) {
	            				e.printStackTrace();
	            			}
		                	%>
	                    </tr>
	            </tbody>
	        </table>
		</div>
	</div>
</body>
</html>