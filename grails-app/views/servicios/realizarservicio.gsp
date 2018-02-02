
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sample title</title>
    </head>
    <body>
      
        <g:each in="${servicios}" var="serv">
             <table>
  <tr>
    <th >observaciones</th>
    <th>estatus</th>
    <th>comentarios</th>
    <th>marca</th>
    <th>accion</th>
    <th>estatus</th>
    <th>usuario</th>
  </tr>
  <tr>
    <td>${serv.observacionesMecanico} </td>
    <td>${serv.estatus}</td>
    <td>${serv.comentariosUsuario}</td>
    <td>${serv.automovil.nombreAuto}</td>
     <td>${serv.usuario.nombreUsuario}</td>
    usuario
        <td>${serv.estatus}</td>
     <td>hacer</td>
  </tr>
 

</table>
      
        </g:each>
  
    </body>
</html>
