/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.fallamanises.operaciones;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author al037684
 */
public class HistorialGetminicolumns implements GenericOperation {
  
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        try { 
            String data = "{\"data\": [ \"id_censo\", \"ejercicio\", \"id_cargo\", \"id_recompensa\", \"falla\"]}";
            return data;
        } catch (Exception e) {
            throw new ServletException("HistorialGetpagesJson: View Error: " + e.getMessage());
        }
    }
    
}
