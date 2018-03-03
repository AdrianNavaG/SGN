package com.sssolutions.sgn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sssolutions.sgn.dao.Cliente;
import com.sssolutions.sgn.dao.Expediente;
import com.sssolutions.sgn.service.IClientService;
import com.sssolutions.sgn.util.Util;

@Controller
@RequestMapping("/cliente")
public class ClientController {
	
	@Autowired
	IClientService clienteService;
	
	
	@PostMapping("/save")
	@ResponseBody
	public int saveclient(@RequestParam("nombre") String nombre,
			@RequestParam("apellidoPaterno") String apellidoPaterno,
			@RequestParam("apellidoMaterno") String apellidoMaterno,
			@RequestParam("fechaAlta") String fechaAlta,
			@RequestParam("fechaNacimiento") String fechaNacimiento,
			@RequestParam("edad") int edad,
			@RequestParam("sexo") String sexo,
			@RequestParam("curp") String curp,
			@RequestParam("rfc") String rfc,
			@RequestParam("municipioNacimiento") String municipioNacimiento,
			@RequestParam("estadoNacimiento") String estadoNacimiento,
			@RequestParam("ciudadNacimiento") String ciudadNacimiento,
			@RequestParam("paisNacimiento") String paisNacimiento,
			@RequestParam("docIdentificacion") String docIdentificacion,
			@RequestParam("noDocIdentificacion") String noDocIdentificacion,
			@RequestParam("tipoPasaporte") String tipoPasaporte,
			@RequestParam("noFormaMigratoria") String noFormaMigratoria,
			@RequestParam("tipoFormaMigratoria") String tipoFormaMigratoria,
			@RequestParam("nombrePadre") String nombrePadre,
			@RequestParam("nombreMadre") String nombreMadre,
			@RequestParam("nacionalidadPadres") String nacionalidadPadres,
			@RequestParam("numeroIne") String numeroIne,
			@RequestParam("noPasaporteVigente") String noPasaporteVigente,
			@RequestParam("calle") String calle,
			@RequestParam("numero") String numero,
			@RequestParam("cp") int cp,
			@RequestParam("lote") String lote,
			@RequestParam("manzana") String manzana,
			@RequestParam("predio") String predio,
			@RequestParam("colonia") String colonia,
			@RequestParam("municipio") String municipio,
			@RequestParam("estado") String estado,
			@RequestParam("ciudad") String ciudad,
			@RequestParam("pais") String pais,
			@RequestParam("nacionalidad") String nacionalidad,
			@RequestParam("profesionOcupacion") String profesionOcupacion,
			@RequestParam("estadoCivil") String estadoCivil,
			@RequestParam("telOficina") String telOficina,
			@RequestParam("telParticular") String telParticular,
			@RequestParam("email") String email,
			@RequestParam("paginaWeb") String paginaWeb,
			@RequestParam("conyuge") String conyuge,
			@RequestParam("regConyugal") String regConyugal,
			@RequestParam("tipoPersona") String tipoPersona,
			@RequestParam("poblacion") String poblacion,
			@RequestParam("entidad") String entidad
			
			
			) {
		
		Cliente clienteDao = new Cliente();
		clienteDao.setNombre(nombre);
		clienteDao.setApellidoPaterno(apellidoPaterno);
		clienteDao.setApellidoMaterno(apellidoMaterno);
		clienteDao.setFechaAlta(Util.dateConvert(fechaAlta));
		clienteDao.setFechaNacimiento(Util.dateConvert(fechaNacimiento));
		clienteDao.setEdad(edad);
		clienteDao.setSexo(sexo);
		clienteDao.setCurp(curp);
		clienteDao.setRfc(rfc);
		clienteDao.setMunicipioNacimiento(municipioNacimiento);
		clienteDao.setEstadoNacimiento(estadoNacimiento);
		clienteDao.setCiudadNacimiento(ciudadNacimiento);
		clienteDao.setPaisNacimiento(paisNacimiento);
		clienteDao.setDocIdentificacion(docIdentificacion);
		clienteDao.setNoDocIdentificacion(noDocIdentificacion);
		clienteDao.setTipoPasaporte(tipoPasaporte);
		clienteDao.setNoFormaMigratoria(noFormaMigratoria);
		clienteDao.setTipoFormaMigratoria(tipoFormaMigratoria);
		clienteDao.setNombrePadre(nombrePadre);
		clienteDao.setNombreMadre(nombreMadre);
		clienteDao.setNacionalidadPadres(nacionalidadPadres);
		clienteDao.setNumeroIne(numeroIne);
		clienteDao.setNoPasaporteVigente(noPasaporteVigente);
		clienteDao.setCalle(calle);
		clienteDao.setNumero(numero);
		clienteDao.setCp(cp);
		clienteDao.setLote(lote);
		clienteDao.setManzana(manzana);
		clienteDao.setPredio(predio);
		clienteDao.setColonia(colonia);
		clienteDao.setMunicipio(municipio);
		clienteDao.setEstado(estado);
		clienteDao.setCiudad(ciudad);
		clienteDao.setPais(pais);
		clienteDao.setNacionalidad(nacionalidad);
		clienteDao.setProfesionOcupacion(profesionOcupacion);
		clienteDao.setEstadoCivil(estadoCivil);
		clienteDao.setTelOficina(telOficina);
		clienteDao.setTelParticular(telParticular);
		clienteDao.setEmail(email);
		clienteDao.setPaginaWeb(paginaWeb);
		clienteDao.setConyuge(conyuge);
		clienteDao.setRegConyugal(regConyugal);
		clienteDao.setTipoPersona(tipoPersona);
		clienteDao.setPoblacion(poblacion);
		clienteDao.setEntidad(entidad);
		
		
		
		int save = clienteService.saveClient(clienteDao);
		 
	    String view = "fallido";
	    if(save==1) {
	    	view="exitoso";
	    }
	    System.out.println("Resultado: "+view);
		
		return save;
	}
	@PostMapping("/search")
	@ResponseBody 
	public List<Cliente> searchClient(@RequestParam("cliente") String nombreCompleto

			){
				
	    Cliente clienteDao = new Cliente();
//	    clienteDao.setNombreCompleto(cliente);
	    clienteDao.setNombreCompleto(nombreCompleto);
	    
	    List<Cliente> clienteDaoResponse = clienteService.searchClient(clienteDao);
	    
		return clienteDaoResponse;
	}
	
}


