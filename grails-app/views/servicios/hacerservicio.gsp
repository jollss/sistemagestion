<!--A Design by W3layouts
Author: W3layout
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<head>
<title>Servicios</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Visitors Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="../../application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- bootstrap-css -->
<link rel="stylesheet" href="../../css/bootstrap.min.css" >
<!-- //bootstrap-css -->
<!-- Custom CSS -->
<link href="../../css/style.css" rel='stylesheet' type='text/css' />
<link href="../../css/style-responsive.css" rel="stylesheet"/>
<!-- font CSS -->
<link href='../..///fonts.googleapis.com/css?family=Roboto:400,100,100italic,300,300italic,400italic,500,500italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>
<!-- font-awesome icons -->
<link rel="stylesheet" href="../../css/font.css" type="text/css"/>
<link href="../../css/font-awesome.css" rel="stylesheet"> 
<!-- //font-awesome icons -->
<script src="../../js/jquery2.0.3.min.js"></script>
</head>
<body>
<section id="container">
<!--header start-->
<header class="header fixed-top clearfix">
<!--logo start-->
<div class="brand">

    <a href="index.html" class="logo">
        Servicos
    </a>
    <div class="sidebar-toggle-box">
        <div class="fa fa-bars"></div>
    </div>
</div>
<!--logo end-->

<div class="top-nav clearfix">
    <!--search & user info start-->
    <ul class="nav pull-right top-menu">
        
        <!-- user login dropdown start-->
        <li class="dropdown">
            <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                <img alt="" src="../../images/2.png">
                <span class="username"><sec:ifLoggedIn> <sec:username/>
                    </sec:ifLoggedIn></span>
                <b class="caret"></b>
            </a>
            <ul class="dropdown-menu extended logout">
                <!--<li><a href="#"><i class=" fa fa-suitcase"></i>Profile</a></li>
                <li><a href="#"><i class="fa fa-cog"></i> Settings</a></li>-->
                <li><g:link class="fa fa-key" controller='logout'> Cerrar Sesion</g:link></li>
            </ul>
        </li>
        <!-- user login dropdown end -->
       
    </ul>
    <!--search & user info end-->
</div>
</header>
<!--header end-->
<!--sidebar start-->
<aside>
    <div id="sidebar" class="nav-collapse">
        <!-- sidebar menu start-->
        <div class="leftside-navigation">
            <ul class="sidebar-menu" id="nav-accordion">
                <li>
<g:link class="fa fa-dashboard" controller="Servicios" action="index"> <span>Consultar Servicios</span></g:link> 
             </li>
                <li class="sub-menu">
                    <a href="javascript:;">
                        <i class="fa fa-book"></i>
                        <span>Marcas</span>
                    </a>
                   <ul class="sub">
         <li><g:link controller="Marcas" action="guardarmarca">Agregar Marca</g:link></li>
<li> <g:link controller="Marcas" action="index">Consultar Marcas</g:link></li>
                        
                    </ul>
                </li>
                 <li class="sub-menu">
                    <a href="javascript:;">
                        <i class="fa fa-book"></i>
                        <span>Automovil</span>
                    </a>
                   <ul class="sub">
         <li><g:link controller="Autmovil" action="guardarautomovil">Agregar Automvil</g:link></li>
<li> <g:link controller="Autmovil" action="index">Consultar Automovil</g:link></li>
                        
                    </ul>
                </li>
                <li class="sub-menu">
                    <a href="javascript:;">
                        <i class="fa fa-book"></i>
                        <span>Tipo Servicio</span>
                    </a>
                   <ul class="sub">
         <li><g:link controller="Tiposervicio" action="guardartiposer">Agregar Servicio</g:link></li>
<li> <g:link controller="Tiposervicio" action="index">Consultar Tipos de Servicios</g:link></li>
                        
                    </ul>
                </li>
                
            </ul> </div>
        <!-- sidebar menu end-->
    </div>
</aside>
<!--sidebar end-->
<!--main content start-->
<section id="main-content">
	<section class="wrapper">
	<div class="row">
        <div class="col-lg-12">
        <section class="panel">
            <header class="panel-heading">
               Servicios
            </header>
            <div class="panel-body">
                
               <g:form class="form-horizontal bucket-form" controller="Servicios" action="save"> 
                     
                          <g:hiddenField name="id" value="${servicios.id}"/> 
                    <div class="form-group">
                        <label class="col-sm-3 control-label">Fecha del Servicio</label>
                        <div class="col-sm-6">                      
                        <g:textField class="form-control" id="disabledInput" type="text" placeholder="Disabled input here..." disabled="" name="diaServicio" value="${servicios.diaServicio}"  disabled="diaServicio"/> 
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-3 control-label">Hora del Servicio</label>
                        <div class="col-sm-6">
<g:textField class="form-control" id="disabledInput" type="text" placeholder="Disabled input here..." disabled="" name="horaServicio" value="${servicios.horaServicio}" disabled="horaServicio"/>
                            
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-3 control-label">Observaciones del Mecanico</label>
                        <div class="col-sm-6">
<g:textField type="text" class="form-control" name="observaciones" placeholder="${servicios.observacionesMecanico}"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-3 control-label">Marca</label>
                        <div class="col-sm-6">
<g:textField class="form-control" id="disabledInput" type="text" placeholder="Disabled input here..." disabled="" name="marca" value="${servicios.marca.nombreMarca}"/> 
                       </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-3 control-label">Automovil</label>
                        <div class="col-sm-6">
  <g:textField class="form-control" id="disabledInput" type="text" placeholder="Disabled input here..." disabled="" name="automovil" value="${servicios.automovil.nombreAuto}"/>                           
</div>
                    </div>
<div class="form-group">
                        <label class="col-sm-3 control-label">Tipo de Servicio a Realizar</label>
                        <div class="col-sm-6">
<g:textField class="form-control" id="disabledInput" type="text" placeholder="Disabled input here..." disabled="" name="tiposervicio" value="${servicios.tiposervicio.nombreServicio}"/>                           
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-3 control-label col-lg-3" for="inputSuccess">Estatus</label>
                        <div class="col-lg-6">
                            <select class="form-control m-bot15" name="estatus">
                                <option value=${servicios.estatus}> ${servicios.estatus} </option> 
                                <option value=terminado> terminado </option> 
                            </select>
                        </div>
                    </div>

         <center><g:actionSubmit class="btn btn-danger" value="save"/></center>
               </g:form>  
            </div>
        </section>
        </div>
        </div>

        
</section>
 <!-- footer -->
		  <div class="footer">
			<div class="wthree-copyright">
			 <p>© 2018 ANG&JOE. TODOS LOS DERECHOS RESERVADOS | DISEÑADO POR <a href="">GESTION</a></p>
			</div>
		  </div>
  <!-- / footer -->
</section>

<!--main content end-->
</section>
<script src="../../js/bootstrap.js"></script>
<script src="../../js/jquery.dcjqaccordion.2.7.js"></script>
<script src="../../js/scripts.js"></script>
<script src="../../js/jquery.slimscroll.js"></script>
<script src="../../js/jquery.nicescroll.js"></script>
<!--[if lte IE 8]><script language="javascript" type="text/javascript" src="js/flot-chart/excanvas.min.js"></script><![endif]-->
<script src="../../js/jquery.scrollTo.js"></script>
</body>
</html>