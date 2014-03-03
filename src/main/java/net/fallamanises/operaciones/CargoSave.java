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
import net.fallamanises.bean.CargoBean;
import net.fallamanises.dao.CargoDao;

/**
 *
 * @author Diana
 */
public class CargoSave implements GenericOperation {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

        try {
            CargoDao oCargoDAO = new CargoDao(Conexion.getConection());
            CargoBean oCargo = new CargoBean();
            Gson gson = new Gson();
            String jason = request.getParameter("json");
            jason = EncodingUtil.decodeURIComponent(jason);
            oCargo = gson.fromJson(jason, oCargo.getClass());
            Map<String, String> data = new HashMap<>();
            if (oCargo != null) {
                oCargo = oCargoDAO.set(oCargo);
                data.put("status", "200");
                data.put("message", Integer.toString(oCargo.getId()));
            } else {
                data.put("status", "error");
                data.put("message", "error");
            }
            String resultado = gson.toJson(data);
            return resultado;
        } catch (Exception e) {
            throw new ServletException("CargoSaveJson: View Error: " + e.getMessage());
        }
    }
}
