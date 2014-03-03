/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.fallamanises.bean;

/**
 *
 * @author diana
 */
public class UsuarioBean {

    private Integer id = 0;
    private Integer id_censo = 0;
    private String login = "";
    private String password = "";
    private Integer permisos = 0;

    public UsuarioBean() {
    }

    public UsuarioBean(Integer id) {
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getPermisos() {
        return permisos;
    }

    public void setPermisos(Integer permisos) {
        this.permisos = permisos;
    }
    
    

}
