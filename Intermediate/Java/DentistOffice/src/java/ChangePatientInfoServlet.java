//Sotonte Bob-manuel
//Java III Project
//I promise I wrote this code

import Business.Dentist;
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

@WebServlet(name = "ChangePatientInfoServlet", urlPatterns = {"/ChangePatientInfoServlet"})
public class ChangePatientInfoServlet extends HttpServlet {

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
            //Collects data from textboxes and displays it
            String id = request.getParameter("patientID");
            String fn = request.getParameter("firstName");
            String ln = request.getParameter("lastName");
            String address = request.getParameter("address");
            String email = request.getParameter("email");
            String insurance = request.getParameter("insurance");
            System.out.println("Patient ID retrieved: " + id);
            System.out.println("FirstName retrieved: " + fn);
            System.out.println("LastName retrieved: " + ln);
            System.out.println("Address retrieved: " + address);
            System.out.println("Email retrieved: " + email);
            System.out.println("Insurance retrieved: " + insurance);
            
            //New Patient Object is created and the information is pulled from the database, and updated
            Patient p1 = new Patient();
            p1.selectDB(id);
            p1.setFirstName(fn);
            p1.setLastName(ln);
            p1.setAddress(address);
            p1.setEmail(email);
            p1.setInsurance(insurance);
            p1.updateDB();
            
            //New session is created and the Patient object is put in it
            HttpSession ses1;
            ses1 = request.getSession();
            ses1.setAttribute("p1", p1); 
            
            //Forward controls to another page
            RequestDispatcher rd = request.getRequestDispatcher("/PatientInfo.jsp");
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
