<%-- 
    Document   : list
    Author     : al037684
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="net.fallamanises.helper.Conexion"%>
<%@page import="net.fallamanises.dao.ComisionDao"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Iterator"%>
<%
    ComisionDao oComisionDao = new ComisionDao(Conexion.getConection());
    ArrayList<String> alColumnsNames = (ArrayList<String>) oComisionDao.getColumnsNames();
    Iterator<String> oIterador = alColumnsNames.listIterator();
    String strNombreMantenimiento = "comision";
%>
<div id="<%=strNombreMantenimiento%>_list">
    <div class="span12">
        <div class="row-fluid">
            <div class="span7">       
                <h2>Tipo Comisión</h2>           
            </div>
      
     
        <div id="datos"></div>
        <div id="datos2"></div>
    </div>
    <!-- Modales -->
    <div id="modal01" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-header"></div>
        <div class="modal-body"></div>
        <div class="modal-footer"></div>
    </div>
    <div id="modal02" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-header"></div>
        <div class="modal-body"></div>
        <div class="modal-footer"></div>
    </div>
</div>


