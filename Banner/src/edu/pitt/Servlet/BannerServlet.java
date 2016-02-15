package edu.pitt.Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import edu.pitt.Bean.ParamsSet;;

/**
 * Servlet implementation class BadgeServlet
 */
public class BannerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public BannerServlet() {
		super();
	}

	private void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		
		ParamsSet ps = new ParamsSet();
		ps.setName(request.getParameter("NAME"));
		ps.setFtsize(request.getParameter("FTSIZE"));
		ps.setShape(request.getParameter("SHAPE"));
		ps.setFtstyle(request.getParameter("FTSTYLE"));
		ps.setX(request.getParameter("X"));
		ps.setY(request.getParameter("Y"));
		ps.setColor(request.getParameter("COLOR"));
		ps.setBgcolor(request.getParameter("BGCOLOR"));
		
		
		System.out.println("\nyy COLOR: "+request.getParameter("COLOR"));
		System.out.println("yy: BGCOLOR "+request.getParameter("BGCOLOR"));
		System.out.println("ps: COLOR "+ps.getColor());
		System.out.println("ps: BGCOLOR "+ps.getBgcolor());
		
		HttpSession session = request.getSession();
		//session.setAttribute("ParamsSet", ps);
		request.setAttribute("ParamsSet", ps);
		System.out.println("\nName: "+ps.getName()+
				"\nFTSIZE: "+ps.getFtsize()+
				"\nFTSYYLE: "+ps.getFtstyle()+
				"\nSHAPE: "+ps.getShape()+
				"\nX: "+ps.getX()+
				"\nY "+ ps.getY()+
				"\nCOLOR: "+ps.getColor()+
				"\nBGCOLOR: "+ps.getBgcolor());

		RequestDispatcher dispatcher = request.getRequestDispatcher("Banner.jsp");
		
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

}
