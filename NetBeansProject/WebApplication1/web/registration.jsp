<%-- 
    Document   : registration
    Created on : Nov 11, 2021, 3:23:30 PM
    Author     : MRIGANKA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String username = request.getParameter("username");
            out.println("Welcome user :- " + username);
            String email = request.getParameter("email");
            out.println("Your Email is :- " + email);
        %>
    </body>
</html>
