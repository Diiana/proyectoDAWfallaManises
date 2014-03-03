<%-- 
    Document   : list
    Author     : Diana
--%>

<%@page import="net.fallamanises.helper.Conexion"%>
<%@page import="net.fallamanises.dao.CargoDao"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Iterator"%>
<%
    CargoDao oCargoDao = new CargoDao(Conexion.getConection());
    ArrayList<String> alColumnsNames = (ArrayList<String>) oCargoDao.getColumnsNames();
    Iterator<String> oIterador = alColumnsNames.listIterator();
    String strNombreMantenimiento = "cargo";
%>
<div id="<%=strNombreMantenimiento%>_list">
    <div class="row-fluid">
        <div class="span8">
            <h2>Cargo Directivo</h2>
        </div>
        <div class="span4">
            <button class="btn" id="crear">Nuevo Cargo</button>
        </div> 

        <div id="datos"></div>
        <div id="datos2"></div>

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

