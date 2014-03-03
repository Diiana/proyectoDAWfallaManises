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
import net.fallamanises.bean.CensoBean;
import net.fallamanises.dao.CensoDao;

/**
 *
 * @author Diana
 */
public class CensoSave implements GenericOperation {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

        try {
            CensoDao oCensoDAO = new CensoDao(Conexion.getConection());
            CensoBean oCenso = new CensoBean();
            Gson gson = new Gson();
            String jason = request.getParameter("json");
            jason = EncodingUtil.decodeURIComponent(jason);
            oCenso = gson.fromJson(jason, oCenso.getClass());
            Map<String, String> data = new HashMap<>();
            if (oCenso != null) {
                oCenso = oCensoDAO.set(oCenso);
                data.put("status", "200");
                data.put("message", Integer.toString(oCenso.getId()));
            } else {
                data.put("status", "error");
                data.put("message", "error");
            }
            String resultado = gson.toJson(data);
            return resultado;
        } catch (Exception e) {
            throw new ServletException("CensoSaveJson: View Error: " + e.getMessage());
        }
    }
}
