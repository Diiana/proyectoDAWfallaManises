/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.fallamanises.bean;

/**
 *
 * @author al037684
 */
public class ComisionBean {
    
    private Integer id = 0;
    private String comision = "";
    
    
    public ComisionBean() {
    }

    public ComisionBean(Integer id) {
        this.id = id;
    }

    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getComision() {
        return comision;
    }

    public void setComision(String comision) {
        this.comision = comision;
    }
    
    
    
}
