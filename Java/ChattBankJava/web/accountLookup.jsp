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
        <title>Account Look-up</title>
    </head>
    <body>
        <div class="center">
            <form name="DataForm" action="http://localhost:8080/ChattBank/AccountLookupServlet" method="post">
                <h1>Account Lookup</h1><br>
                <table>
                    <tr>
                        <td>AcctNo:</td>  <td><input type="text" name="acctNo"></td>
                    </tr>
                    <tr>
                        <td>CustomerID:</td>  <td><input type="text" name="customerID"></td>
                    </tr>
                    <tr>
                        <td>Type:</td>  <td><input type="text" name="type"></td>
                    </tr>
                    <tr>
                        <td>Balance:</td>  <td><input type="text" name="balance"></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Lookup"></td>
                        <td><input type="reset" value="Clear"></td>
                    </tr>
                </table>
            </form>
        </div>
    </body>
</html>
