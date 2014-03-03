<%-- 
    Document   : form
    Created on : 27-feb-2014, 19:44:25
    Author     : Diana
--%>

<form class="form-horizontal" action="#" id="formulario" name="formulario">
    <h2>Nuevo historial</h2>
    <input type="hidden" id="id" name="id" />

    <div class="control-group">
        <label class="control-label"  for="inputid_censo">Fallero: </label>
        <div class="controls">
            <input type="text" id="id_censo" name="id_censo" size="4" />
        </div>
        <a class="btn btn-mini" id="id_censo_button" href="#"><i class="icon-search"></i></a>
    </div>
    <div class="control-group">
            <div class="controls">
                <span id="id_censo_desc" class="alert alert-success"></span>                                       
            </div>
        </div> 

    <div class="control-group">
        <label class="control-label"  for="inputEjercicio">Ejercicio: </label>
        <div class="controls">
            <input type="text" id="ejercicio" name="ejercicio" size="10" />
        </div>
    </div>

    <div class="control-group">
        <label class="control-label"  for="inputid_cargo">Cargo: </label>
        <div class="controls">
            <select id="id_cargo" name="id_cargo"></select>
        </div>
    </div>

    <div class="control-group">
        <label class="control-label"  for="inputid_recompensa">Recompensa: </label>
        <div class="controls">
            <select id="id_recompensa" name="id_recompensa"></select>
        </div>
    </div>

    <div class="control-group">
        <label class="control-label"  for="inputFalla">Falla: </label>
        <div class="controls">
            <input type="text" id="falla" name="falla" size="10" />
        </div>
    </div>





    <div class="control-group">
        <div class="controls">
            <button type="submit" id="submitForm" class="btn submitForm">Submit</button>
        </div>
    </div>
</form>