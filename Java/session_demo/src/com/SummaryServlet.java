package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dto.User;

/**
 * Servlet implementation class SummaryServlet
 */
public class SummaryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SummaryServlet() {
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
			u.setContact(Long.parseLong(request.getParameter("contact")));
			u.setCity(request.getParameter("city"));
			
			PrintWriter out = response.getWriter();
			out.println("<h2>Hello " + u.getEmail() + "</h2>");
			out.println("<h3>Details... " + u.toString() + "</h3>");
			out.println("<h4>Session Id is " + session.getId() + "</h4>");
			out.println("<h4>Session created at " + session.getCreationTime() + "</h4>");
			session.invalidate();
		}
	}

}
