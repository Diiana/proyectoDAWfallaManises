<%-- 
    Document   : register01
    Author     : Diana
--%>

<form id="register" action="jsp" class="form-horizontal" method="post">
    <h1>Registrate y ten accesibilidad a toda la web!</h1>
    <input type="hidden" name="ob" value="usuario" />
    <input type="hidden" name="op" value="register02" />
    
    <p>Introduce tu DNI (números-letra) para verificar que eres fallero de esta comisión: </p>
    
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

