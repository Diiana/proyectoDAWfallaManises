/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.fallamanises.dao;
import net.fallamanises.bean.RecompensaBean;
import net.fallamanises.helper.Conexion;

/**
 *
 * @author al037684
 */
public class RecompensaDao extends GenericDaoImplementation<RecompensaBean>{
    
    public RecompensaDao(Conexion.Tipo_conexion tipoConexion) throws Exception {
        super(tipoConexion,"recompensa");
    }
    
}
