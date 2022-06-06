<%-- 
    Sotonte Bob-manuel
    Lab 07
    I promise I wrote this code
--%>

<%@page import="Business.Customer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Accounts</title>
    </head>
    <body>
        <form>
            <%
                Customer c1;
                c1 = (Customer)session.getAttribute("c1");
                c1.Display();
                int count = c1.acctList.count;
                for(int i = 0; i < count; i++)
                {
                    int num = i + 1;
                    out.println("<!DOCTYPE html>");
                    out.println("<html>");
                    out.println("<head>");
                    out.println("<title>Servlet LoginServer</title>");            
                    out.println("</head>");
                    out.println("<body>");
                    out.println("<h1>Account" + num + " for Customer " + c1.getCustFirstName() + " " + c1.getCustLastName() + "</h1>");
                    out.println("<h2>AccountNo: " + c1.acctList.acc[i].getAcctNo() + "</h2>");
                    out.println("<h3>CustomerID: " + c1.acctList.acc[i].getCid() + "</h3>");
                    out.println("<h3>Type: " + c1.acctList.acc[i].getType() + "</h3>");
                    out.println("<h3>Balance: $" + c1.acctList.acc[i].getBalance() + "</h3>");
                    out.println("<h3>================</h3>");
                    out.println("</body>");
                    out.println("</html>");
                }
            %>
        </form>
    </body>
</html>
