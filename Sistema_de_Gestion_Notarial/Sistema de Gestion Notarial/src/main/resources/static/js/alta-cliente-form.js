function altacliente(){	
	$('#contenedor').html("<div id='alta-cliente-div'>"+
	"<div class='row'>"+
		"<div class='col-lg-12'>"+
			"<div class='card'>"+
				"<form action=''>"+
				
					"<div class='card-header'>"+
						"<strong>Alta de Clientes</strong>"+
					"</div>"+
					"<div class='card-body card-block'>"+
					"<h6>Los campos marcados con asterisco (*) son obligatorios.</h6><br>"+
					
					"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
					"<label for='id_cliente' class=' form-control-label'>Id Cliente</label>"+
					"<input type='text' id='id_cliente' name='id_cliente'"+
						"class='form-control' placeholder='Nuevo' readonly>"+
				    "</div>"+
				    
					"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
					"</div>"+
					"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
					"<label for='fecha_alta' class=' form-control-label'>Fecha "+
						"Alta</label> <input type='text' id='fecha_alta'"+
						"class='form-control' value='"+$("#today").val()+"' readonly>"+
				    "</div>"+
					
					"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
					"<label for='apellido_pat' class=' form-control-label'>Apellido Paterno</label>"+
					"<input type='text' id='apellido_pat' name='apellido_pat'"+
						"class='form-control' placeholder='Ingresa Apellido Paterno' >"+
				    "</div>"+
				    
					"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
					"<label for='apellido_mat' class=' form-control-label'>Apellido Materno</label>"+
					"<input type='text' id='apellido_mat' name='apellido_mat'"+
						"class='form-control' placeholder='Ingresa Apellido Materno' >"+
				    "</div>"+
				    
					"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
					"<label for='nombre' class=' form-control-label'>Nombre(s)</label>"+
					"<input type='text' id='nombre' name='nombre'"+
						"class='form-control' placeholder='Ingresa Nombre' >"+
				    "</div>"+
				    
					"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
					"<label for='fecha_nacimiento' class='form-control-label'>Fecha de Nacimiento</label>"+
					"<input type='date' pattern='dd/mm/yyyy' id='fecha_nacimiento'"+
						" class='form-control'>"+
				    "</div>"+
				    
					"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
					"<label for='edad' class=' form-control-label'>Edad</label>"+
					"<input type='number' value ='0' min ='0' id='edad' name='edad'"+
						"class='form-control' >"+
				    "</div>"+
				    
					"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
					"<label for='sexo' class=' form-control-label'>Sexo</label>"+
					"<input type='text' id='sexo' name='sexo'"+
						"class='form-control' placeholder='Ingresa Sexo' >"+
				    "</div>"+
				    
					"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
					"<label for='curp' class=' form-control-label'>CURP</label>"+
					"<input type='text' id='curp' name='curp'"+
						"class='form-control' placeholder='Ingresa CURP' >"+
				    "</div>"+
				    
					"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4 '>"+
					"<label for='rfc' class=' form-control-label'>RFC</label>"+
					"<input type='text' id='rfc' name='rfc'"+
						"class='form-control' placeholder='Ingresa RFC' >"+
				    "</div>"+
				
				    "<div class='form-group col-xs-10 col-sm-12'>"+
				    " Datos del lugar de nacimiento <hr>"+
				    "</div>"+
				    
					"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
					"<label for='municipio_nacimiento' class=' form-control-label'>Municipio</label>"+
					"<input type='text' id='municipio_nacimiento' name='municipio_nacimiento'"+
						"class='form-control' placeholder='Ingresa municipio' >"+
				    "</div>"+
				    
					"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
					"<label for='estado_nacimiento' class=' form-control-label'>Estado</label>"+
					"<input type='text' id='estado_nacimiento' name='estado_nacimiento'"+
						"class='form-control' placeholder='Ingresa estado' >"+
				    "</div>"+
				    
					"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4 '>"+
					"<label for='ciudad_nacimiento' class=' form-control-label'>Ciudad</label>"+
					"<input type='text' id='ciudad_nacimiento' name='ciudad_nacimiento'"+
						"class='form-control' placeholder='Ingresa ciudad' >"+
				    "</div>"+
				    
					"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
					"<label for='pais_nacimiento' class=' form-control-label'>Pa&iacutes</label>"+
					"<input type='text' id='pais_nacimiento' name='pais_nacimiento'"+
						"class='form-control' placeholder='Ingresa pais' >"+
				    "</div>"+
				    
					"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
					"<label for='doc_identificacion' class=' form-control-label'>Doc. Identificaci&oacuten</label>"+
					"<input type='text' id='doc_identificacion' name='doc_identificacion'"+
						"class='form-control' placeholder='Ingresa doc. de identificacion' >"+
				    "</div>"+
				    
					"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4 '>"+
					"<label for='no_doc_identificacion' class=' form-control-label'>No. Doc. Identificaci&oacuten</label>"+
					"<input type='text' id='no_doc_identificacion' name='no_doc_identificacion'"+
						"class='form-control' placeholder='Ingresa No. de doc. de identificacion' >"+
				    "</div>"+
				    
					"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
					"<label for='tipo_de_pasaporte' class=' form-control-label'>Tipo de Pasaporte</label>"+
					"<input type='text' id='tipo_de_pasaporte' name='tipo_de_pasaporte'"+
						"class='form-control' placeholder='Ingresa tipo de pasaporte' >"+
				    "</div>"+
				    
					"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
					"<label for='no_forma_migratoria' class=' form-control-label'>No. de Forma Migratoria</label>"+
					"<input type='text' id='no_forma_migratoria' name='no_forma_migratoria'"+
						"class='form-control' placeholder='Ingresa No. de forma migratoria' >"+
				    "</div>"+
				    
					"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4 '>"+
					"<label for='tipo_forma_migratoria' class=' form-control-label'>Tipo de Forma Migratoria</label>"+
					"<input type='text' id='tipo_forma_migratoria' name='tipo_forma_migratoria'"+
						"class='form-control' placeholder='Ingresa tipo de forma migratoria' >"+
				    "</div>"+
				    
					"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
					"<label for='nombre_padre' class=' form-control-label'>Nombre del Padre</label>"+
					"<input type='text' id='nombre_padre' name='nombre_padre'"+
						"class='form-control' placeholder='Ingresa Nombre' >"+
				    "</div>"+
				    
					"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
					"<label for='nombre_madre' class=' form-control-label'>Nombre de la Madre</label>"+
					"<input type='text' id='nombre_madre' name='nombre_madre'"+
						"class='form-control' placeholder='Ingresa Nombre' >"+
				    "</div>"+
				    
					"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4 '>"+
					"<label for='nacionalidad_padres' class=' form-control-label'>Nacionalidad de los Padres</label>"+
					"<input type='text' id='nacionalidad_padres' name='nacionalidad_padres'"+
						"class='form-control' placeholder='Ingresa Nacionalidad' >"+
				    "</div>"+
				    
					"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
					"<label for='numero_ine' class=' form-control-label'>Numero INE</label>"+
					"<input type='text' id='numero_ine' name='numero_ine'"+
						"class='form-control' placeholder='Ingresa INE' >"+
				    "</div>"+
				    
					"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
					"<label for='no_pasaporte_vigente' class=' form-control-label'>No. Pasaporte</label>"+
					"<input type='text' id='no_pasaporte_vigente' name='no_pasaporte_vigente'"+
						"class='form-control' placeholder='Ingresa No. de Pasaporte' >"+
				    "</div>"+

				    "<div class='form-group col-xs-10 col-sm-12'>"+
				    " Domicilio <hr>"+
				    "</div>"+
				    
					"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
					"<label for='calle' class=' form-control-label'>Calle</label>"+
					"<input type='text' id='calle' name='calle'"+
						"class='form-control' placeholder='Ingresa la calle' >"+
				    "</div>"+
				    
					"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
					"<label for='numero' class=' form-control-label'>Numero</label>"+
					"<input type='text' id='numero' name='numero'"+
						"class='form-control' placeholder='Ingresa numero' >"+
				    "</div>"+
				    
					"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
					"<label for='cp' class=' form-control-label'>CP</label>"+
					"<input type='number' id='cp' name='cp'"+
						"class='form-control' placeholder='Ingresa CP' >"+
				    "</div>"+
				    
					"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
					"<label for='lote' class=' form-control-label'>Lote</label>"+
					"<input type='text' id='lote' name='lote'"+
						"class='form-control' placeholder='Ingresa lote' >"+
				    "</div>"+
				    
					"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
					"<label for='manzana' class=' form-control-label'>Manzana</label>"+
					"<input type='text' id='manzana' name='manzana'"+
						"class='form-control' placeholder='Ingresa Manzana' >"+
				    "</div>"+
				    
					"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
					"<label for='predio' class=' form-control-label'>Predio</label>"+
					"<input type='text' id='predio' name='predio'"+
						"class='form-control' placeholder='Ingresa Predio' >"+
				    "</div>"+
				    
					"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
					"<label for='colonia' class=' form-control-label'>Colonia</label>"+
					"<input type='text' id='colonia' name='colonia'"+
						"class='form-control' placeholder='Ingresa Colonia' >"+
				    "</div>"+
				    
					"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
					"<label for='municipio' class=' form-control-label'>Municipio</label>"+
					"<input type='text' id='municipio' name='municipio'"+
						"class='form-control' placeholder='Ingresa Municipio' >"+
				    "</div>"+
				    
					"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
					"<label for='estado' class=' form-control-label'>Estado</label>"+
					"<input type='text' id='estado' name='estado'"+
						"class='form-control' placeholder='Ingresa Estado' >"+
				    "</div>"+
				    
					"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
					"<label for='ciudad' class=' form-control-label'>Ciudad</label>"+
					"<input type='text' id='ciudad' name='ciudad'"+
						"class='form-control' placeholder='Ingresa Ciudad' >"+
				    "</div>"+
				    
					"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
					"<label for='pais' class=' form-control-label'>Pais</label>"+
					"<input type='text' id='pais' name='pais'"+
						"class='form-control' placeholder='Ingresa Pais' >"+
				    "</div>"+
				    
					"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
					"<label for='nacionalidad' class=' form-control-label'>Nacionalidad</label>"+
					"<input type='text' id='nacionalidad' name='nacionalidad'"+
						"class='form-control' placeholder='Ingresa Nacionalidad' >"+
				    "</div>"+
				    
					"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
					"<label for='profesion_ocupacion' class=' form-control-label'>Profesion/Ocupacion</label>"+
					"<input type='text' id='profesion_ocupacion' name='profesion_ocupacion'"+
						"class='form-control' placeholder='Ingresa Profesion/Ocupacion' >"+
				    "</div>"+
				    
					"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
					"<label for='estado_civil' class=' form-control-label'>Estado Civil</label>"+
					"<input type='text' id='estado_civil' name='estado_civil'"+
						"class='form-control' placeholder='Ingresa Estado Civil' >"+
				    "</div>"+
				    
					"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
					"<label for='tel_oficina' class=' form-control-label'>Tel. Oficina</label>"+
					"<input type='text' id='tel_oficina' name='tel_oficina'"+
						"class='form-control' placeholder='Ingresa Tel. Oficina' >"+
				    "</div>"+
				    
					"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
					"<label for='tel_particular' class=' form-control-label'>Tel. Particular</label>"+
					"<input type='text' id='tel_particular' name='tel_particular'"+
						"class='form-control' placeholder='Ingresa Tel. Particular' >"+
				    "</div>"+
				    
					"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
					"<label for='email' class=' form-control-label'>Email</label>"+
					"<input type='text' id='email' name='email'"+
						"class='form-control' placeholder='Ingresa Email' >"+
				    "</div>"+
				    
					"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
					"<label for='pagina_web' class=' form-control-label'>Pagina web</label>"+
					"<input type='text' id='pagina_web' name='pagina_web'"+
						"class='form-control' placeholder='Ingresa Pagina Web' >"+
				    "</div>"+
				    
					"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
					"<label for='conyuge' class=' form-control-label'>Conyuge</label>"+
					"<input type='text' id='conyuge' name='conyuge'"+
						"class='form-control' placeholder='Ingresa Conyuge' >"+
				    "</div>"+
				    
					"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
					"<label for='reg_conyugal' class=' form-control-label'>Reg. Conyugal</label>"+
					"<input type='text' id='reg_conyugal' name='reg_conyugal'"+
						"class='form-control' placeholder='Ingresa Reg. Conyugal' >"+
				    "</div>"+
				    
					"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
					"<label for='tipo_persona' class=' form-control-label'>Tipo Persona</label>"+
					"<input type='text' id='tipo_persona' name='tipo_persona'"+
						"class='form-control' placeholder='Ingresa Tipo Persona' >"+
				    "</div>"+
				    
					"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
					"<label for='poblacion' class=' form-control-label'>Poblacion</label>"+
					"<input type='text' id='poblacion' name='poblacion'"+
						"class='form-control' placeholder='Ingresa Poblacion' >"+
				    "</div>"+
				    
					"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4'>"+
					"<label for='entidad' class=' form-control-label'>Entidad</label>"+
					"<input type='text' id='entidad' name='entidad'"+
						"class='form-control' placeholder='Ingresa Entidad' >"+
				    "</div>"+
				    
				    
					"<div class='form-group col-xs-10 col-sm-4 col-md-4 col-lg-4 text-right'>"+
					"<button type='button' class='btn btn-outline-primary btn-sm' onclick='saveclient()'>"+
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
