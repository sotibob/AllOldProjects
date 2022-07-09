package com;
import dto.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SecondServlet
 */
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecondServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User u = new User();
		HttpSession session = request.getSession(false);
		
		if(session != null) {
			u = (User) session.getAttribute("user");
			u.setAge(Integer.parseInt(request.getParameter("age")));
			u.setEmail(request.getParameter("email"));
			session.setAttribute("user", u);
			response.sendRedirect("three.html");
		}
	}

}
