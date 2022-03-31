<%-- 
    Document   : DentistError
    Created on : Nov 12, 2021, 8:22:43 PM
    Author     : Sotonte Bob-manuel
    Java III Project
    I promise I wrote this code
--%>

<%@page import="Business.Dentist"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Invalid Login!</title>
    </head>
    <body>
        <h1>
            <%
            Dentist d1;
            d1 = (Dentist)session.getAttribute("d1");
            
            String did = d1.getID();
            out.println("Error Logging in for Dentist with ID: " + did);
            %>
        </h1>
    </body>
</html>
