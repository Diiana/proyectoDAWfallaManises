/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.fallamanises.operaciones;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author Diana
 */
public class HistorialGetminiprettycolumns implements GenericOperation {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        try { 
            String data = "{\"data\": [  \"id_censo\", \"Ejercicio\", \"Cargo\", \"Recompensa\", \"Falla\"]}";
            return data;
        } catch (Exception e) {
            throw new ServletException("HistorialGetpagesJson: View Error: " + e.getMessage());
        }
    }
}
