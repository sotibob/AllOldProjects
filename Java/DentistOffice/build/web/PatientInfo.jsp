<%-- 
    Document   : PatientInfo
    Created on : Nov 12, 2021, 8:40:37 PM
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
            h1, h2  {text-align: center;
                margin-top: 10px;}
            body {background-color: #98CFD9;
                font-family: Trebuchet MS,sans-serif;}
            .center { text-decoration: none;
		display: flex;
                text-align: left;
                background-color: #AFF7F4;
                padding: 20px;
                margin-left: 450px;
                margin-right: 420px;
                margin-top: 20px;
                border-radius: 20px;
                justify-content: center;}
            .center2 { text-decoration: none;
		display: flex;
                text-align: left;
                background-color: #AFF7F4;
                padding: 20px;
                margin: 20px;
                margin-top: 20px;
                border-radius: 20px;
                justify-content: center;
                float: left;}
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
            .margin {margin-left: 290px;}
        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Patient Information Page</title>
    </head>
    <body>
        <%
            Patient p1;
            p1 = (Patient)session.getAttribute("p1");
            p1.Display();
            
            HttpSession ses1;
            ses1 = request.getSession();
            ses1.setAttribute("p1", p1); 
        %>
        <div class="center">
            <h1>Welcome <%=p1.getFirstName()%>!</h1>
        </div>
        <div class="margin">
            <div class="center2">
                <form>
                    <h2>Personal Information</h2><br>
                    <table>
                        <tr>
                            <td>First Name:</td>  <td><%=p1.getFirstName()%></td>
                        </tr>
                        <tr>
                            <td>Last Name:</td>  <td><%=p1.getLastName()%></td>
                        </tr>
                        <tr>
                            <td>Address:</td>  <td><%=p1.getAddress()%></td>
                        </tr>
                        <tr>
                            <td>Email:</td>  <td><%=p1.getEmail()%></td>
                        </tr>
                        <tr>
                            <td>Insurance:</td>  <td><%=p1.getInsurance()%></td>
                        </tr>
                        <tr>
                            <div class="flex-container">
                                <a target="_blank" href="ChangePatientInfo.jsp">Change MyInfo</a>
                            </div>
                        </tr>
                    </table>
                </form>
            </div>
            <div class="center2">
                <form>
                    <h2>Appointment</h2><br>
                    <table>
                        <tr>
                            <td>Appointment Date/Time:</td>  <td><%=p1.dateTime%></td>
                        </tr>
                        <tr>
                            <td>Dentist Name:</td>  <td><%=p1.dentist.getFirstName()%> <%=p1.dentist.getLastName()%></td>
                        </tr>
                        <tr>
                            <td>Procedure Code:</td>  <td><%=p1.procedure.getProCode()%></td>
                        </tr>
                        <tr>
                            <td>Procedure Name:</td>  <td><%=p1.procedure.getProName()%></td>
                        </tr>
                        <tr>
                            <td>Procedure Description:</td>  <td><%=p1.procedure.getProDesc()%></td>
                        </tr>
                        <tr>
                            <td>Procedure Cost:</td>  <td>$<%=p1.procedure.getCost()%></td>
                        </tr>
                        <tr>
                            <div class="flex-container">
                                <a target="_blank" href="ChangePatientAppointment.jsp">Add/Update Appointment</a>
                            </div>
                        </tr>
                    </table>
                </form>
            </div>
        </div>
    </body>
</html>
