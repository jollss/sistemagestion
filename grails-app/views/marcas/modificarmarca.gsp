
<%@ page contentType="text/html;charset=UTF-8" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>modificar</title>
    </head>
    <body>
        <h1>Marca a modificar</h1>
        <g:form Controller="Marcas" action="guardar">
            <g:hiddenField name="id" value="${marca.id}"/><br/>
             
            <label>nombre marca: </label>
            <g:textField name="nombre" placeholder="${marca.nombreMarca}"/><br/>
         
            <g:actionSubmit value="guardar"/>
        </g:form>
            <g:link controller="Marcas" action="index">consultar marca</g:link></td><br>
     <g:link url="[action:'index',controller:'Servicios']">regresar a realizar servicio</g:link>
    </body>
</html>
