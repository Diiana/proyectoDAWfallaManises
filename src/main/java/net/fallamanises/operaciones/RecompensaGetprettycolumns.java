/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.fallamanises.operaciones;

import java.io.UnsupportedEncodingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.fallamanises.data.MysqlData;

/**
 *
 * @author Diana
 */
public class RecompensaGetprettycolumns implements GenericOperation {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        try {
            String data = "{\"data\": [\"id\", \"Recompensa\"]}";
            return data;
        } catch (Exception e) {
            throw new ServletException("RecompensaGetpagesJson: View Error: " + e.getMessage());
        }
    }
}
