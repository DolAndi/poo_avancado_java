<%-- 
    Document   : megasena
    Created on : Aug 10, 2022, 8:19:23 PM
    Author     : ricardo
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
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
                calendar.setTime(new Date());

                int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY);
                if (hourOfDay < 12) {
                    out.println("Bom dia!");
                } else if (hourOfDay < 18) {
                    out.println("Boa tarde!");
                } else {
                    out.println("Boa noite!");
                }
            %>
        </h1>
        <%
            //DICA: vc quer se tornar um dev sênior? Estude o pacote collections
            String numero1 = request.getParameter("numero1");
            String numero2 = request.getParameter("numero2");
            String numero3 = request.getParameter("numero3");

            ArrayList sorteados = new ArrayList();
            sorteados.add(Integer.parseInt(numero1));
            sorteados.add(Integer.parseInt(numero2));
            sorteados.add(Integer.parseInt(numero3));

            int contaAcertos = 0;
            Random random = new Random();
            for (int i = 1; i <= 6; i++) {
                int sorteado = random.nextInt(20) + 1;
                if (sorteados.contains(sorteado)) {
                    contaAcertos++;
                }
                out.println("Número " + i + ": " + sorteado + "<br>");
            }
            out.println("Acertos: " + contaAcertos);

            if (contaAcertos > 1) {
                response.sendRedirect("https://www.binance.com/pt-BR");
            }

//para teste chamar a URL com os parâmetros
//http://localhost:8080/HelloWorldJavaWeb/megasena.jsp?numero1=2&numero2=10&numero3=8

        %>
    </body>
</html>
