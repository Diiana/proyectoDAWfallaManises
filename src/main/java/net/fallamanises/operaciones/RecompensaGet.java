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

import net.fallamanises.bean.RecompensaBean;

import com.google.gson.Gson;
import net.fallamanises.dao.RecompensaDao;
import net.fallamanises.helper.Conexion;

public class RecompensaGet implements GenericOperation {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String data;         
        try {            
            if (request.getParameter("id") == null) {
                data = "{\"error\":\"id is mandatory\"}";
            } else {
                RecompensaDao oRecompensaDAO = new RecompensaDao(Conexion.getConection());
                RecompensaBean oRecompensa = new RecompensaBean();
                oRecompensa.setId(Integer.parseInt(request.getParameter("id")));
                oRecompensaDAO.get(oRecompensa);
                data = new Gson().toJson(oRecompensa);
            }
            return data;
        } catch (Exception e) {
            throw new ServletException("RecompensaGetJson: View Error: " + e.getMessage());
        }
    }
}