<%@page import="java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello from HTML</h1>
	<%= "<h1>Hello from JSP</h1>" %>
	<% int x = 10; %>
	<input type="text" value="<%= x %>"><br>
	<%
		for(int i = 0; i < 5; i++) {
			out.print("i = " + i + "<br>");
		}
	%>
	The current date is <%= new Date() %>
	<%--JSP implicit Objects
		out - JspWriter
		application - ServletContext
		config - ServletConfig
		page - Object
		pageContext - PageContext
		Exception - Throwable
		request - HttpServletRequest
		response - HttpServletResponse
	 --%>	 
	 <form action="">
	 	Enter Name: <input type="text" name="fname">
	 	<input type="submit" name="click" value="Click me">
	 </form>
	 <%
	 	if(request.getParameter("click") != null) {
	 		out.print("Hello " + request.getParameter("fname"));
	 	}
	 %>
	<%@include file="footer.html" %>
	
</body>
</html>