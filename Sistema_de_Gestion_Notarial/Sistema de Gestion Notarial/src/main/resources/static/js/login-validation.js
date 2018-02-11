
function validar(){
	
	var user = $("#form-username").val();
	var password = $("#form-password").val();

	$.ajax({
		type: "POST",
		url: "validation", 
		data:{ 
			useretiqueta:user, 
			passwordetiqueta:password},
		success: function(response){
//			$("#result").html(response);
		}
	});
}