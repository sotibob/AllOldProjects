//Sotonte Bob-manuel
//Java III Project
//I promise I wrote this code

import Business.Patient;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/PatientLoginServlet"})
public class PatientLoginServlet extends HttpServlet {

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
            //Colects data from the textboxes
            String id = request.getParameter("patientID");
            String password = request.getParameter("password");
            System.out.println("ID retrieved: " + id);
            System.out.println("Password retrieved: " + password);
            
            //New Patient Object is created and the information is pulled from the database
            Patient p1 = new Patient();   
            p1.selectDB(id);   
            
            if(id.equals(p1.getID()) && password.equals(p1.getPassword())) //If the password and ID inputed matches any in the database
            {
                //New session is created and the Patient Object is put into it
                HttpSession ses1;
                ses1 = request.getSession();
                ses1.setAttribute("p1", p1); 
                
                //Forwards to another page
                RequestDispatcher rd = request.getRequestDispatcher("/PatientInfo.jsp");
                rd.forward(request, response);
            }
            else //If the password and ID inputed doesn't match any in the database
            {
                p1.setID(id);
                //New session is created and the Patient Object is put into it
                HttpSession ses1;
                ses1 = request.getSession();
                ses1.setAttribute("p1", p1); 
                
                //Forwards to another page
                RequestDispatcher rd = request.getRequestDispatcher("/PatientError.jsp");
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
