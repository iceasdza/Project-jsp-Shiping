/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Model.Captains;
import Model.Ships;
import Model.travel;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author patiz
 */
public class addTravelServlet extends HttpServlet {

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
        String status = request.getParameter("status");
//        String start = request.getParameter("stime");
//        String finish = request.getParameter("stime");
        String start = "Fixing";
        String finish = "Fixing";
        String cap = request.getParameter("cap");
        String ship = request.getParameter("ship");
        String from = request.getParameter("from");
        String to = request.getParameter("To");
        
        
            String fname = cap.substring(0,cap.indexOf(" "));
            String lname = cap.substring(cap.indexOf(" ")+1);
            
            System.out.println(fname+" "+lname);
            
            Captains cc = Captains.findIdByName(fname,lname);
            int capid = cc.getId();
            Ships ss = Ships.findIdByName(ship);
            
                if(status !=null && cap != null && ship!=null && from != null && to != null && start !=null && finish !=null){
                request.setAttribute("custin", from);
                request.setAttribute("custout", to);
                
                travel t = new travel();
                t.addtravel(status, start, finish, capid, ss.getShipsId(), from, to);
                
            getServletContext().getRequestDispatcher("/addShipping.jsp").forward(request, response);
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
        processRequest(request, response);
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
