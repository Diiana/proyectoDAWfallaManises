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

import net.fallamanises.bean.CensoBean;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.fallamanises.dao.CensoDao;
import net.fallamanises.helper.Conexion;

public class CensoGet implements GenericOperation {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String data;         
        try {            
            if (request.getParameter("id") == null) {
                data = "{\"error\":\"id is mandatory\"}";
            } else {
                CensoDao oCensoDAO = new CensoDao(Conexion.getConection());
                CensoBean oCenso = new CensoBean();
                oCenso.setId(Integer.parseInt(request.getParameter("id")));
                oCensoDAO.get(oCenso);
                GsonBuilder gsonBuilder = new GsonBuilder();
                gsonBuilder.setDateFormat("dd/MM/yyyy");
                Gson gson = gsonBuilder.create();
                data = gson.toJson(oCenso);     
            }
            return data;
        } catch (Exception e) {
            throw new ServletException("CensoGetJson: View Error: " + e.getMessage());
        }
    }
}