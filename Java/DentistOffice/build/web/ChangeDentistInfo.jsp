<%-- 
    Document   : ChangeDentistInfo
    Created on : Nov 16, 2021, 3:39:09 PM
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
        <title>Change MyInfo</title>
    </head>
    <body>
        <div class="center">
            <h1>Change Personal Information</h1>
            <form name="DataForm" action="http://localhost:8080/DentistOffice/ChangeDentistInfoServlet" method="post">
                <%
                Dentist d1;
                d1 = (Dentist)session.getAttribute("d1");
                d1.Display();
                %>
                <table>
                    <tr>
                        <td>ID:</td>  <td><input type="password" name="dentistID" value="<%=d1.getID()%>"></td>
                    </tr>
                    <tr>
                        <td>First Name:</td>  <td><input type="text" name="firstName" value="<%=d1.getFirstName()%>"></td>
                    </tr>
                    <tr>
                        <td>Last Name:</td>  <td><input type="text" name="lastName" value="<%=d1.getLastName()%>"></td>
                    </tr>
                    <tr>
                        <td>Email:</td>  <td><input type="text" name="email" value="<%=d1.getEmail()%>"></td>
                    </tr>
                    <tr>
                        <td>Office:</td>  <td><input type="text" name="office" value="<%=d1.getOffice()%>"></td>
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
