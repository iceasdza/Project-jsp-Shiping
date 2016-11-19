/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Model.Login;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author int303
 */
public class LoginServlet2 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws java.sql.SQLException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        String message = null;
        if(userName != null && password != null){
            if(userName.length()>=3){
                List<Login> lo = Login.findEmail(userName);
                if(lo != null){
                    Login l = lo.get(0);
                    if (password.equals(l.getPassword())){
                        String user = l.getFisrtName()+" "+l.getLastName();
                        request.getSession().setAttribute("user",user);
                        getServletContext().getRequestDispatcher("/Main").forward(request, response);
                        return;
                    }else{
                    message = "Invalid Password!!";
                    request.setAttribute("mess",message);
                    getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
                }
            }else{
                message = "Invalid " + userName + " Dose not exist!!!";
                request.setAttribute("mess",message);
                getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
            }
        }else{
            message = "Invalid User Name!!";
            request.setAttribute("mess",message);
            getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
        }
        
    }else{
        getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(LoginServlet2.class.getName()).log(Level.SEVERE, null, ex);
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(LoginServlet2.class.getName()).log(Level.SEVERE, null, ex);
        }
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
