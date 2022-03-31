<%-- 
    Sotonte Bob-manuel
    Lab 06
    I promise I wrote this code
--%>

<%@page import="Business.Customer"%>
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
            Customer c1;
            c1 = (Customer)session.getAttribute("c1");
            
            int cid = c1.getCustID();
            out.println("Error Logging in for user with ID: " + cid);
        %>
        </h1>
    </body>
</html>
