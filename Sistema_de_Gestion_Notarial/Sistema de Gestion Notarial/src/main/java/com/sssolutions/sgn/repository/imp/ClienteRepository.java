package com.sssolutions.sgn.repository.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sssolutions.sgn.dao.Cliente;
import com.sssolutions.sgn.dao.Expediente;
import com.sssolutions.sgn.repository.IClienteRepository;


@Repository
public class ClienteRepository implements IClienteRepository{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int saveClient(Cliente cliente) {
		
		String sql = "insert into clientes (id_cliente, apellido_pat, apellido_mat, nombre,fecha_alta,fecha_nacimiento,edad,sexo,curp,rfc,municipio_nacimiento,estado_nacimiento,ciudad_nacimiento,pais_nacimiento,doc_identificacion,"
				+ "no_doc_identificacion,tipo_de_pasaporte,no_forma_migratoria,tipo_forma_migratoria,nombre_padre,nombre_madre,nacionalidad_padres,numero_ine,no_pasaporte_vigente,"
				+ "calle,numero,cp,lote,manzana,predio,colonia,municipio,estado,ciudad,pais,nacionalidad,profesion_ocupacion,estado_civil,tel_oficina,tel_particular,email,pagina_web,conyuge,reg_conyugal,tipo_persona,poblacion,entidad,nombre_completo)"+
		    	 " values (1,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		int save = jdbcTemplate.update(
			    sql,
			    new Object[]{
			    	cliente.getApellidoPaterno(),
			    	cliente.getApellidoMaterno(),
			    	cliente.getNombre(),
			    	cliente.getFechaAlta(),
			    	cliente.getFechaNacimiento(),
			    	cliente.getEdad(),
			    	cliente.getSexo(),
			    	cliente.getCurp(),
			    	cliente.getRfc(),
			    	cliente.getMunicipioNacimiento(),
			    	cliente.getEstadoNacimiento(),
			    	cliente.getCiudadNacimiento(),
			    	cliente.getPaisNacimiento(),
			    	cliente.getDocIdentificacion(),
			    	cliente.getNoDocIdentificacion(),
			    	cliente.getTipoPasaporte(),
			    	cliente.getNoFormaMigratoria(),
			    	cliente.getTipoFormaMigratoria(),
			    	cliente.getNombrePadre(),
			    	cliente.getNombreMadre(),
			    	cliente.getNacionalidadPadres(),
			    	cliente.getNumeroIne(),
			    	cliente.getNoPasaporteVigente(),
			    	cliente.getCalle(),
			    	cliente.getNumero(),
			    	cliente.getCp(),
			    	cliente.getLote(),
			    	cliente.getManzana(),
			    	cliente.getPredio(),
			    	cliente.getColonia(),
			    	cliente.getMunicipio(),
			    	cliente.getEstado(),
			    	cliente.getCiudad(),
			    	cliente.getPais(),
			    	cliente.getNacionalidad(),
			    	cliente.getProfesionOcupacion(),
			    	cliente.getEstadoCivil(),
			    	cliente.getTelOficina(),
			    	cliente.getTelParticular(),
			    	cliente.getEmail(),
			    	cliente.getPaginaWeb(),
			    	cliente.getConyuge(),
			    	cliente.getRegConyugal(),
			    	cliente.getTipoPersona(),
			    	cliente.getPoblacion(),
			    	cliente.getEntidad(),
			    	cliente.getNombre().replaceAll("\\s*$","") + " " + cliente.getApellidoPaterno().replaceAll("\\s*$","") + " " + cliente.getApellidoMaterno().replaceAll("\\s*$","")
				}
				);
		
		
		return save;
		
	}
	
	@Override
	public List<Cliente> searchClient(Cliente cliente) {
	
		String sql = "SELECT " + 
				"id_cliente, " + 
				"apellido_pat, " + 
				"apellido_mat, " + 
				"nombre, " + 
				"fecha_alta, " + 
				"fecha_nacimiento, " +
				"edad, " +
				"sexo, " +
				"curp, " +
				"rfc, " +
				"municipio_nacimiento, " +
				"estado_nacimiento, " +
				"ciudad_nacimiento, " +
				"pais_nacimiento, " +
				"doc_identificacion," +
				"no_doc_identificacion, " +
				"tipo_de_pasaporte, " +
				"no_forma_migratoria, " +
				"tipo_forma_migratoria, " +
				"nombre_padre, " +
				"nombre_madre, " +
				"nacionalidad_padres, " +
				"numero_ine, " +
				"no_pasaporte_vigente, " +
				"calle, " +
				"numero, " +
				"cp, " +
				"lote, " +
				"manzana, " +
				"predio, " +
				"colonia, " +
				"municipio, " +
				"estado, " +
				"ciudad, " +
				"pais, " +
				"nacionalidad, " + 
				"profesion_ocupacion, " +
				"estado_civil, " +
				"tel_oficina, " +
				"tel_particular, " +
				"email, " +
				"pagina_web, " +
				"conyuge, " +
				"reg_conyugal, " +
				"tipo_persona, " +
				"poblacion, " +
				"entidad, " +
				"nombre_completo " + 
				"FROM CLIENTES WHERE nombre_completo like '%"+cliente.getNombreCompleto()+"%'";
		
		List<Cliente> result = jdbcTemplate.query(
				sql,
			(rs, rowNum) -> new Cliente(
					rs.getInt("id_cliente"), 
					rs.getString("apellido_pat"), 
					rs.getString("apellido_mat"), 
					rs.getString("nombre"),
					rs.getString("fecha_alta"),
					rs.getString("fecha_nacimiento"),
					rs.getInt("edad"),
					rs.getString("sexo"),
					rs.getString("curp"),
					rs.getString("rfc"),
					rs.getString("municipio_nacimiento"),
					rs.getString("estado_nacimiento"),
					rs.getString("ciudad_nacimiento"),
					rs.getString("pais_nacimiento"),
					rs.getString("doc_identificacion"),
					rs.getString("no_doc_identificacion"),
					rs.getString("tipo_de_pasaporte"),
					rs.getString("no_forma_migratoria"),
					rs.getString("tipo_forma_migratoria"),
					rs.getString("nombre_padre"),
					rs.getString("nombre_madre"),
					rs.getString("nacionalidad_padres"),
					rs.getString("numero_ine"),
					rs.getString("no_pasaporte_vigente"),
					rs.getString("calle"),
					rs.getString("numero "),
					rs.getInt("cp"),
					rs.getString("lote"),
					rs.getString("manzana"),
					rs.getString("predio"),
					rs.getString("colonia"),
					rs.getString("municipio"),
					rs.getString("estado"),
					rs.getString("ciudad"),
					rs.getString("pais "),
					rs.getString("nacionalidad "),
					rs.getString("profesion_ocupacion"),
					rs.getString("estado_civil"),
					rs.getString("tel_oficina"),
					rs.getString("tel_particular"),
					rs.getString("email"),
					rs.getString("pagina_web"),
					rs.getString("conyuge"),
					rs.getString("reg_conyugal"),
					rs.getString("tipo_persona"),
					rs.getString("poblacion"),
					rs.getString("entidad"),
					rs.getString("nombre_completo")));
		
		return result;
	}
	
	
	
}
