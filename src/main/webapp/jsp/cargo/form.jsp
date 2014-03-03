<%-- 
    Document   : form
    Author     : Diana
--%>

<form class="form-horizontal" action="#" id="formulario" name="formulario">
    <h2>Nuevo Cargo</h2>
    <input type="hidden" id="id" name="id" />

    <div class="control-group">
        <label class="control-label"  for="inputCargo">Cargo: </label>
        <div class="controls">
            <input type="text" id="cargo" name="cargo" size="20" />
        </div>
    </div>

    
    <div class="control-group">
        <div class="controls">
            <button type="submit" id="submitForm" class="btn submitForm">Submit</button>
        </div>
    </div>
</form>