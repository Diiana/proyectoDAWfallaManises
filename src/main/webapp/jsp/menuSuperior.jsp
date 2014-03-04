<%-- 
    Document   : menu.jsp
    Author     : diana
--%>

<!--
<ul class="nav">
    <div class="nav-collapse collapse">
        <ul class="nav">
            <li><a id="lnkCenso" href="#">Censo</a></li>

            <li><a id="lnkComision" href="#">Comision</a></li>
            <li><a id="lnkRecompensa" href="#">Recompensa</a></li>
            <li><a id="lnkCargo" href="#">Cargo</a></li>
            <li><a id="lnkHistorial" href="#">Historial</a></li>

            <li><a id="lnkGraficas" href="#">Gráficas</a></li>

        </ul>
    </div>
</ul>
-->

<ul class="nav">
    <li><a id="lnkCenso" href="#">Censo</a></li>
    <li><a id="lnkHistorial" href="#">Historial</a></li>
    <li class="dropdown">
        <a class="dropdown-toggle" id="dLabel" role="button" data-toggle="dropdown" data-target="#" href="#">Otro Mantenimientos <b class="caret"></b></a>
        <ul class="dropdown-menu" role="menu" aria-labelledby="dLabel">
            <li><a id="lnkComision" href="#">Comision</a></li>
            <li><a id="lnkRecompensa" href="#">Recompensa</a></li>
            <li><a id="lnkCargo" href="#">Cargo</a></li>
        </ul>
    </li>
</ul>




 <script src="js/vendor/bootstrap-dropdown.js"></script>