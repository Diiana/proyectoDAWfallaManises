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
import net.fallamanises.helper.EncodingUtil;
import net.fallamanises.bean.HistorialBean;
import net.fallamanises.dao.HistorialDao;

/**
 *
 * @author Diana
 */
public class HistorialSave implements GenericOperation {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

        try {
            HistorialDao oHistorialDAO = new HistorialDao(Conexion.getConection());
            HistorialBean oHistorial = new HistorialBean();
            Gson gson = new Gson();
            String jason = request.getParameter("json");
            jason = EncodingUtil.decodeURIComponent(jason);
            oHistorial = gson.fromJson(jason, oHistorial.getClass());
            Map<String, String> data = new HashMap<>();
            if (oHistorial != null) {
                oHistorial = oHistorialDAO.set(oHistorial);
                data.put("status", "200");
                data.put("message", Integer.toString(oHistorial.getId()));
            } else {
                data.put("status", "error");
                data.put("message", "error");
            }
            String resultado = gson.toJson(data);
            return resultado;
        } catch (Exception e) {
            throw new ServletException("HistorialSaveJson: View Error: " + e.getMessage());
        }
    }
}
