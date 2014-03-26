package Servlet;

import Core.Web;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Holger Szuesz <hszuesz@live.com>
 */
public class Get extends Web 
{
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param objRequest servlet request
     * @param objResponse servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest objRequest, HttpServletResponse objResponse) throws ServletException, IOException {
        this.processRequest(objRequest, objResponse);
    }    

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Get servlet";
    }
}
