
function busquedaexpediente(){	
	$('#contenedor').html("<div id='alta-expediente-div'>"+
	"<div class='row'>"+
		"<div class='col-lg-12'>"+
			"<div class='card'>"+
				"<form action=''>"+
					"<div class='card-header'>"+
						"<strong>Busqueda de Expediente</strong>"+
					"</div>"+
					"<div class='card-body card-block'>"+
//					"<h6>Los campos marcados con asterisco (*) son obligatorios.</h6><br>"+
						"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
							"<label for='expediente' class=' form-control-label'>Expediente</label>"+
							"<input type='text' id='expediente' name='expediente'"+
								"class='form-control' placeholder='Expediente' >"+
						"</div>"+
						"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
						"</div>"+
						"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
							"<label for='fecha_apertura' class=' form-control-label'>Fecha "+
								"de Apertura</label> <input type='date' pattern='dd/mm/yyyy' id='fecha_apertura'"+
							" class='form-control'>"+
						"</div>"+
						"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
							"<label for='nss' class=' form-control-label'>Numero de"+
								" Seguro Social *</label> <input type='text' id='nss'"+
								"placeholder='Numero de seguro social' class='form-control'>"+
						"</div>"+
						"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
						"<label for='secretaria' class=' form-control-label'>Secretaria</label>"+
						"<input type='text' id='secretaria'"+
							"placeholder='Ingresa Secretaria' class='form-control'>"+
					    "</div>"+
						"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
						"<label for='fecha_elaboracion' class=' form-control-label'>Fecha Elaboracion</label>"+
						"<input type='date' pattern='dd/mm/yyyy' id='fecha_elaboracion'"+
							" class='form-control'>"+
					    "</div>"+
						"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
							"<br>"+
						"</div>"+
						"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
							"<br>"+
						"</div>"+
						"<div 	class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4 text-right'>"+
							"<button type='button' class='btn btn-outline-primary btn-sm' onclick='searchexpedient()'>"+
								"<i class='fa fa-search-plus'> </i>&nbsp; Buscar"+
							"</button>"+
						"</div>"+
					"</div>"+
				"</form><hr>"+
				
				"<table id='bootstrap-data-table' class='table table-striped table-bordered'>"+
                   "<thead>"+
                    "<tr>"+
                       "<th>Name</th>"+
                       "<th>Position</th>"+
                       "<th>Office</th>"+
                       "<th>Salary</th>"+
                      "</tr>"+
                    "</thead>"+
                    "<tbody>"+
                      "<tr>"+
                        "<td>Tiger Nixon</td>"+
                        "<td>System Architect</td>"+
                        "<td>Edinburgh</td>"+
                        "<td>$320,800</td>"+
                      "</tr>"+
                      "<tbody>"+
                      "</table>"+
				
			"</div>"+
		"</div>"+
	"</div>"+
"</div>");
	
	
	


}