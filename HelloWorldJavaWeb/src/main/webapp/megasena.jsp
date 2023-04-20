<%-- 
    Document   : megasena
    Created on : 10/08/2022, 20:31:54
    Author     : 1123180
--%>
<%@page import="java.util.Date"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.util.Random"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>
            <%
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(new Date());;
                int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY);
                if (hourOfDay < 12){
                    out.println("Bom dia!");
                } else if (hourOfDay < 18) {
                    out.println("Boa tarde!");
                } else {
                    out.println("Boa noite!");
                }
            %>
        </h1>
        <%
            Random random = new Random();
            for (int i = 1; i < 7; i++){
                out.println("Número" + i + ": "
                    + (random.nextInt(60) + 1) + "<br>");
            }
        %>
    </body>
</html>
