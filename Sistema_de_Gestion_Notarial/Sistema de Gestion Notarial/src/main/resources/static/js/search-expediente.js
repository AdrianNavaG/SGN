
function searchexpedient(){
	
	var expediente = $('#expediente').val();
//	var fechaApertura = $('#fecha_apertura').val();
//	var nss = $('#nss').val();;
//	var secretaria = $('#secretaria').val();
//	var fechaElaboracion = $('#fecha_elaboracion').val();

	$.ajax({
		type: "POST",
		url: "expediente/search", 
		data:{ 
			expediente:expediente
//			fechaApertura:fechaApertura,
		
		},
		success: function(response){
			
			if(response.length>=1){
				$( "#labelModal" ).text( "hay expedientes" );
				
				for (i=0; i< response.length; i++){

					var recursiveEncoded = $.param( response[i] );
					$('#tableexpediente tr:last').after("<tr><td>" + response[i].expediente +
					"</td>"+"<td>" + response[i].fecha + "</td>"+
					"</td>"+"<td>" + response[i].nss + "</td>"+
					"</td>"+"<td>" + response[i].otorgante + "</td>" +
					"<td></div>"+
					"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4 text-right'>" +
						"<button type='button' class='btn btn-outline-primary btn-sm' onclick='selectexpedient(\"" + recursiveEncoded + "\")'>" +
							"<i class='fa fa-search-plus'> </i>&nbsp; Seleccionar"+
						"</button>"+
					"</div></td>"+
					"</tr>"
					);					
					
				}

			}				
			else{
				$( "#labelModal" ).text( "No hay expedientes" );
			}

			$( "#modalAlert" ).trigger( "click" );
			
			

//			for (i=0; i< response.length; i++){
//				alert(response[i].expediente);
//				alert(response[i].fecha);
//				alert(response[i].nss);
//				alert(response[i].otorgante);
//			}
		}
	});

}

function selectexpedient(expediente){
	var expedienteArray = expediente.split("&");
	var expedienteArrayFinal = new Array();
	for (i = 0; i < expedienteArray.length; i++) { 
	    var expedienteArrayAux = expedienteArray[i].split("=");
//	    console.log("val1: "+expedienteArrayAux[0]);
//	    console.log("val2: "+expedienteArrayAux[1]);
	    expedienteArrayFinal[i]=expedienteArrayAux[1];
	}
	
	
	for (i = 0; i < expedienteArrayFinal.length; i++) { 
	   alert(expedienteArrayFinal[i]);
	}
	
	$('#contenedor').html("<div id='alta-expediente-div'>"+
			"<div class='row'>"+
				"<div class='col-lg-12'>"+
					"<div class='card'>"+
						"<form action=''>"+
							"<div class='card-header'>"+
								"<strong>Expediente "+expedienteArrayFinal[1]+"</strong>"+
							"</div>"+
							"<div class='card-body card-block'>"+
							"<h6>Los campos marcados con asterisco (*) son obligatorios.</h6><br>"+
								"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
									"<label for='expediente' class=' form-control-label'>Expediente</label>"+
									"<input type='text' id='expediente' name='expediente'"+
										"class='form-control' value='"+expedienteArrayFinal[1]+"' readonly>"+
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
										" Seguro Social *</label> <input type='text' id='nss'"+
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
								"<label for='secretaria' class=' form-control-label'>Secretaria</label>"+
								"<input type='text' id='secretaria'"+
									"placeholder='Ingresa Secretaria' class='form-control'>"+
							    "</div>"+
								"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
								"<label for='recomendante' class=' form-control-label'>Recomendante</label>"+
								"<input type='text' id='recomendante'"+
									"placeholder='Ingresa Recomendante' class='form-control'>"+
							    "</div>"+
								"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
								"<label for='tipoexpediente' class=' form-control-label'>Tipo Expediente</label>"+
								"<input type='text' id='tipo_expediente'"+
									"placeholder='Ingresa Tipo de Expediente' class='form-control'>"+
							    "</div>"+
								"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
								"<label for='municipio' class=' form-control-label'>Municipio</label>"+
								"<input type='text' id='municipio'"+
									"placeholder='Ingresa Municipio' class='form-control'>"+
							    "</div>"+
								"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
								"<div>"+
								"<label for ='antilavado' class='form-control-label'> Anti-Lavado </label>"+
								"</div>"+
								//"<label class='switch switch-3d switch-info mr-3'>"+
								"<input type='checkbox' value='' id='antilavado' align='left'>"+
								//"<span class='switch-label'></span>" +
								//"<span class='switch-handle'></span>"+
								"</label>"+
							    "</div>"+
								"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
								"<div>"+
								"<label for ='vulnerable' class='form-control-label'> Vulnerable </label>"+
								"</div>"+
								"<input type='checkbox' value='' id='vulnerable' align='left'>"+
								"</label>"+
							    "</div>"+
								"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
								"<div>"+
								"<label for ='nopaso' class='form-control-label'> NoPaso </label>"+
								"</div>"+
								"<input type='checkbox' value='' id='nopaso' align='left'>"+
								"</label>"+
							    "</div>"+
								"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
								"<label for='actividad' class=' form-control-label'>Actividad</label>"+
								"<input type='text' id='actividad'"+
									"placeholder='Ingresa Actividad' class='form-control'>"+
							    "</div>"+
								"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
								"<label for='estatus' class='form-control-label'>Estatus</label>"+
								"<input type='text' id='estatus'"+
									"placeholder='Ingresa Estatus' class='form-control'>"+
							    "</div>"+
								"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
								"<label for='instrumento' class='form-control-label'>Instrumento</label>"+
								"<input type='number' min='0' id='instrumento'  onblur='validarNumero()' value='0'"+
									"placeholder='Ingresa Instrumento' class='form-control'>"+
							    "</div>"+
								"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
								"<label for='volumen' class='form-control-label'>Volumen</label>"+
								"<input type='number' value='0'id='volumen'"+
									"placeholder='Ingresa Volumen' class='form-control'>"+
							    "</div>"+
								"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
								"<label for='folio_inicial' class='form-control-label'>Folio Inicial</label>"+
								"<input type='number' value='0' id='folio_inicial'"+
									"placeholder='Ingresa Folio Inicial' class='form-control'>"+
							    "</div>"+
								"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
								"<label for='folio_final' class='form-control-label'>Folio Final</label>"+
								"<input type='number' value='0' id='folio_final'"+
									"placeholder='Ingresa Folio Final' class='form-control'>"+
							    "</div>"+
								"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
								"<label for='fecha_elaboracion' class='form-control-label'>Fecha Elaboracion</label>"+
								"<input type='date' pattern='dd/mm/yyyy' id='fecha_elaboracion'"+
									" class='form-control'>"+
							    "</div>"+
								"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
								"<label for='entrega_escritura' class='form-control-label'>Entrega Escritura</label>"+
								"<input type='date' pattern='dd/mm/yyyy' id='entrega_escritura'"+
									" class='form-control'>"+
							    "</div>"+
								"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
								"<label for='revision' class=' form-control-label'>Revision</label>"+
								"<input type='date' pattern='dd/mm/yyyy' id='revision'"+
									" class='form-control'>"+
							    "</div>"+
								"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
								"<label for='apendice' class='form-control-label'>Apendice</label>"+
								"<input type='date' pattern='dd/mm/yyyy' id='apendice'"+
									" class='form-control'>"+
							    "</div>"+
								"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
								"<label for='revisada' class='form-control-label'>Revisada</label>"+
								"<input type='date' pattern='dd/mm/yyyy' id='revisada'"+
									" class='form-control'>"+
							    "</div>"+
								"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
								"<label for='fecha_firma' class='form-control-label'>Fecha Firma</label>"+
								"<input type='date' pattern='dd/mm/yyyy' id='fecha_firma'"+
									" class='form-control'>"+
							    "</div>"+
								"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
								"<label for='fecha_instrumento' class='form-control-label'>Fecha Instrumento</label>"+
								"<input type='date' pattern='dd/mm/yyyy' id='fecha_instrumento'"+
									" class='form-control'>"+
							    "</div>"+
								"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
								"<label for='fid' class='form-control-label'>FID</label>"+
								"<input type='text' id='fid'"+
									" class='form-control'>"+	
								"<div class='row col-sm-12'>"+
								"<label for='observaciones' class='form-control-label'>Observaciones</label>"+
						        "<textarea id='observaciones' rows='6' cols='40'></textarea>"+
							    "</div>"+
								"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
									"<br>"+
								"</div>"+
								"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
									"<br>"+
							    "</div>"+
							    "</div>"+
								    
								"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4 text-right'>"+
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



