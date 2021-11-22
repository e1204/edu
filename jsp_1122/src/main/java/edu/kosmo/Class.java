package edu.kosmo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Class
 */
@WebServlet("/FormEx")
public class Class extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Class() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
		writer.println("<html>");
		writer.println("<head>");
		writer.println("</head>");
		writer.println("<body>");
		
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		writer.println("이름 : " + name + "<br>");
		writer.println("아이디 : " + id + "<br>");
		writer.println("비밀번호 : " + pw + "<br>");
		
		String[] hobby = request.getParameterValues("hobby");
		writer.println("취미 : " + Arrays.toString(hobby) + "<br>");
		
		String major = request.getParameter("major");
		writer.println("전공 : " + major + "<br>");
		
		String protocol = request.getParameter("protocol");
		writer.println("프로토콜 : " + protocol + "<br>");
		
		writer.println("</body>");
		writer.println("</html>");
		
		writer.close();
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
