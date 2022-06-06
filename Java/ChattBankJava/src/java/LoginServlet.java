

import Business.Customer;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/* 
    Sotonte Bob-manuel
    Lab 07
    I promise I wrote this code
*/
@WebServlet(urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
       
        try
        {
            String id = request.getParameter("customerID");
            String password = request.getParameter("password");
            System.out.println("ID retrieved: " + id);
            System.out.println("Password retrieved: " + password);
            
            Customer c1 = new Customer();   
            c1.selectDB(Integer.parseInt(id));   
            
            if(id.equals(String.valueOf(c1.getCustID())) && password.equals(String.valueOf(c1.getCustPassword())))
            {
                HttpSession ses1;
                ses1 = request.getSession();
                ses1.setAttribute("c1", c1); 
                
                RequestDispatcher rd = request.getRequestDispatcher("/DisplayAccounts.jsp");
                rd.forward(request, response);
            }
            else
            {
                HttpSession ses1;
                ses1 = request.getSession();
                ses1.setAttribute("c1", c1); 
                
                RequestDispatcher rd = request.getRequestDispatcher("/ErrorPage.jsp");
                rd.forward(request, response);  
            }
        }
        finally
        {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
