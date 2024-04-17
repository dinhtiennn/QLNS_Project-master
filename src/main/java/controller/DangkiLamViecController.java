package controller;

import java.io.IOException;
import java.sql.Date;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.nhanvienbean;
import bo.bangdangkybo;

/**
 * Servlet implementation class DangkiLamViecController
 */
@WebServlet("/dangkilamviec")
public class DangkiLamViecController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DangkiLamViecController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "login";
		String[] caSang = request.getParameterValues("casang");
		String[] caChieu = request.getParameterValues("cachieu");
		String[] caToi = request.getParameterValues("catoi");
		bangdangkybo bdkbo = new bangdangkybo();
		HttpSession session = request.getSession();
		if((nhanvienbean)session.getAttribute("nhanvien")!=null) {
			nhanvienbean nv = (nhanvienbean)session.getAttribute("nhanvien");
			try {
				url = "DangKiLamViec.jsp";
				if(caSang != null || caChieu != null || caToi != null) {
				    	bdkbo.insertDK(nv.getMaNV());			
				    	if (caSang != null) {
				    		for (String ngay : caSang) {
				    			bdkbo.insertCTDK("LC1", Date.valueOf(ngay));
				    			System.out.println("sang: " + ngay);
				    		}
				    	}
				    	if (caToi != null) {
				    		for (String ngay : caChieu) {
				    			bdkbo.insertCTDK("LC2", Date.valueOf(ngay));
				    			System.out.println("chieu: " + ngay);
				    		}
				    	}
				    	if (caToi != null) {
				    		for (String ngay : caToi) {
				    			bdkbo.insertCTDK("LC3", Date.valueOf(ngay));
				    			System.out.println("toi: " + ngay);
				    		}
				    	}
				    	System.out.println("Đăng kí thành công!");
				    	request.setAttribute("msgSuccess", "Đăng kí thành công!");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
