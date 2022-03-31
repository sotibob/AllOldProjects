<%-- 
    Document   : DentistAppointments
    Created on : Nov 16, 2021, 3:36:54 PM
    Author     : Sotonte Bob-manuel
    Java III Project
    I promise I wrote this code
--%>

<%@page import="Business.Dentist"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
            h1  {text-align: center;
                margin-top: 0px;}
            body {background-color: #eaeaea;
                font-family: Trebuchet MS,sans-serif;}
            .center { text-decoration: none;
		display: flex;
                text-align: left;
                background-color: #FFFFFF;
                padding: 20px;
                margin-top: 20px;
                border-radius: 20px;
                justify-content: center;
                text-decoration: none;}
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
        <title>Upcoming Appointments</title>
    </head>
    <body>
        <h1>Appointments</h1>
        <%
                Dentist d1;
                d1 = (Dentist)session.getAttribute("d1");
                d1.Display();
                int count = d1.apptList.count;
                for(int i = 0; i < count; i++)
                {
        %>
        <div class="center">
            <form>
                <h2>Appointment <%=i+1%></h2>
                <table>
                    <tr>
                        <td>Appointment Date/Time:</td>  <td><%=d1.apptList.appt[i].getDateTime()%></td>
                    </tr>
                    <tr>
                        <td>Patient ID:</td>  <td><%=d1.apptList.appt[i].getPID()%></td>
                    </tr>
                    <tr>
                        <td>Procedure Code:</td>  <td><%=d1.apptList.appt[i].getProCode()%></td>
                    </tr>
                </table>
            </form>       
        </div>
        <%
            }
        %>
    </body>
</html>
