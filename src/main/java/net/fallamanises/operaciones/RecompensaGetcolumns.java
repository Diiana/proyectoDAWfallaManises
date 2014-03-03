/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.fallamanises.operaciones;

import com.google.gson.Gson;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.fallamanises.dao.RecompensaDao;

import net.fallamanises.helper.Conexion;

/**
 *
 * @author Diana
 */
public class RecompensaGetcolumns implements GenericOperation {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ArrayList<String> alColumns = null;
        try {
            RecompensaDao oRecompensaDAO = new RecompensaDao(Conexion.getConection());
            alColumns = oRecompensaDAO.getColumnsNames();
            String data = new Gson().toJson(alColumns);
            data = "{\"data\":" + data + "}";
            return data;
        } catch (Exception e) {
            throw new ServletException("RecompensaGetcolumnsJson: View Error: " + e.getMessage());
        }
    }

}
