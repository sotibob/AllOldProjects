<%-- 
    Document   : DentistInfo
    Created on : Nov 12, 2021, 8:40:03 PM
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
            h1,h2  {text-align: center;
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
                border-radius: 20px}
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
        <title>Dentist Information Page</title>
    </head>
    <body>
        <%
            Dentist d1;
            d1 = (Dentist)session.getAttribute("d1");
            d1.Display();

            HttpSession ses1;
            ses1 = request.getSession();
            ses1.setAttribute("d1", d1);
        %>
        <div class="center">
            <h1>Welcome <%=d1.getFirstName()%>!</h1>
        </div>
        <div class="center">
            <form>
                <h2>Personal Information</h2><br>
                <table>
                    <tr>
                        <td>First Name:</td>  <td><%=d1.getFirstName()%></td>
                    </tr>
                    <tr>
                        <td>Last Name:</td>  <td><%=d1.getLastName()%></td>
                    </tr>
                    <tr>
                        <td>Email:</td>  <td><%=d1.getEmail()%></td>
                    </tr>
                    <tr>
                        <td>Office:</td>  <td><%=d1.getOffice()%></td>
                    </tr>
                    <tr>
                        <div class="flex-container">
                            <div>
                                <a target="_blank" href="ChangeDentistInfo.jsp">Change MyInfo</a>
                            </div>
                            <div>
                                <a target="_blank" href="DentistAppointments.jsp">Upcoming Appointments</a>
                            </div>
                        </div>
                    </tr>
                </table>
            </form>
        </div>
    </body>
</html>
