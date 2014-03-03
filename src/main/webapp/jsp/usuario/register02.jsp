<%-- 
    Document   : register02
    Author     : Diana
--%>

<%@page import="net.fallamanises.bean.UsuarioBean"%>
<% UsuarioBean oUsuario = (UsuarioBean) request.getSession().getAttribute("usuarioBean"); %>
<% if (oUsuario == null) { %>

<form id="register" action="jsp" class="form-horizontal" method="post">
    <h1>Registrate y ten accesibilidad a toda la web!</h1>
    <input type="hidden" name="ob" value="usuario" />
    <input type="hidden" name="op" value="register02" />

    <p>No se ha podido resgistrar, por favor vuelva a intentarlo. </p>

    <div class="control-group">
        <label class="control-label"  for="inputDni">DNI: </label>
        <div class="controls">
            <input type="text" id="dni" autofocus="autofocus" name="dni" size="15" />
        </div>
    </div>  

    <div class="control-group">
        <label class="control-label" for="inputLogin">Usuario:</label>
        <div class="controls">
            <input type="text" id="inputLogin"  placeholder="Nombre de usuario" name="login">
        </div>
    </div>
    <div class="control-group">
        <label class="control-label" for="inputPassword">Password:</label>
        <div class="controls">
            <input type="password" id="inputPassword" placeholder="Password" name="password">
        </div>
    </div>
    <div class="control-group">
        <div class="controls">
            <button id="entrarBTN" type="submit" class="btn">Registrarse</button>
        </div>
    </div>
</form>

<% } else {%>
<h1>Su registro se ha creado con éxito. Ya esta dentro de la aplicación.</h1>




<% }%>
