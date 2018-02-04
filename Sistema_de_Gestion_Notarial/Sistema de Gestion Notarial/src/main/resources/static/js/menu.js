
function altaexpediente(){	
	$('#contenedor').html("<div id='alta-expediente-div'>"+
	"<div class='row'>"+
		"<div class='col-lg-12'>"+
			"<div class='card'>"+
				"<form action=''>"+
					"<div class='card-header'>"+
						"<strong>Alta de Expediente</strong>"+
					"</div>"+
					"<div class='card-body card-block'>"+
						"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
							"<label for='expediente' class=' form-control-label'>Expediente</label>"+
							"<input type='text' id='expediente' name='expediente'"+
								"class='form-control' placeholder='Nuevo' readonly>"+
						"</div>"+
						"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
						"</div>"+
						"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
							"<label for='fecha_apertura' class=' form-control-label'>Fecha "+
								"de Apertura</label> <input type='text' id='fecha_apertura'"+
								"class='form-control' value='"+$("#today").val()+"' readonly>"+
						"</div>"+
						"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
							"<label for='nss' class=' form-control-label'>Numero de"+
								" Seguro Social</label> <input type='text' id='nss'"+
								"placeholder='Numero de seguro social' class='form-control'>"+
						"</div>"+
						"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
							"<label for='credito' class='form-control-label'>Cr&eacutedito</label>"+
								"<input type='text' id='credito' placeholder='Ingresa Credito'"+
								"class='form-control'>"+
						"</div>"+
						"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
							"<label for='otorgante' class=' form-control-label'>Otorgante</label>"+
							"<input type='text' id='otorgante' placeholder='Ingresa Otorgante'"+
								"class='form-control'>"+
						"</div>"+
						"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
							"<label for='operacion' class=' form-control-label'>Operaci&oacuten</label>"+
							"<input type='text' id='operacion' placeholder='Ingresa Operacion'"+
								"class='form-control'>"+
						"</div>"+
						"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
							"<label for='responsable' class=' form-control-label'>Responsable</label>"+
							"<input type='text' id='responsable'"+
								"placeholder='Ingresa Responsable' class='form-control'>"+
						"</div>"+
						"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
							"<br>"+
						"</div>"+
						"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
							"<br>"+
						"</div>"+
						"<div 	class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4 text-right'>"+
							"<button type='button' class='btn btn-outline-primary btn-sm' onclick='saveexpedient()'>"+
								"<i class='fa fa-save (alias)'> </i>&nbsp; Guardar"+
							"</button>"+
						"</div>"+
					"</div>"+
				"</form>"+
			"</div>"+
		"</div>"+
	"</div>"+
"</div>");

}