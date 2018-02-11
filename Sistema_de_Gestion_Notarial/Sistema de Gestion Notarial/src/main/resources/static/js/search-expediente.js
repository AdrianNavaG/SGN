

function searchexpedient(){

	var expediente = $('#expediente').val();
	var fechaApertura = $('#fecha_apertura').val();
	var nss = $('#nss').val();;
	var secretaria = $('#secretaria').val();
	var fechaElaboracion = $('#fecha_elaboracion').val();
	
	$.ajax({
		type: "POST",
		url: "expediente/search", 
		data:{ 
			expediente:expediente, 
			fechaApertura:fechaApertura,
		},
		success: function(response){
			if(response.size>=1){
				
			}				
			else{
				$( "#labelModal" ).text( "No hay expedientes" );
			}

			$( "#modalAlert" ).trigger( "click" );
		}
	});

}