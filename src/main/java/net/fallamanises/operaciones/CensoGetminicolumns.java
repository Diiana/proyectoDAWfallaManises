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
public class CensoGetminicolumns implements GenericOperation {
  
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        try { 
            String data = "{\"data\": [  \"apellido1\", \"apellido2\", \"nombre\", \"domicilio\", \"patio\", \"puerta\", \"localidad\", \"codpostal\", \"dni\", \"nacimiento\", \"edad\"]}";
            return data;
        } catch (Exception e) {
            throw new ServletException("CensoGetpagesJson: View Error: " + e.getMessage());
        }
    }
    
}
