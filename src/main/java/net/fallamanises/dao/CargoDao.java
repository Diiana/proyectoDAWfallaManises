/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.fallamanises.dao;

import net.fallamanises.bean.CargoBean;
import net.fallamanises.helper.Conexion;

/**
 *
 * @author Diana
 */
public class CargoDao extends GenericDaoImplementation<CargoBean> {
    
    public CargoDao(Conexion.Tipo_conexion tipoConexion) throws Exception {
        super(tipoConexion,"cargo");
    }
    
    
}
