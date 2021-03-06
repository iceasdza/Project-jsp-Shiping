/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Model.Captains;
import com.sun.xml.internal.fastinfoset.EncodingConstants;
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
public class addCaptainsServlet extends HttpServlet {

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
       
            String fname = request.getParameter("fname");
            String lname  = request.getParameter("lname");
            String level  = request.getParameter("level");
            String email  = request.getParameter("email");
            String tel  = request.getParameter("tel");
            String addr  = request.getParameter("addr");
            String expen  = request.getParameter("expen");
            int lv = Integer.parseInt(level);
            int expe = Integer.parseInt(expen);
            
            boolean cs = Captains.checkEmail(email);
            if(cs==false){
                request.setAttribute("repaeat", "this eamil has been use");
                 getServletContext().getRequestDispatcher("/AddInfo.jsp").forward(request, response);
                 return; 
            }
            if (lname != null && fname != null && addr != null && level != null && email != null && tel != null && expen != null) {
                
            Captains c = new Captains();
            c.addInfo(fname, lname, lv, email, tel, addr, expe);
            request.setAttribute("success", "Add captain success !!!");
             getServletContext().getRequestDispatcher("/AddInfo.jsp").forward(request, response);
        }else{
                request.setAttribute("msg","Fail to add Captain !!!");
                 getServletContext().getRequestDispatcher("/AddInfo.jsp").forward(request, response);
                 return; 
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
