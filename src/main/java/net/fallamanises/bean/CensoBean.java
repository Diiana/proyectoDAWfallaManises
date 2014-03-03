/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.fallamanises.bean;

import java.util.Date;

/**
 *
 * @author al037684
 */
public class CensoBean {

    private Integer id = 0;
    private Integer id_comision = 0;
    private String apellido1 = "";
    private String apellido2 = "";
    private String nombre = "";
    private String domicilio = "";
    private String patio = "";
    private String puerta = "";
    private String localidad = "";
    private String codpostal = "";
    private String dni = "";
    private Date nacimiento = new Date();
    private Date alta = new Date();   
    private Integer telefono = 0;
    private Integer id_recompensa = 0;
    private Integer añoConcesion = 0;
    private Integer edad = 0;

    
    
    
    public CensoBean() {
    }

    public CensoBean(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId_comision() {
        return id_comision;
    }

    public void setId_comision(Integer id_comision) {
        this.id_comision = id_comision;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getPatio() {
        return patio;
    }

    public void setPatio(String patio) {
        this.patio = patio;
    }

    public String getPuerta() {
        return puerta;
    }

    public void setPuerta(String puerta) {
        this.puerta = puerta;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getCodpostal() {
        return codpostal;
    }

    public void setCodpostal(String codpostal) {
        this.codpostal = codpostal;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public Date getAlta() {
        return alta;
    }

    public void setAlta(Date alta) {
        this.alta = alta;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public Integer getId_recompensa() {
        return id_recompensa;
    }

    public void setId_recompensa(Integer id_recompensa) {
        this.id_recompensa = id_recompensa;
    }

    public Integer getAñoConcesion() {
        return añoConcesion;
    }

    public void setAñoConcesion(Integer añoConcesion) {
        this.añoConcesion = añoConcesion;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    
}
