/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.fallamanises.operaciones;

/**
 *
 * @author Diana
 */

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.fallamanises.bean.ComisionBean;

import com.google.gson.Gson;
import net.fallamanises.dao.ComisionDao;
import net.fallamanises.helper.Conexion;

public class ComisionGet implements GenericOperation {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String data;         
        try {            
            if (request.getParameter("id") == null) {
                data = "{\"error\":\"id is mandatory\"}";
            } else {
                ComisionDao oComisionDAO = new ComisionDao(Conexion.getConection());
                ComisionBean oComision = new ComisionBean();
                oComision.setId(Integer.parseInt(request.getParameter("id")));
                oComisionDAO.get(oComision);
                data = new Gson().toJson(oComision);
            }
            return data;
        } catch (Exception e) {
            throw new ServletException("ComisionGetJson: View Error: " + e.getMessage());
        }
    }
}