package edu.kosmo.stu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Student
 */
@WebServlet("/grade")
public class Grade extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Grade() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Student student;
		try {

			response.setContentType("text/html; charset=euc-kr");

			PrintWriter writer = response.getWriter();

			String name = request.getParameter("name");
			String kor = request.getParameter("kor");
			String eng = request.getParameter("eng");
			String math = request.getParameter("math");

			student = new Student(name, Integer.valueOf(kor), Integer.valueOf(eng), Integer.valueOf(math));
			//student.setEng(Integer.valueOf(eng));와 같음
			
			writer.println("이름 : " + student.getName());
			writer.println("총점 : " + student.getTotal());
			writer.println("평균 : " + student.getAvg());
			

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
