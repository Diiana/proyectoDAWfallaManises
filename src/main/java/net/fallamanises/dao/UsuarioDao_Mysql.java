/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.fallamanises.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import net.fallamanises.bean.CensoBean;
import net.fallamanises.data.MysqlData;
import net.fallamanises.helper.Conexion;
import net.fallamanises.helper.FilterBean;
import net.fallamanises.bean.UsuarioBean;

public class UsuarioDao_Mysql implements UsuarioDao {

    private final MysqlData oMysql;
    private final Conexion.Tipo_conexion enumTipoConexion;

    public UsuarioDao_Mysql(Conexion.Tipo_conexion tipoConexion) throws Exception {
        oMysql = new MysqlData();
        enumTipoConexion = tipoConexion;
    }

    @Override
    public int getPages(int intRegsPerPag, ArrayList<FilterBean> hmFilter, HashMap<String, String> hmOrder) throws Exception {
        int pages;
        try {
            oMysql.conexion(enumTipoConexion);
            pages = oMysql.getPages("usuario", intRegsPerPag, hmFilter, hmOrder);
            oMysql.desconexion();
            return pages;
        } catch (Exception e) {
            throw new Exception("UsuarioDao.getPages: Error: " + e.getMessage());
        }
    }

    @Override
    public int getCount(ArrayList<FilterBean> hmFilter) throws Exception {
        int pages;
        try {
            oMysql.conexion(enumTipoConexion);
            pages = oMysql.getCount("usuario", hmFilter);
            oMysql.desconexion();
            return pages;
        } catch (Exception e) {
            throw new Exception("UsuarioDao.getCount: Error: " + e.getMessage());
        }
    }

    @Override
    public ArrayList<UsuarioBean> getPage(int intRegsPerPag, int intPage, ArrayList<FilterBean> hmFilter, HashMap<String, String> hmOrder) throws Exception {
        ArrayList<Integer> arrId;
        ArrayList<UsuarioBean> arrUsuario = new ArrayList<>();
        try {
            oMysql.conexion(enumTipoConexion);
            arrId = oMysql.getPage("usuario", intRegsPerPag, intPage, hmFilter, hmOrder);
            Iterator<Integer> iterador = arrId.listIterator();
            while (iterador.hasNext()) {
                UsuarioBean oUsuarioBean = new UsuarioBean(iterador.next());
                arrUsuario.add(this.get(oUsuarioBean));
            }
            oMysql.desconexion();
            return arrUsuario;
        } catch (Exception e) {
            throw new Exception("UsuarioDao.getPage: Error: " + e.getMessage());
        }
    }

    @Override
    public UsuarioBean get(UsuarioBean oUsuarioBean) throws Exception {
        if (oUsuarioBean.getId() > 0) {
            try {
                oMysql.conexion(enumTipoConexion);
                if (!oMysql.existsOne("usuario", oUsuarioBean.getId())) {
                    oUsuarioBean.setId(0);
                } else {
                    oUsuarioBean.setLogin(oMysql.getOne("usuario", "login", oUsuarioBean.getId()));
                    oUsuarioBean.setPassword(oMysql.getOne("usuario", "password", oUsuarioBean.getId()));
                }
            } catch (Exception e) {
                throw new Exception("UsuarioDao.getUsuario: Error: " + e.getMessage());
            } finally {
                oMysql.desconexion();
            }
        } else {
            oUsuarioBean.setId(0);
        }
        return oUsuarioBean;
    }

    @Override
    public UsuarioBean set(UsuarioBean oUsuarioBean) throws Exception {
        try {
            oMysql.conexion(enumTipoConexion);
            oMysql.initTrans();
            if (oUsuarioBean.getId() == 0) {
                oUsuarioBean.setId(oMysql.insertOne("usuario"));
            }
            oMysql.updateOne(oUsuarioBean.getId(), "usuario", "login", oUsuarioBean.getLogin());
            oMysql.updateOne(oUsuarioBean.getId(), "usuario", "password", oUsuarioBean.getPassword());
            oMysql.updateOne(oUsuarioBean.getId(), "usuario", "id_censo", Integer.toString(oUsuarioBean.getId_censo()));
            oMysql.updateOne(oUsuarioBean.getId(), "usuario", "permisos", Integer.toString(oUsuarioBean.getPermisos()));
            oMysql.commitTrans();
        } catch (Exception e) {
            oMysql.rollbackTrans();
            throw new Exception("UsuarioDao.setUsuario: Error: " + e.getMessage());
        } finally {
            oMysql.desconexion();
        }
        return oUsuarioBean;
    }

    @Override
    public void remove(UsuarioBean oUsuarioBean) throws Exception {
        try {
            oMysql.conexion(enumTipoConexion);
            oMysql.removeOne(oUsuarioBean.getId(), "usuario");
            oMysql.desconexion();
        } catch (Exception e) {
            throw new Exception("UsuarioDao.removeUsuario: Error: " + e.getMessage());
        } finally {
            oMysql.desconexion();
        }
    }

    public UsuarioBean getFromLogin(UsuarioBean oUsuario) throws Exception {
        try {
            oMysql.conexion(enumTipoConexion);
            String strId = oMysql.getId("usuario", "login", oUsuario.getLogin());
            if (strId == null) {
                oUsuario.setId(0);
            } else {
                oUsuario.setId(Integer.parseInt(strId));
                oUsuario.setPassword(oMysql.getOne("usuario", "password", oUsuario.getId()));
            }
            oMysql.desconexion();
            return oUsuario;
        } catch (Exception e) {
            throw new Exception("UsuarioDao.getFromLogin: Error: " + e.getMessage());
        }
    }

    public UsuarioBean getFromRegister(CensoBean oCenso, UsuarioBean oUsuario) throws Exception {
        try {
            oMysql.conexion(enumTipoConexion);
            //comprueba qe el dni existe en la tabla censo
            String strId = oMysql.getId("censo", "dni", oCenso.getDni());
            //si no existe te retorna un error
            if (strId == null) {
                oUsuario.setId(0);
                oMysql.desconexion();
                return oUsuario;
            } else {
                //si el dni existe se va a mirar si el usuario ya existe
                oCenso.setId(Integer.parseInt(strId));
                String censo = oMysql.findOne("usuario", "id_censo", oCenso.getId());
                System.out.println(censo);
                if (censo == null) {
                    String strId2 = oMysql.getId("usuario", "login", oUsuario.getLogin());
                    //comprueba qe el usuario no existe en la tabla usuario
                    if (strId2 != null) {
                        oUsuario.setId(0);
                        oMysql.desconexion();
                        return oUsuario;
                    } else {
                        oUsuario.setId(0);
                        oUsuario.setId_censo(oCenso.getId());
                        oUsuario.setPermisos(0);
                        oUsuario = set(oUsuario);
                        oMysql.desconexion();
                        return oUsuario;
                    }
                } else {
                    oUsuario.setId(0);
                    oMysql.desconexion();
                    return oUsuario;

                }
            }
        } catch (Exception e) {
            throw new Exception("UsuarioDao.getFromRegister: Error: " + e.getMessage());
        } finally {
            oMysql.desconexion();
        }
    }

    @Override
    public ArrayList<String> getColumnsNames() throws Exception {
        ArrayList<String> alColumns = null;
        try {
            oMysql.conexion(enumTipoConexion);
            alColumns = oMysql.getColumnsName("usuario", Conexion.getDatabaseName());
            oMysql.desconexion();

        } catch (Exception e) {
            throw new Exception("UsuarioDao.getColumnsNames: Error: " + e.getMessage());
        } finally {
            oMysql.desconexion();
        }
        return alColumns;
    }

}
