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

import net.fallamanises.bean.HistorialBean;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.fallamanises.dao.HistorialDao;
import net.fallamanises.helper.Conexion;

public class HistorialGet implements GenericOperation {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String data;         
        try {            
            if (request.getParameter("id") == null) {
                data = "{\"error\":\"id is mandatory\"}";
            } else {
                HistorialDao oHistorialDAO = new HistorialDao(Conexion.getConection());
                HistorialBean oHistorial = new HistorialBean();
                oHistorial.setId(Integer.parseInt(request.getParameter("id")));
                oHistorialDAO.get(oHistorial);
                GsonBuilder gsonBuilder = new GsonBuilder();
                gsonBuilder.setDateFormat("dd/MM/yyyy");
                Gson gson = gsonBuilder.create();
                data = gson.toJson(oHistorial);     
            }
            return data;
        } catch (Exception e) {
            throw new ServletException("HistorialGetJson: View Error: " + e.getMessage());
        }
    }
}