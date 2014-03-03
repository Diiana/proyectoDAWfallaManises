<%-- 
    Document   : list
    Created on : 27-feb-2014, 19:36:44
    Author     : Diana
--%>

<%@page import="net.fallamanises.helper.Conexion"%>
<%@page import="net.fallamanises.dao.HistorialDao"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Iterator"%>
<%
    HistorialDao oHistorialDao = new HistorialDao(Conexion.getConection());
    ArrayList<String> alColumnsNames = (ArrayList<String>) oHistorialDao.getColumnsNames();
    Iterator<String> oIterador = alColumnsNames.listIterator();
    String strNombreMantenimiento = "historial";
%>
<div id="<%=strNombreMantenimiento%>_list">
    <div class="span12">
        <h2>Historial Fallero</h2>
        
        <div class="row-fluid">
            <div class="span8">       
                <div id="pagination"></div>                  
            </div>
            <div class="span4">
                <button class="btn" id="crear">Nueva fila</button>
            </div>
        </div>  
        
        <div id="datos"></div>
        <div id="datos2"></div>

        <div class="row">    

            <div class="span6">
                <legend>Buscar por:</legend> 
                <form class="navbar-form pull-right" action="Controller" method="post" id="empresaForm">
                    <fieldset>                                                                     
                        <span>
                            <select id="selectFilter" name="filter" width="80" style="width: 100px">
                                <option value="ejercicio" >Ejercicio</option>
                                <option value="id_cargo" >Cargo</option>
                                <option value="id_recompensa" >Recompensa</option>
                            </select>
                        </span>
                        &nbsp igual a  &nbsp  
                        <input id="inputFiltervalue" name="filtervalue" type="text" size="20" maxlength="50" value=""  width="100" style="width: 90px"/>
                        <br/>
                        <span>
                            <input type="submit" class="btn" id="btnFiltrar" name="btnFiltrar" value="Buscar <%=strNombreMantenimiento%>" />
                        </span>
                    </fieldset>
                </form>
            </div>

            <div class="span6">
                <legend>Registros por página</legend> 
                <form class="navbar-form pull-right" action="Controller" method="post" id="nrrpForm" >
                    <fieldset>                                               
                        <span>
                            <select  id="rpp" name="nrpp" value="select" style="width: 80px">                        
                                <option>5</option>
                                <option>10</option>
                                <option>20</option>

                            </select>  
                        </span>                   
                    </fieldset>
                </form>                
            </div>
                        
        </div> 
                        
    </div>
    <br>
</div>

<!-- Modales -->
<div id="modal01" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-header"></div>
    <div class="modal-body"></div>
    <div class="modal-footer"></div>
</div>
<div id="modal02" class="modal container hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-header"></div>
    <div class="modal-body"></div>
    <div class="modal-footer"></div>
</div>
</div>

