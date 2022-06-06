<%-- 
    Document   : index
    Created on : Nov 8, 2021, 11:48:28 PM
    Author     : Sotonte Bob-manuel
    Java III Project
    I promise I wrote this code
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
            h1  {text-align: center;
                padding-top: 140px;}
            body {background-image: url("dentist2.jpg");
                height: auto;
                background-position: center;
                background-repeat: no-repeat;
                background-size: cover;
                font-family: Trebuchet MS,sans-serif;}
            .flex-container { text-decoration: none;
		display: flex;
                justify-content: center;}
            a:link { color: #00FFFF;
                    text-decoration: none;
                    display: block;
                    padding: 15px;}
            a:visited{color: #800080;}
            a:hover {color: #000000;}
        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dentist Office</title>
    </head>
    <body>
        <h1>Welcome to the Dentist Office!</h1>
        <div class="flex-container">
            <div>
                <a target="_blank" href="DentistLogin.jsp">Dentist Login</a>
            </div>
            <div>
                <a target="_blank" href="PatientLogin.jsp">Patient Login</a>
            </div>
        </div>
    </body>
</html>
