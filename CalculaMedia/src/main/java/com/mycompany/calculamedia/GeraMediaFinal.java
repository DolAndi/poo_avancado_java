/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.calculamedia;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author 1123180
 */
@WebServlet(name = "GeraMediaFinal", urlPatterns = {"/GeraMediaFinal"})
public class GeraMediaFinal extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet GeraMediaFinal</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet GeraMediaFinal at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        float notaG1 = Float.parseFloat(request.getParameter("notaG1").replace(",", "."));
        float notaG2 = Float.parseFloat(request.getParameter("notaG2").replace(",", "."));
        float media  = (notaG1 + notaG2) / 2;
        
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet GeraMediaFinal</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet GeraMediaFinal at " + request.getContextPath() + "</h1>");
            out.println("</body>");

            if (media < 3){
                out.println("<h2>Reprovado! D=</h2>");
            } else if (media < 7){
                out.println("<h2>Está de exame, boa sorte =l</h2>");
            } else if (media >= 7) {
                out.println("<h2>Aprovado, parabéns! =D</h2>");
            } else {
                out.println("Informações inválidas!");
            }
            out.println("<h3>");
            out.println("Sua média foi de: " + media);
            out.println("</h3>");
            out.println("<h6>Passo Fundo, RS</h6>");
        }
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
