<!DOCTYPE html>
<html>
	<head>
	
		<title>guardar marca </title>
	</head>
	<body>
        <g:form controller="Marcas" action="save">
            <label>nombre marca: </label>
            <g:textField name="nombreMarca"/><br/>
         
            <g:actionSubmit value="Save" align="center" style="border:0px;background:transparent"/>
        </g:form>
           <g:link  action="index">consultar marcas</g:link><br>
            <g:link url="[action:'index',controller:'Servicios']">regresar hacer servicio</g:link>
	</body>
</html>