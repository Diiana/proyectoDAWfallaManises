/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.fallamanises.bean;

/**
 *
 * @author Diana
 */
public class HistorialBean {
    
    private Integer id = 0;
    private Integer id_censo = 0;
    private String ejercicio = "";
    private Integer id_cargo = 0;
    private Integer id_recompensa = 0;
    private String falla = "";
    
    
    public HistorialBean() {
    }
    public HistorialBean(Integer id) {
        this.id = id;
    }

    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId_censo() {
        return id_censo;
    }

    public void setId_censo(Integer id_censo) {
        this.id_censo = id_censo;
    }

    public String getEjercicio() {
        return ejercicio;
    }

    public void setEjercicio(String ejercicio) {
        this.ejercicio = ejercicio;
    }

    public Integer getId_cargo() {
        return id_cargo;
    }

    public void setId_cargo(Integer id_cargo) {
        this.id_cargo = id_cargo;
    }

    public Integer getId_recompensa() {
        return id_recompensa;
    }

    public void setId_recompensa(Integer id_recompensa) {
        this.id_recompensa = id_recompensa;
    }

    public String getFalla() {
        return falla;
    }

    public void setFalla(String falla) {
        this.falla = falla;
    }
    
    
    
}
