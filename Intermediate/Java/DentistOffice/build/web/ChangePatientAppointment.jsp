<%-- 
    Document   : ChangePatientAppointment
    Created on : Nov 17, 2021, 5:27:45 PM
    Author     : Sotonte Bob-manuel
    Java III Project
    I promise I wrote this code
--%>

<%@page import="Business.Patient"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
            h1  {text-align: center;
                margin-top: 0px;}
            body {background-color: #98CFD9;
                font-family: Trebuchet MS,sans-serif;}
            .center { text-decoration: none;
		display: block;
                text-align: left;
                background-color: #AFF7F4;
                padding: 20px;
                margin-left: 450px;
                margin-right: 420px;
                margin-top: 20px;
                border-radius: 20px;}
            .flex-container { text-decoration: none;
		display: flex;
                justify-content: center;}
            a:link { color: #0000FF;
                    text-decoration: none;
                    display: block;
                    padding: 15px;}
            a:visited{color: #800080;}
            a:hover {color: #000000;}
            table {margin-left: 80px;}
            td  {padding: 5px;}
        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Change/Add Appointment</title>
    </head>
    <body>
        <div class="center">
            <h1>Change/Add Appointment</h1>
            <form name="DataForm" action="http://localhost:8080/DentistOffice/ChangePatientAppointmentServlet" method="post">
                <%
                Patient p1;
                p1 = (Patient)session.getAttribute("p1");
                p1.Display();
                %>
                <table>
                    <tr>
                        <td>Appointment Date/Time:</td>  <td><input type="text" name="appt" value="<%=p1.dateTime%>"></td>
                    </tr>
                    <tr>
                        <td>ID:</td>  <td><input type="password" name="patientID" value="<%=p1.getID()%>"></td>
                    </tr>
                    <tr>
                        <td>Dentist ID:</td>  <td><input type="text" name="dentistID" value="<%=p1.dentId%>"></td>
                    </tr>
                    <tr>
                        <td>Procedure Code:</td>  <td><input type="text" name="proCode" value="<%=p1.proc%>"></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Change"></td>
                        <td><input type="reset" value="Clear"></td>
                    </tr>
                </table>
            </form>
        </div>
    </body>
</html>
