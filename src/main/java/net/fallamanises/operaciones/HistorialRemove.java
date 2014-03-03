/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.fallamanises.operaciones;

import com.google.gson.Gson;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.fallamanises.helper.Conexion;
import net.fallamanises.bean.HistorialBean;
import net.fallamanises.dao.HistorialDao;

/**
 *
 * @author Diana
 */
public class HistorialRemove implements GenericOperation {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

        try {
            HistorialDao oHistorialDAO = new HistorialDao(Conexion.getConection());
            HistorialBean oHistorial = new HistorialBean();                                           
            oHistorial.setId(Integer.parseInt(request.getParameter("id")));            
            Map<String, String> data = new HashMap<>();
            if (oHistorial != null) {
                oHistorialDAO.remove(oHistorial);
                data.put("status", "200");
                data.put("message", "se ha eliminado el registro con id=" + oHistorial.getId());
            } else {
                data.put("status", "error");
                data.put("message", "error");
            }
            Gson gson = new Gson();
            String resultado = gson.toJson(data);
            return resultado;        
        } catch (Exception e) {
            throw new ServletException("HistorialRemoveJson: View Error: " + e.getMessage());
        }
    }
}
