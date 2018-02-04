<!doctype html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7" lang=""> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8" lang=""> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9" lang=""> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js" lang=""> <!--<![endif]-->
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
    <!-- <link rel="stylesheet" href="/resources/assets/css/bootstrap-select.less"> -->
    <link rel="stylesheet" href="/resources/assets/scss/style.css">

    <link href='https://fonts.googleapis.com/css?family=Open+Sans:400,600,700,800' rel='stylesheet' type='text/css'>
    
    <script src="/resources/js/jquery-1.11.1.min.js"></script>
    <script src="/resources/js/expediente.js"></script>

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
                        <a href="index.html"> <i class="menu-icon fa fa-balance-scale"></i>Notaria 1 </a>
                    </li>
                    <h3 class="menu-title">Menú</h3><!-- /.menu-title -->
                    <li class="menu-item-has-children  dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> <i class="menu-icon fa fa-folder"></i>Expedientes</a>
                        <ul class="sub-menu children dropdown-menu">
                            <li><i class="fa fa-folder-open-o"></i><a href="ui-buttons.html">Alta de Expedientes</a></li>
                            <li><i class="fa fa-search"></i><a href="ui-badges.html">Busqueda de Expedientes</a></li>
                            <li><i class="fa fa-file-text"></i><a href="ui-tabs.html">Reporte de Expedientes</a></li>
                            <li><i class="fa fa-file-text"></i><a href="ui-tabs.html">Reporte de Expedientes</a></li>
                            <li><i class="fa fa-file-text"></i><a href="ui-tabs.html">Reporte de Expedientes</a></li>
                            <li><i class="fa fa-file-text"></i><a href="ui-tabs.html">Reporte de Expedientes</a></li>
                            <li><i class="fa fa-file-text"></i><a href="ui-tabs.html">Reporte de Expedientes</a></li>
                        </ul>
                    </li>
                    <li class="menu-item-has-children dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> <i class="menu-icon fa fa-users"></i>Clientes</a>
                        <ul class="sub-menu children dropdown-menu">
                            <li><i class="fa fa-table"></i><a href="tables-basic.html">Basic Table</a></li>
                            <li><i class="fa fa-table"></i><a href="tables-data.html">Data Table</a></li>
                        </ul>
                    </li>
                    <li class="menu-item-has-children dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> <i class="menu-icon fa fa-money"></i>Recibos</a>
                        <ul class="sub-menu children dropdown-menu">
                            <li><i class="menu-icon fa fa-th"></i><a href="forms-basic.html">Basic Form</a></li>
                            <li><i class="menu-icon fa fa-th"></i><a href="forms-advanced.html">Advanced Form</a></li>
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
        <!-- Header-->
        <div class="content mt-3">
            <div class="animated fadeIn">

				
                <div class="row">
                  <div class="col-lg-12">
                    <div class="card">
                    <form action="">
                      <div class="card-header"><strong>Alta de Expediente</strong></div>
                      <div class="card-body card-block">
                        <div class="form-group col-xs-10 col-sm-4 col-md-4 col-lg-4">
	                        <label for="expediente" class=" form-control-label">Expediente</label>
	                        <input type="text" id="expediente" name="expediente" class="form-control" placeholder="Nuevo" readonly >
                        </div>
                        <div class="form-group col-xs-10 col-sm-4 col-md-4 col-lg-4">
                        </div>
                        <div class="form-group col-xs-10 col-sm-4 col-md-4 col-lg-4">
                       		<label for="fecha_apertura" class=" form-control-label">Fecha de Apertura</label>
                       		<input type="text" id="fecha_apertura" class="form-control" value="${fecha_apertura}" readonly >
                        </div>
                        <div class="form-group col-xs-10 col-sm-4 col-md-4 col-lg-4">
	                        <label for="nss" class=" form-control-label">Numero de Seguro Social</label>
	                        <input type="text" id="nss" placeholder="Numero de seguro social" class="form-control">
                        </div>
                        <div class="form-group col-xs-10 col-sm-4 col-md-4 col-lg-4">
                        	<label for="credito" class="form-control-label">Credito</label>
                        	<input type="text" id="credito" placeholder="Ingresa Credito" class="form-control">
                        </div>
                        <div class="form-group col-xs-10 col-sm-4 col-md-4 col-lg-4">
                        	<label for="otorgante" class=" form-control-label">Otorgante</label>
                        	<input type="text" id="otorgante" placeholder="Ingresa Otorgante" class="form-control">
                        </div>
                        <div class="form-group col-xs-10 col-sm-4 col-md-4 col-lg-4">
	                        <label for="operacion" class=" form-control-label">Operación</label>
	                        <input type="text" id="operacion" placeholder="Ingresa Operacion" class="form-control">
                        </div>
                        <div class="form-group col-xs-10 col-sm-4 col-md-4 col-lg-4">
                        	<label for="responsable" class=" form-control-label">Responsable</label>
                        	<input type="text" id="responsable" placeholder="Ingresa Responsable" class="form-control">
                        </div>
                        <div class="form-group col-xs-10 col-sm-4 col-md-4 col-lg-4">
                        <br>
                        </div>
                        <div class="form-group col-xs-10 col-sm-4 col-md-4 col-lg-4">
                        <br>
                        </div>
                         <div class="form-group col-xs-10 col-sm-4 col-md-4 col-lg-4 text-right" >
                        	<button type="button" class="btn btn-outline-primary btn-sm" onclick="saveexpedient()" >
                        	<i class="fa fa-save (alias)">
                        	</i>&nbsp; Guardar</button>
                        </div>
                      </div>
                      
                      
                      </form>
                    </div>
                  </div>
                </div>
            </div><!-- .animated -->
        </div><!-- .content -->


    </div><!-- /#right-panel -->

    <!-- Right Panel -->


    <script src="/resources/assets/js/vendor/jquery-2.1.4.min.js"></script>
    <script src="/resources/assets/js/popper.min.js"></script>
    <script src="/resources/assets/js/plugins.js"></script>
    <script src="/resources/assets/js/main.js"></script>


</body>
</html>
