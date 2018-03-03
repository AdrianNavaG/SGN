
function saveexpedient(){

	var expediente = $('#expediente').val();
	var fechaApertura = $('#fecha_apertura').val();
	var nss = $('#nss').val();
	var credito = $('#credito').val();
	var otorgante = $('#otorgante').val();
	var operacion = $('#operacion').val();
	var responsable = $('#responsable').val();
	var secretaria = $('#secretaria').val();
	var recomendante = $('#recomendante').val();
	var antilavado = 0;
	var vulnerable = 0;
	var nopaso = 0;
	var tipoExpediente = $('#tipo_expediente').val();
	var municipio = $('#municipio').val();
	var actividad = $('#actividad').val();
	var estatus = $('#estatus').val();
	var instrumento = $('#instrumento').val();
	var volumen = $('#volumen').val();
	var folioInicial = $('#folio_inicial').val();
	var folioFinal = $('#folio_final').val();
	var fechaElaboracion = $('#fecha_elaboracion').val();
	var entregaEscritura = $('#entrega_escritura').val();
	var revision = $('#revision').val();
	var apendice = $('#apendice').val();
	var revisada = $('#revisada').val();
	var fechaFirma = $('#fecha_firma').val();
	var fechaInstrumento = $('#fecha_instrumento').val();
	var fid = $('#fid').val();
	var observaciones = $('#observaciones').val();


	if ($('#antilavado').is(':checked') ) {
		antilavado =1;
	}
	if ($('#vulnerable').is(':checked') ) {
		vulnerable =1;
	}
	if ($('#nopaso').is(':checked') ) {
		nopaso =1;
	}
	


	$.ajax({
		type: "POST",
		url: "expediente/save", 
		data:{ 
			expediente:expediente, 
			fechaApertura:fechaApertura,
			nss:nss,
			credito:credito,
			otorgante:otorgante,
			operacion:operacion,
			responsable:responsable,
			secretaria:secretaria,
			recomendante:recomendante,
			antilavado:antilavado,
			vulnerable:vulnerable,
			nopaso:nopaso,
			tipoExpediente:tipoExpediente,
			municipio:municipio,
			actividad:actividad,
			estatus:estatus,
			instrumento:instrumento,
			volumen:volumen,
			folioInicial:folioInicial,
			folioFinal:folioFinal,
			fechaElaboracion:fechaElaboracion,
			entregaEscritura:entregaEscritura,
			revision:revision,
			apendice:apendice,
			revisada:revisada,
			fechaFirma:fechaFirma,
			fechaInstrumento:fechaInstrumento,
			fid:fid,
			observaciones:observaciones

		},
		success: function(response){
			if(response==1)
				$( "#labelModal" ).text( SUCCESS_SAVE_EXPEDIENTE );
			else
				$( "#labelModal" ).text( ERROR_SAVE_EXPEDIENTE );

			$( "#modalAlert" ).trigger( "click" );
		}
//		error: function (response) {
////			alert(request.responseText);
//			$( "#labelModal" ).text( ERROR_SAVE_EXPEDIENTE);
//			$( "#modalAlert" ).trigger( "click" );
//		}
	});

}



function reescribirexpedient(){
	
	var expediente = $('#expediente').val();
	var credito = $('#credito').val();
	
	
	$.ajax({
		type: "POST",
		url: "expediente/rewrite", 
		data:{ 
			expediente:expediente, 
			credito:credito
			
		},
	success: function(response){
		if(response==1)
			$( "#labelModal" ).text( SUCCESS_SAVE_EXPEDIENTE );
		else
			$( "#labelModal" ).text( ERROR_SAVE_EXPEDIENTE );

		$( "#modalAlert" ).trigger( "click" );
		
	}
	});
}