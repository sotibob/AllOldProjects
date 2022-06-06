<%-- 
    Document   : PatientLogin
    Created on : Nov 12, 2021, 5:17:48 PM
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
                margin-top: 0px;}
            body {background-color: #98CFD9;
                font-family: Trebuchet MS,sans-serif;}
            .center { text-decoration: none;
		display: block;
                text-align: left;
                background-color: #AFF7F4;
                padding: 20px;
                margin-left: 450px;
                margin-right: 450px;
                margin-top: 20px;
                border-radius: 20px;}
            a:link { color: #0000FF;}
            a:visited{color: #800080;}
            a:hover {color: #000000;}
            table {margin-left: 80px;}
            td  {padding: 5px;}
        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <script type="text/javascript">
            function validateLogin()
            {
                var ID;
                var Password;
                ID = document.DataForm.patientID.value;
                Password = document.DataForm.password.value;
                if(ID =="" || Password =="")
                {
                    alert("You must enter a valid Patient ID and Password!");
                }
            }
	</script>
    </head>
    <body>
        <div class="center">
            <form name="DataForm" action="http://localhost:8080/DentistOffice/PatientLoginServlet" method="post">
                <h1>Patient Login</h1><br>
                <table>
                    <tr>
                        <td>ID:</td>  <td><input type="text" name="patientID" onSubmit="validateLogin()" ></td>
                    </tr>
                    <tr>
                        <td>Password:</td>  <td><input type="text" name="password" onSubmit="validatLogin()" ></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Login"></td>
                        <td><input type="reset" value="Clear"></td>
                    </tr>
                </table>
            </form>
        </div>
    </body>
</html>
