//Sotonte Bob-manuel
//Java III Project
//I promise I wrote this code

import Business.Dentist;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/ChangeDentistInfoServlet"})
public class ChangeDentistInfoServlet extends HttpServlet {

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
            String id = request.getParameter("dentistID");
            String fn = request.getParameter("firstName");
            String ln = request.getParameter("lastName");
            String email = request.getParameter("email");
            String office = request.getParameter("office");
            System.out.println("Dentist ID retrieved: " + id);
            System.out.println("FirstName retrieved: " + fn);
            System.out.println("LastName retrieved: " + ln);
            System.out.println("Email retrieved: " + email);
            System.out.println("Office retrieved: " + office);
            
            //New Dentist Object is created and information is pulled, and updated to be put in the session for the DentistInfo page to get
            Dentist d1 = new Dentist();
            d1.selectDB(id);
            d1.setFirstName(fn);
            d1.setLastName(ln);
            d1.setEmail(email);
            d1.setOffice(office);
            d1.updateDB();
            
            //New session is created and the dentist object is put in to it
            HttpSession ses1;
            ses1 = request.getSession();
            ses1.setAttribute("d1", d1); 
            
            //Forward controls back to the DentistInfo page
            RequestDispatcher rd = request.getRequestDispatcher("/DentistInfo.jsp");
            rd.forward(request, response);
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
