package controller;

import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.bangdangkybean;
import bean.dangkybean;
import bean.nhanvienbean;
import bo.bangdangkybo;

/**
 * Servlet implementation class LichTrinhThangController
 */
@WebServlet("/lichtrinhthang")
public class LichTrinhThangController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LichTrinhThangController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "login";
		bangdangkybo bdkbo = new bangdangkybo();
		HttpSession session = request.getSession();
		if((nhanvienbean)session.getAttribute("nhanvien")!=null) {
			nhanvienbean nv = (nhanvienbean)session.getAttribute("nhanvien");
			try {
				LocalDate date = LocalDate.now();
				url = "LichTrinhThang.jsp";
				ArrayList<bangdangkybean> ds = bdkbo.selectBDKByMaNV_Month_Year(nv.getMaNV(),date.getMonthValue(),date.getYear());
				for (bangdangkybean bangdangkybean : ds) {
					System.out.println(bangdangkybean.toString());
				}
				request.setAttribute("bdk", ds);
			} catch (Exception e) {
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
