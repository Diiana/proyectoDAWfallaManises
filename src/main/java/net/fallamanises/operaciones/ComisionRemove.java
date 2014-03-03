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
import net.fallamanises.bean.ComisionBean;
import net.fallamanises.dao.ComisionDao;

/**
 *
 * @author Diana
 */
public class ComisionRemove implements GenericOperation {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

        try {
            ComisionDao oComisionDAO = new ComisionDao(Conexion.getConection());
            ComisionBean oComision = new ComisionBean();                                           
            oComision.setId(Integer.parseInt(request.getParameter("id")));            
            Map<String, String> data = new HashMap<>();
            if (oComision != null) {
                oComisionDAO.remove(oComision);
                data.put("status", "200");
                data.put("message", "se ha eliminado el registro con id=" + oComision.getId());
            } else {
                data.put("status", "error");
                data.put("message", "error");
            }
            Gson gson = new Gson();
            String resultado = gson.toJson(data);
            return resultado;        
        } catch (Exception e) {
            throw new ServletException("ComisionRemoveJson: View Error: " + e.getMessage());
        }
    }
}
