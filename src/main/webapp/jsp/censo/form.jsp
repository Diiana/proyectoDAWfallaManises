<%-- 
    Document   : form
    Author     : Diana
--%>
<form class="form-horizontal" action="#" id="formulario" name="formulario">
    <h2>Datos Fallero</h2>
    <input type="hidden" id="id" name="id" />

    <div class="control-group">
        <label class="control-label"  for="inputComision">Comisión: </label>
        <div class="controls">
            <select id="id_comision" name="id_comision"></select>
        </div>      
    </div>

    <div class="control-group">
        <label class="control-label"  for="inputApellido1">1ºApellido: </label>
        <div class="controls">
            <input type="text" id="apellido1" name="apellido1" size="15" />
        </div>
    </div>

    <div class="control-group">
        <label class="control-label"  for="inputApellido2">2ºApellido: </label>
        <div class="controls">
            <input type="text" id="apellido2" name="apellido2" size="15" />
        </div>
    </div>

    <div class="control-group">
        <label class="control-label"  for="inputNombre:">Nombre: </label>
        <div class="controls">
            <input type="text" id="nombre" name="nombre:" size="15" />
        </div>
    </div>

    <div class="control-group">
        <label class="control-label" for="inputDomicilio" >Domicilio: </label>
        <div class="controls">
            <input type="text" id="domicilio" name="domicilio" size="40" />
        </div>
    </div>

    <div class="control-group">
        <label class="control-label" for="inputPatio" >Patio: </label>
        <div class="controls">
            <input type="text" id="patio" name="patio" size="3" />
        </div>
    </div>

    <div class="control-group">
        <label class="control-label" for="inputPuerta" >Puerta: </label>
        <div class="controls">
            <input type="text" id="puerta" name="puerta" size="3" />
        </div>
    </div>

    <div class="control-group">
        <label class="control-label"  for="inputLocalidad">Localidad: </label>
        <div class="controls">
            <input type="text" id="localidad" name="localidad" size="15" />
        </div>
    </div>

    <div class="control-group">
        <label class="control-label"  for="inputCpostal">Código Postal: </label>
        <div class="controls">
            <input type="text" id="codpostal" name="codpostal" size="15" />
        </div>
    </div>

    <div class="control-group">
        <label class="control-label"  for="inputDni">DNI: </label>
        <div class="controls">
            <input type="text" id="dni" name="dni" size="9" />
        </div>
    </div>

    <div class="control-group">
        <label class="control-label"  for="inputNacimiento">Nacimiento: </label>
        <div class="controls">
            <input type="text" id="nacimiento" name="nacimiento" size="15" />
        </div>
    </div>
    <script>$("#nacimiento").datepicker({
            showOn: 'both',
            buttonImageOnly: true,
            changeYear: true,
            numberOfMonths: 1});
    </script>



    <div class="control-group">
        <label class="control-label"  for="inputAlta">Alta: </label>
        <div class="controls">
            <input type="text" id="alta" name="alta" size="15" />
        </div>
    </div>
    <script>$("#alta").datepicker({
            showOn: 'both',
            buttonImageOnly: true,
            changeYear: true,
            numberOfMonths: 1});
    </script>


    <div class="control-group">
        <label class="control-label"  for="inputTelefono">Telefono: </label>
        <div class="controls">
            <input type="text" id="telefono" name="telefono" size="9" />
        </div>
    </div>

    <div class="control-group">
        <label class="control-label"  for="inputEdad">Historial: </label>
        <div class="controls">
            <input type="text" id="edad" name="edad" size="2" />
        </div>
    </div>


    <div class="control-group">
        <label class="control-label"  for="inputRecompensa">Recompensa: </label>
        <div class="controls">
             <select id="id_recompensa" name="id_recompensa"></select>
        </div>
    </div>


    <div class="control-group">
        <label class="control-label"  for="inputAño">Año concesion: </label>
        <div class="controls">
            <input type="text" id="año" name="añoRecompensa" size="4" />
        </div>
    </div>


    <div class="control-group">
        <label class="control-label"  for="inputEdad">Edad: </label>
        <div class="controls">
            <input type="text" id="edad" name="edad" size="2" />
        </div>
    </div>




    <div class="control-group">
        <div class="controls">
            <button type="submit" id="submitForm" class="btn submitForm">Submit</button>
        </div>
    </div>
</form>

<script>
    $(function() {
        $("#datepicker").datepicker();
    });
</script>
