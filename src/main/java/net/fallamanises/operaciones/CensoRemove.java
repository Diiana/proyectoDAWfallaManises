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
import net.fallamanises.bean.CensoBean;
import net.fallamanises.dao.CensoDao;

/**
 *
 * @author Diana
 */
public class CensoRemove implements GenericOperation {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

        try {
            CensoDao oCensoDAO = new CensoDao(Conexion.getConection());
            CensoBean oCenso = new CensoBean();                                           
            oCenso.setId(Integer.parseInt(request.getParameter("id")));            
            Map<String, String> data = new HashMap<>();
            if (oCenso != null) {
                oCensoDAO.remove(oCenso);
                data.put("status", "200");
                data.put("message", "se ha eliminado el registro con id=" + oCenso.getId());
            } else {
                data.put("status", "error");
                data.put("message", "error");
            }
            Gson gson = new Gson();
            String resultado = gson.toJson(data);
            return resultado;        
        } catch (Exception e) {
            throw new ServletException("CensoRemoveJson: View Error: " + e.getMessage());
        }
    }
}
