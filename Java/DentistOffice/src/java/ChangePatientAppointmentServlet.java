//Sotonte Bob-manuel
//Java III Project
//I promise I wrote this code

import Business.Appointment;
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

@WebServlet(urlPatterns = {"/ChangePatientAppointmentServlet"})
public class ChangePatientAppointmentServlet extends HttpServlet {

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
            String appt = request.getParameter("appt");
            String pid = request.getParameter("patientID");
            String did = request.getParameter("dentistID");
            String pCode = request.getParameter("proCode");
            System.out.println("Appointment retrieved: " + appt);
            System.out.println("Patient ID retrieved: " + pid);
            System.out.println("Dentist ID retrieved: " + did);
            System.out.println("ProCode retrieved: " + pCode);
            
            //New Appointment Object is created and the information is pulled from the database
            Appointment apptM = new Appointment();
            apptM.selectDB(appt, pid);
            
            if(apptM.getDateTime().equals(appt) && apptM.getPID().equals(pid)) //If the Appointment Date/Time, and the Patient Id matches any in the database
            {
                //Update
                apptM.setDateTime(appt);
                apptM.setPID(pid);
                apptM.setDID(did);
                apptM.setProCode(pCode);
                apptM.updateDB();
                
                //New Patient Object is created and information is pulled to be put in the session for the PatientInfo page to get
                Patient p1 = new Patient();
                p1.selectDB(pid);
                
                //New session is created and the patient object is put in to it
                HttpSession ses1;
                ses1 = request.getSession();
                ses1.setAttribute("p1", p1); 
                
                //Forward controls back to the PatientInfo page
                RequestDispatcher rd = request.getRequestDispatcher("/PatientInfo.jsp");
                rd.forward(request, response);
            }
            else //If the Appointment Date/Time, and the Patient Id doesn't match any in the database
            {
                apptM.insertDB(appt, pid, did, pCode); //Insert into database
                
                //New Patient Object is created and information is pulled to be put in the session for the PatientInfo page to get
                Patient p1 = new Patient();
                p1.selectDB(pid);
                
                //New session is created and the patient object is put in to it
                HttpSession ses1;
                ses1 = request.getSession();
                ses1.setAttribute("p1", p1); 
                
                //Forward controls back to the PatientInfo page
                RequestDispatcher rd = request.getRequestDispatcher("/PatientInfo.jsp");
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
