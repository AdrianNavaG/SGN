function saveclient(){
	
	var apellidoPaterno = $('#apellido_pat').val();
	var apellidoMaterno = $('#apellido_mat').val();
	var nombre =$('#nombre').val();
	var fechaAlta = $("#fecha_alta").val();
	var fechaNacimiento = $("#fecha_nacimiento").val();
	var edad = $("#edad").val();
	var sexo = $("#sexo").val();
	var curp =$("#curp").val();
	var rfc = $("#rfc").val();
	
	var municipioNacimiento = $("#municipio_nacimiento").val();
	var estadoNacimiento = $("#estado_nacimiento").val();
	var ciudadNacimiento = $("#ciudad_nacimiento").val();
	var paisNacimiento = $("#pais_nacimiento").val();
	var docIdentificacion = $("#doc_identificacion").val();
	var noDocIdentificacion = $("#no_doc_identificacion").val();
	var tipoPasaporte = $("#tipo_de_pasaporte").val();
	var noFormaMigratoria = $("#no_forma_migratoria").val();
	var tipoFormaMigratoria = $("#tipo_forma_migratoria").val();
	var nombrePadre = $("#nombre_padre").val();
	var nombreMadre = $("#nombre_madre").val();
	var nacionalidadPadres = $("#nacionalidad_padres").val();
	var numeroIne = $("#numero_ine").val();
	var noPasaporteVigente = $("#no_pasaporte_vigente").val();
	
	var calle = $("#calle").val();
	var numero = $("#numero").val();
	var cp = $("#cp").val();
	var lote = $("#lote").val();
	var manzana = $("#manzana").val();
	var predio = $("#predio").val();
	var colonia = $("#colonia").val();
	var municipio = $("#municipio").val();
	var estado = $("#estado").val();
	var ciudad = $("#ciudad").val();
	var pais = $("#pais").val();
	var nacionalidad = $("#nacionalidad").val();
	var profesionOcupacion = $("#profesion_ocupacion").val();
	var estadoCivil = $("#estado_civil").val();
	var telOficina = $("#tel_oficina").val();
	var telParticular = $("#tel_particular").val();
	var email = $("#email").val();
	var paginaWeb = $("#pagina_web").val();
	var conyuge = $("#conyuge").val();
	var regConyugal = $("#reg_conyugal").val();
	var tipoPersona = $("#tipo_persona").val();
	var poblacion = $("#poblacion").val();
	var entidad = $("#entidad").val();

	
	$.ajax({
		type: "POST",
		url: "cliente/save" ,
		data:{
			apellidoPaterno:apellidoPaterno,
			apellidoMaterno:apellidoMaterno,
			nombre:nombre,
			fechaAlta:fechaAlta,
			fechaNacimiento:fechaNacimiento,
			edad:edad,
			sexo:sexo,
			curp:curp,
			rfc:rfc,
			municipioNacimiento:municipioNacimiento,
			estadoNacimiento:estadoNacimiento,
			ciudadNacimiento:ciudadNacimiento,
			paisNacimiento:paisNacimiento,
			docIdentificacion:docIdentificacion,
			noDocIdentificacion:noDocIdentificacion,
			tipoPasaporte:tipoPasaporte,
			noFormaMigratoria:noFormaMigratoria,
			tipoFormaMigratoria:tipoFormaMigratoria,
			nombrePadre:nombrePadre,
			nombreMadre:nombreMadre,
			nacionalidadPadres:nacionalidadPadres,
			numeroIne:numeroIne,
			noPasaporteVigente:noPasaporteVigente,
			calle:calle,
			numero:numero,
			cp:cp,
			lote:lote,
			manzana:manzana,
			predio:predio,
			colonia:colonia,
			municipio:municipio,
			estado:estado,
			ciudad:ciudad,
			pais:pais,
			nacionalidad:nacionalidad,
			profesionOcupacion:profesionOcupacion,
			estadoCivil:estadoCivil,
			telOficina:telOficina,
			telParticular:telParticular,
			email:email,
			paginaWeb:paginaWeb,
			conyuge:conyuge,
			regConyugal:regConyugal,
			tipoPersona:tipoPersona,
			poblacion:poblacion,
			entidad:entidad
			
			
		},
		
		success: function (response){
			if(response==1)
				$( "#labelModal" ).text( SUCCESS_SAVE_CLIENTE );
			else
				$( "#labelModal" ).text( ERROR_SAVE_CLIENTE );

			$( "#modalAlert" ).trigger( "click" );
		}
	});
}