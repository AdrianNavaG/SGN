
function busquedacliente(){	
	$('#contenedor').html("<div id='alta-cliente-div'>"+
	"<div class='row'>"+
		"<div class='col-lg-12'>"+
			"<div class='card'>"+
				"<form action=''>"+
					"<div class='card-header'>"+
						"<strong>Busqueda de Clientes</strong>"+
					"</div>"+
					"<div class='card-body card-block'>"+
						"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
							"<label for='clientes' class=' form-control-label'>Cliente</label>"+
							"<input type='text' id='clientes' name='clientes'"+
								"class='form-control' placeholder='Nombre' >"+
						"</div>"+
						"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
							"<br>"+
						"</div>"+
						"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
							"<br>"+
						"</div>"+
						"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4 text-right'>"+
							"<button type='button' class='btn btn-outline-primary btn-sm' onclick='searchclient()'>"+
								"<i class='fa fa-search-plus'> </i>&nbsp; Buscar"+
							"</button>"+
						"</div>"+
					"</div>"+
				"</form>"+
				 
				"<div class='card-body'><hr>" +
				
				"<table id='tablecliente' class='table table-striped table-bordered'>"+
                   "<thead>"+
                    "<tr>"+
                       "<th>Id Cliente</th>"+
                       "<th>Apellido Paterno</th>"+
                       "<th>Apellido Materno</th>"+
                       "<th>Nombre</th>"+
                       "<th>RFC</th>"+
                       "<th>   </th>"+

                      "</tr>"+
                    "</thead>"+
                    "<tbody>"+

                      "<tbody>"+
                      "</table>"+
                      "</div>"+
                      			
			"</div>"+
		"</div>"+
	"</div>"+
"</div>");
}