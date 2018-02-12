

<%@ page contentType="text/html;charset=UTF-8" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Marcas</title>
    </head>
    <body>
        <h1>marcas</h1>
  
        <g:each in="${marcas}" var="marca">
             <table>
  <tr>
    <th>marcas</th>
    <th>acciones</th>
    
  </tr>
  <tr>
    <td>${marca.nombreMarca}</td>
    <td><g:link controller="Marcas" action="modificarmarca" id="${marca.id}">modificar</g:link>
    /<g:link controller="Marcas" action="eliminar" id="${marca.id}">eliminar</g:link></td>
    
 
 
  </tr>
 

</table>
      
        </g:each>
    
        
        <g:link controller="Marcas" action="guardarmarca">agregar marca</g:link></td><br>
    <g:link url="[action:'index',controller:'Servicios']">regresar a realizar servicio</g:link>
    <g:link controller='logout'>Logout</g:link>
    </body>
</html>
