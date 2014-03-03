/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.fallamanises.bean;

/**
 *
 * @author al037684
 */
public class RecompensaBean {

    private Integer id = 0;
    private String recompensa = "";

    
   
    public RecompensaBean() {
    }

    public RecompensaBean(Integer id) {
        this.id = id;
    }

    
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRecompensa() {
        return recompensa;
    }

    public void setRecompensa(String recompensa) {
        this.recompensa = recompensa;
    }
  
}
