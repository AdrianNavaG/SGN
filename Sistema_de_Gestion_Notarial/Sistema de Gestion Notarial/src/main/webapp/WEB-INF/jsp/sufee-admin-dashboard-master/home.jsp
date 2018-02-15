<!DOCTYPE html>
<html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7" lang=""> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8" lang=""> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9" lang=""> <![endif]-->
<!-- [if gt IE 8]><! <html class="no-js" lang=""> <![endif] -->
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>SGN | SS SOLUTIONS</title>
    <meta name="description" content="Sufee Admin - HTML5 Admin Template">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link rel="apple-touch-icon" href="apple-icon.png">
    <link rel="shortcut icon" href="favicon.ico">

    <link rel="stylesheet" href="/resources/assets/css/normalize.css">
    <link rel="stylesheet" href="/resources/assets/css/bootstrap.min.css">
    <link rel="stylesheet" href="/resources/assets/css/font-awesome.min.css">
    <link rel="stylesheet" href="/resources/assets/css/themify-icons.css">
    <link rel="stylesheet" href="/resources/assets/css/flag-icon.min.css">
    <link rel="stylesheet" href="/resources/assets/css/cs-skin-elastic.css">
    <link rel="stylesheet" href="/resources/assets/css/lib/datatable/dataTables.bootstrap.min.css">
   
    <!-- <link rel="stylesheet" href="/resources/assets/css/bootstrap-select.less"> -->
    <link rel="stylesheet" href="/resources/assets/scss/style.css">
    <link href='https://fonts.googleapis.com/css?family=Open+Sans:400,600,700,800' rel='stylesheet' type='text/css'>
    <script src="/resources/js/jquery-1.11.1.min.js"></script>
    
     <script src="/resources/js/constants.js"></script>
     
     <script src="/resources/js/alta-expediente-form.js"></script>
     <script src="/resources/js/save-expediente.js"></script>
     <script src="/resources/js/alta-expediente-validation.js"></script>
     
     <script src="/resources/js/busqueda-expediente-form.js"></script>
     <script src="/resources/js/search-expediente.js"></script>
     <script src="/resources/js/select-expediente.js"></script>
     

</head>
<body>
        <!-- Left Panel -->

    <aside id="left-panel" class="left-panel">
        <nav class="navbar navbar-expand-sm navbar-default">

            <div class="navbar-header">
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#main-menu" aria-controls="main-menu" aria-expanded="false" aria-label="Toggle navigation">
                    <i class="fa fa-bars"></i>
                </button>
                <a class="navbar-brand" href="./"><img src="/resources/assets/images/logo.png" alt="Notaria 1"></a>
            </div>

            <div id="main-menu" class="main-menu collapse navbar-collapse">
                <ul class="nav navbar-nav">
                    <li class="active">
                        <a href="home"> <i class="menu-icon fa fa-balance-scale"></i>Notaria 1 </a>
                    </li>
                    <h3 class="menu-title">Menú</h3><!-- /.menu-title -->
                    <li class="menu-item-has-children dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> <i class="menu-icon fa fa-folder"></i>Expedientes</a>
                        <ul class="sub-menu children dropdown-menu">
                            <li><i class="fa fa-folder-open-o"></i><a onClick="altaexpediente()" href="#">Alta de Expedientes</a></li>
                            <li><i class="fa fa-search"></i><a onClick="busquedaexpediente()" href="#">Busqueda de Expedientes</a></li>
                            <li><i class="fa fa-file-text"></i><a href="#">Reporte de Expedientes</a></li>
                            <li><i class="fa fa-file-text"></i><a href="#">Reporte de Expedientes</a></li>
                            <li><i class="fa fa-file-text"></i><a href="#">Reporte de Expedientes</a></li>
                            <li><i class="fa fa-file-text"></i><a href="#">Reporte de Expedientes</a></li>
                            <li><i class="fa fa-file-text"></i><a href="#">Reporte de Expedientes</a></li>
                        </ul>
                    </li>
                    <li class="menu-item-has-children dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> <i class="menu-icon fa fa-users"></i>Clientes</a>
                        <ul class="sub-menu children dropdown-menu">
                            <li><i class="fa fa-table"></i><a href="#">Basic Table</a></li>
                            <li><i class="fa fa-table"></i><a href="#">Data Table</a></li>
                        </ul>
                    </li>
                    <li class="menu-item-has-children dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> <i class="menu-icon fa fa-money"></i>Recibos</a>
                        <ul class="sub-menu children dropdown-menu">
                            <li><i class="menu-icon fa fa-th"></i><a href="#">Basic Form</a></li>
                            <li><i class="menu-icon fa fa-th"></i><a href="#">Advanced Form</a></li>
                        </ul>
                    </li>
                </ul>
            </div><!-- /.navbar-collapse -->
        </nav>
    </aside><!-- /#left-panel -->

    <!-- Left Panel -->

    <!-- Right Panel -->

    <div id="right-panel" class="right-panel">

        <!-- Header-->
        <header id="header" class="header">

            <div class="header-menu">

                <div class="col-sm-7">
                    <a id="menuToggle" class="menutoggle pull-left"><i class="fa fa fa-tasks"></i></a>
                    	<h6 class="pb-4 display-5">
	                    	Direccion bla bla bla bla bla bla bla bla bla<br>
	                    	Telefonos: 551234234 / 557545634<br>
	                    	Lic. Pepe el Toro
                    	</h6>
                </div>

                <div class="col-sm-5">
                    <div class="user-area dropdown float-right">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            <img class="user-avatar rounded-circle" src="/resources/assets/images/admin.jpg" alt="User Avatar">
                        </a>
                        <div class="user-menu dropdown-menu">
                                <a class="nav-link" href="#"><i class="fa fa-user"></i>&nbsp;&nbsp;Perfil</a>
                                <a class="nav-link" href="#"><i class="fa fa-sign-out"></i>&nbsp;&nbsp;Salir</a>
                        </div>
                    </div>
                </div>
            </div>

        </header><!-- /header -->
        
        <input type="hidden" value="${fecha_actual}" id="today"/>
        
        <div class="content mt-3">
            <div class="animated fadeIn">
				<div id="contenedor">
				 <img class="img-rounded" src="/resources/assets/images/home.jpg" alt="home">
				</div>
            </div><!-- .animated -->
        </div><!-- .content -->


    </div><!-- /#right-panel -->

    <!-- Right Panel -->
    
     <button type="button" hidden="hidden" id="modalAlert"class="btn btn-info btn-lg" data-toggle="modal" data-target="#myModal"></button>
	  <!-- Modal -->
	  <div class="modal fade" id="myModal" role="dialog">
	    <div class="modal-dialog modal-xs">
	      <div class="modal-content">
	        <div class="modal-header">
	        <h6 class="modal-title">Mensaje</h6>
	          <button type="button" class="close" data-dismiss="modal">&times;</button>
	        </div>
	        <div class="modal-body">
	          <p> <label id="labelModal"></label></p>
	        </div>
	        <div class="modal-footer">
	          <button type="button" class="btn btn-default" data-dismiss="modal">Aceptar</button>
	        </div>
	      </div>
	    </div>
	  </div>


<!-- 	<table id='bootstrap-data-table' class='table table-striped table-bordered'> -->
<!-- 	<thead id='data-table-thead'> -->
<!--      </thead> -->
<!--      <tbody id='data-table-tbody'> -->
<!--      </tbody>      -->
<!-- 	</table> -->

    <script src="/resources/assets/js/vendor/jquery-2.1.4.min.js"></script>
    <script src="/resources/assets/js/popper.min.js"></script>
    <script src="/resources/assets/js/plugins.js"></script>
    <script src="/resources/assets/js/main.js"></script>
    
     <script src="/resources/assets/js/lib/data-table/datatables.min.js"></script>
    <script src="/resources/assets/js/lib/data-table/dataTables.bootstrap.min.js"></script>
    <script src="/resources/assets/js/lib/data-table/dataTables.buttons.min.js"></script>
    <script src="/resources/assets/js/lib/data-table/buttons.bootstrap.min.js"></script>
    <script src="/resources/assets/js/lib/data-table/jszip.min.js"></script>
    <script src="/resources/assets/js/lib/data-table/pdfmake.min.js"></script>
    <script src="/resources/assets/js/lib/data-table/vfs_fonts.js"></script>
    <script src="/resources/assets/js/lib/data-table/buttons.html5.min.js"></script>
    <script src="/resources/assets/js/lib/data-table/buttons.print.min.js"></script>
    <script src="/resources/assets/js/lib/data-table/buttons.colVis.min.js"></script>
    <script src="/resources/assets/js/lib/data-table/datatables-init.js"></script>

</body>
</html>
