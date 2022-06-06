<%-- 
    Document   : PatientError
    Created on : Nov 12, 2021, 8:23:17 PM
    Author     : Sotonte Bob-manuel
    Java III Project
    I promise I wrote this code
--%>

<%@page import="Business.Patient"%>
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
            Patient p1;
            p1 = (Patient)session.getAttribute("p1");
            
            String pid = p1.getID();
            out.println("Error Logging in for Patient with ID: " + pid);
            %>
        </h1>
    </body>
</html>
