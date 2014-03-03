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

import net.fallamanises.bean.CargoBean;

import com.google.gson.Gson;
import net.fallamanises.dao.CargoDao;
import net.fallamanises.helper.Conexion;

public class CargoGet implements GenericOperation {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String data;         
        try {            
            if (request.getParameter("id") == null) {
                data = "{\"error\":\"id is mandatory\"}";
            } else {
                CargoDao oCargoDAO = new CargoDao(Conexion.getConection());
                CargoBean oCargo = new CargoBean();
                oCargo.setId(Integer.parseInt(request.getParameter("id")));
                oCargoDAO.get(oCargo);
                data = new Gson().toJson(oCargo);
            }
            return data;
        } catch (Exception e) {
            throw new ServletException("CargoGetJson: View Error: " + e.getMessage());
        }
    }
}