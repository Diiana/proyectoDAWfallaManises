/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.fallamanises.dao;

import net.fallamanises.bean.CensoBean;
import net.fallamanises.helper.Conexion;

/**
 *
 * @author al037684
 */
public class CensoDao extends GenericDaoImplementation<CensoBean> {
    
    public CensoDao(Conexion.Tipo_conexion tipoConexion) throws Exception {
        super(tipoConexion,"censo");
    }
    
}
