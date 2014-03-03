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
import net.fallamanises.bean.RecompensaBean;
import net.fallamanises.dao.RecompensaDao;

/**
 *
 * @author Diana
 */
public class RecompensaSave implements GenericOperation {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

        try {
            RecompensaDao oRecompensaDAO = new RecompensaDao(Conexion.getConection());
            RecompensaBean oRecompensa = new RecompensaBean();
            Gson gson = new Gson();
            String jason = request.getParameter("json");
            jason = EncodingUtil.decodeURIComponent(jason);
            oRecompensa = gson.fromJson(jason, oRecompensa.getClass());
            Map<String, String> data = new HashMap<>();
            if (oRecompensa != null) {
                oRecompensa = oRecompensaDAO.set(oRecompensa);
                data.put("status", "200");
                data.put("message", Integer.toString(oRecompensa.getId()));
            } else {
                data.put("status", "error");
                data.put("message", "error");
            }
            String resultado = gson.toJson(data);
            return resultado;
        } catch (Exception e) {
            throw new ServletException("RecompensaSaveJson: View Error: " + e.getMessage());
        }
    }
}
