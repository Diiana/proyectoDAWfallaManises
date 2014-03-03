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
import net.fallamanises.bean.RecompensaBean;
import net.fallamanises.dao.RecompensaDao;

/**
 *
 * @author Diana
 */
public class RecompensaRemove implements GenericOperation {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

        try {
            RecompensaDao oRecompensaDAO = new RecompensaDao(Conexion.getConection());
            RecompensaBean oRecompensa = new RecompensaBean();                                           
            oRecompensa.setId(Integer.parseInt(request.getParameter("id")));            
            Map<String, String> data = new HashMap<>();
            if (oRecompensa != null) {
                oRecompensaDAO.remove(oRecompensa);
                data.put("status", "200");
                data.put("message", "se ha eliminado el registro con id=" + oRecompensa.getId());
            } else {
                data.put("status", "error");
                data.put("message", "error");
            }
            Gson gson = new Gson();
            String resultado = gson.toJson(data);
            return resultado;        
        } catch (Exception e) {
            throw new ServletException("RecompensaRemoveJson: View Error: " + e.getMessage());
        }
    }
}
