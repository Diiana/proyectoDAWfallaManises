<%@page import="net.fallamanises.bean.UsuarioBean"%>
<%UsuarioBean user = (UsuarioBean) request.getSession().getAttribute("usuarioBean");%>



<!DOCTYPE html>
<!--[if lt IE 7]> <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]> <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]> <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!-->
<html class="no-js">
    <!--<![endif]-->
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <title>ACFallaManises</title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width">
        <link rel="stylesheet" href="css/bootstrap.min.css">
                
        <style>
            body {
                padding-top: 60px;
                padding-bottom: 40px;
            }
        </style>
        <link rel="stylesheet" href="css/bootstrap-responsive.min.css">
        <link rel="stylesheet" href="css/main.css">
        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
        <script>window.jQuery || document.write('<script src="js/vendor/jquery-1.10.2.min.js"><\/script>')</script>
        <script src="js/vendor/modernizr-2.6.2-respond-1.1.0.min.js"></script>
        <script src="js/vendor/jquery.validate.min.js"></script>


        <link rel="stylesheet" href="http://code.jquery.com/ui/1.10.1/themes/base/jquery-ui.css" />
        <script src="http://code.jquery.com/ui/1.10.1/jquery-ui.js"></script>

    </head>
    <body>
        <!--[if lt IE 7]>
        <p class="chromeframe">You are using an outdated browser. <a href="http://browsehappy.com/">Upgrade your browser today</a> or <a href="http://www.google.com/chromeframe/?redirect=true">install Google Chrome Frame</a> to better experience this site.</p>
        <![endif]-->


        <div class="navbar navbar-inverse navbar-fixed-top">
            <div class="navbar-inner">
                <div class="container-fluid">
                    <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse"> 
                        <span class="icon-bar"></span> 
                        <span class="icon-bar"></span> 
                        <span class="icon-bar"></span>
                    </a> 
                    <a class="brand" href="jsp">AC Falla Manises</a>                   
                    <div class="nav-collapse collapse">
                        <%if (user != null) {%>
                        <jsp:include page="jsp/menuSuperior.jsp" />   
                        <% }%>
                        <jsp:include page="jsp/usuario/infologin.jsp" />                        
                    </div>
                </div>
            </div>
        </div>

        <div class="container-fluid">
            <div class="row-fluid">
              
                <%
                    if (user != null) {
                        out.print("<div class=\"span10\">");
                        out.print("<div id=\"indexContenido\"></div>");
                    } else {
                        out.print("<div class=\"span12\">");
                    }
                %>
                <div id="indexContenidoJsp">
                    <jsp:include page='<%=(String) request.getAttribute("contenido")%>' />                
                </div>
                <%
                    out.print("</div>");
                %>    
                <div class="row-fluid">
                    <div class="span12"><hr><footer><p>&copy; Diana Ortega (2014)</p></footer></div>   
                </div>
            </div>
        </div>                    

        <!-- carga de javascript -->

        <script src="js/vendor/bootstrap.min.js"></script>

        <script src="js/vendor/bootstrap-transition.js"></script>
        <script src="js/vendor/bootstrap-alert.js"></script>
        <script src="js/vendor/bootstrap-modal.js"></script>
        <script src="js/vendor/bootstrap-dropdown.js"></script>
        <script src="js/vendor/bootstrap-scrollspy.js"></script>
        <script src="js/vendor/bootstrap-tab.js"></script>
        <script src="js/vendor/bootstrap-tooltip.js"></script>
        <script src="js/vendor/bootstrap-popover.js"></script>
        <script src="js/vendor/bootstrap-button.js"></script>
        <script src="js/vendor/bootstrap-collapse.js"></script>
        <script src="js/vendor/bootstrap-carousel.js"></script>
        <script src="js/vendor/bootstrap-typeahead.js"></script>    

        <script src="js/util.js" charset="UTF-8"></script>
        <script src="js/main.js" charset="UTF-8"></script>



        <script src="js/control/censo.js" charset="UTF-8"></script>
        <script src="js/control/comision.js" charset="UTF-8"></script>
        <script src="js/control/recompensa.js" charset="UTF-8"></script>
        <script src="js/control/cargo.js" charset="UTF-8"></script>
        <script src="js/control/historial.js" charset="UTF-8"></script>
        
        <script>

            $(document).ready(function() {
                inicializacion();


                $('#lnkCenso').unbind('click');
                $('#lnkCenso').click(function() {
                    var censo = objeto('censo', '<%=request.getContextPath()%>');
                    var censoView = vista(censo, '<%=request.getContextPath()%>');

                    $('#indexContenidoJsp').empty();
                    $('#indexContenido').empty().append(censoView.getEmptyList());

                    var censoControl = control_censo_list('<%=request.getContextPath()%>');
                    censoControl.inicia(censoView, 1, null, null, 10, null, null, null, null);
                    return false;
                });



                $('#lnkComision').unbind('click');
                $('#lnkComision').click(function() {
                    var comision = objeto('comision', '<%=request.getContextPath()%>');
                    var comisionView = vista(comision, '<%=request.getContextPath()%>');

                    $('#indexContenidoJsp').empty();
                    $('#indexContenido').empty().append(comisionView.getEmptyList());

                    var comisionControl = control_comision_list('<%=request.getContextPath()%>');
                    comisionControl.inicia(comisionView, 1, null, null, 10, null, null, null, null);
                    return false;
                });


                $('#lnkRecompensa').unbind('click');
                $('#lnkRecompensa').click(function() {
                    var recompensa = objeto('recompensa', '<%=request.getContextPath()%>');
                    var recompensaView = vista(recompensa, '<%=request.getContextPath()%>');

                    $('#indexContenidoJsp').empty();
                    $('#indexContenido').empty().append(recompensaView.getEmptyList());

                    var recompensaControl = control_recompensa_list('<%=request.getContextPath()%>');
                    recompensaControl.inicia(recompensaView, 1, null, null, 10, null, null, null, null);
                    return false;
                });
                
                $('#lnkCargo').unbind('click');
                $('#lnkCargo').click(function() {
                    var cargo = objeto('cargo', '<%=request.getContextPath()%>');
                    var cargoView = vista(cargo, '<%=request.getContextPath()%>');

                    $('#indexContenidoJsp').empty();
                    $('#indexContenido').empty().append(cargoView.getEmptyList());

                    var cargoControl = control_cargo_list('<%=request.getContextPath()%>');
                    cargoControl.inicia(cargoView, 1, null, null, 10, null, null, null, null);
                    return false;
                });
                
                $('#lnkHistorial').unbind('click');
                $('#lnkHistorial').click(function() {
                    var historial = objeto('historial', '<%=request.getContextPath()%>');
                    var historialView = vista(historial, '<%=request.getContextPath()%>');

                    $('#indexContenidoJsp').empty();
                    $('#indexContenido').empty().append(historialView.getEmptyList());

                    var historialControl = control_historial_list('<%=request.getContextPath()%>');
                    historialControl.inicia(historialView, 1, null, null, 10, null, null, null, null);
                    return false;
                });
                
            });

        </script>
    </body>
</html>
