package controller;

import java.io.IOException;
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
import bean.chitietdangkybean;
import bean.nhanvienbean;
import bo.bangdangkybo;
import bo.chitietdangkybo;
import bo.nhanvienbo;

/**
 * Servlet implementation class index
 */
@WebServlet("/index")
public class index extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public index() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String select_Nam = request.getParameter("select-nam");
		String select_Thang = request.getParameter("selectthang");
		nhanvienbo nvbo = new nhanvienbo();
		bangdangkybo bdkbo= new bangdangkybo();
		nhanvienbean nv = (nhanvienbean)session.getAttribute("nhanvien");
		String url = "";
		if(nv != null) {
			url = "index.jsp";
			try {
				ArrayList<bangdangkybean> ds = bdkbo.selectBDKByMaNV(nv.getMaNV());
				request.setAttribute("bdk", ds);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else {
			url = "login.jsp";
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
