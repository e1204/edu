package edu.kosmo.ex;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.kosmo.ex.shape.Rectangle;



/**
 * Servlet implementation class RecServlet
 */
@WebServlet("/rec")
public class RecServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RecServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
			Rectangle rec = new Rectangle();
		
		try {

			String width = request.getParameter("width");
			String height = request.getParameter("height");
			
		
			rec.setHeight(Double.valueOf(height));
			rec.setWidth(Double.valueOf(width));
			
			String[] hobbys = request.getParameterValues("hobby");
			String major = request.getParameter("major");
			String protocol = request.getParameter("protocol");

			double area = Double.valueOf(width) * Double.valueOf(height);

			response.setContentType("text/html; charset=euc-kr");

			PrintWriter writer = response.getWriter();

			writer.println("<html>");
			writer.println("<head>");
			writer.println("</head>");
			writer.println("<body>");

			//writer.println("<h1> 넓이 : " + area + "</h1>");
			writer.println("<h1> 넓이 : " + rec.getArea() + "</h1>");
			writer.println("<h1> 취미 : " + Arrays.toString(hobbys));
			writer.println("<h1> 전공 : " + major);
			writer.println("<h1> 프로토콜 : " + protocol);

			writer.println("</body>");

			writer.close();

		} catch (Exception e) {
			response.setContentType("text/html; charset=euc-kr");
			PrintWriter writer = response.getWriter();
			writer.println("에러");
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
