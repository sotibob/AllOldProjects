<%-- 
    Sotonte Bob-manuel
    Lab 05
    I promise I wrote this code
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
            h1  {text-align: center;
                margin-top: 0px;}
            body {background-color: #eaeaea;}
            .center { text-decoration: none;
		display: block;
                text-align: center;
                background-color: #FFFFFF;
                padding: 20px;
                margin-left: 450px;
                margin-right: 450px;
                margin-top: 20px;}
            a:link { color: #0000FF;}
            a:visited{color: #800080;}
            a:hover {color: #000000;}
            table {margin-left: 80px;}
        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <script type="text/javascript">
            function validateLogin()
            {
                var ID;
                var Password;
                ID = document.DataForm.customerID.value;
                Password = document.DataForm.password.value;
                if(ID =="" || Password =="")
                {
                    alert("You must enter a valid Customer ID and Password!");
                }
                if(isNaN(ID))
                {
                    alert("Customer ID must be a Number!");
                    document.DataForm.customerID.value="";
                    document.DataForm.customerID.focus();
                    document.DataForm.password.value="";
                    document.DataForm.password.focus();
                }
                if(!(ID > 2999 && ID < 4000))
                {
                    alert("Customer ID must be numbers between 3000 and 3999!");
                    document.DataForm.customerID.value="";
                    document.DataForm.customerID.focus();
                    document.DataForm.password.value="";
                    document.DataForm.password.focus();
                }
            }
	</script>
    </head>
    <body>
        <div class="center">
            <form name="DataForm" action="http://localhost:8080/ChattBank/LoginServlet" method="post">
                <h1>Login</h1><br>
                <table>
                    <tr>
                        <td>Customer ID:</td>  <td><input type="text" name="customerID" onSubmit="validateLogin()" ></td>
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
