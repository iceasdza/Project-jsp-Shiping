/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Model.Country;
import Model.CustomersCompany;
import Model.Shipping;
import Model.Staff;
import Model.travel;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author patiz
 */
public class addShippingServlet extends HttpServlet {

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
        String custin = request.getParameter("in");
          String custout = request.getParameter("out");
             String s = request.getParameter("staff");
             
              String staff = s.substring(0,s.indexOf(" "));
              
                Staff staff2 = Staff.findByName2(staff);
                int staffid = staff2.getId();
                Shipping sp  = new Shipping();
                
                int t  = travel.currentTravelNo();
                int c1 ;
                int c2 ;
                CustomersCompany c = CustomersCompany.findIdByName(custin);
                c1=c.getIdCompany();
                c = CustomersCompany.findIdByName(custout);
                c2=c.getIdCompany();
              if(custin != null && custout != null && s !=null){
                sp.addShipping(t, c1, c2, staffid);
                request.setAttribute("success", "Added shipping");
                     
                }else{
                  request.setAttribute("msg","fail to add Shipping !");
              }
              getServletContext().getRequestDispatcher("/addShipping.jsp").forward(request, response);
             
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
