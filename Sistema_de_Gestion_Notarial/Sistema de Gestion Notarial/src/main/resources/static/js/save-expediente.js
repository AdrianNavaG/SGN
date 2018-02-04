

function saveexpedient(){
	
	var expediente = $('#expediente').val();
	var fechaApertura = $('#fecha_apertura').val();
	var nss = $('#nss').val();
	var credito = $('#credito').val();
	var otorgante = $('#otorgante').val();
	var operacion = $('#operacion').val();
	var responsable = $('#responsable').val();
	
	
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
			responsable:responsable
			},
		success: function(response){
			$("#result").html(response);
		}
	});
	
}