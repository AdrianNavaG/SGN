package com.sssolutions.sgn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sssolutions.sgn.dao.Expediente;
import com.sssolutions.sgn.service.IExpedienteService;
import com.sssolutions.sgn.util.Util;

@Controller
@RequestMapping("/expediente")
public class ExpedientController {
	
	@Autowired
	IExpedienteService expedienteService;
	
	@PostMapping("/save")
	@ResponseBody 
	public int saveExpedient(@RequestParam("expediente") String expediente,
			@RequestParam("fechaApertura") String fechaApertura,
			@RequestParam("nss") String nss,
			@RequestParam("credito") String credito,
			@RequestParam("otorgante") String otorgante,
			@RequestParam("operacion") String operacion,
			@RequestParam("responsable") String responsable,
			@RequestParam("secretaria") String secretaria,
			@RequestParam("recomendante") String recomendante,
			@RequestParam("antilavado") String antilavado,
			@RequestParam("vulnerable") String vulnerable,
			@RequestParam("nopaso") String nopaso,
			@RequestParam("tipoExpediente") String tipoExpediente,
			@RequestParam("municipio") String municipio,
			@RequestParam("actividad") String actividad,
			@RequestParam("estatus") String estatus,
			@RequestParam("instrumento") int instrumento,
			@RequestParam("volumen") int volumen,
			@RequestParam("folioInicial") int folioInicial,
			@RequestParam("folioFinal") int folioFinal,
			@RequestParam("fechaElaboracion") String fechaElaboracion,
			@RequestParam("entregaEscritura") String entregaEscritura,
			@RequestParam("revision") String revision,
			@RequestParam("apendice") String apendice,
			@RequestParam("revisada") String revisada,
			@RequestParam("fechaFirma") String fechaFirma,
			@RequestParam("fechaInstrumento") String fechaInstrumento,
			@RequestParam("fid") String fid,
			@RequestParam("observaciones") String observaciones
			
			
			){
				
	    Expediente expedienteDao = new Expediente();
	    expedienteDao.setExpediente(expediente);
	    expedienteDao.setFecha(fechaApertura);
	    expedienteDao.setNss(nss);
	    expedienteDao.setCredito(credito);
	    expedienteDao.setOperacion(operacion);
	    expedienteDao.setOtorgante(otorgante);
	    expedienteDao.setResponsable(responsable);
	    expedienteDao.setSecretaria(secretaria);
	    expedienteDao.setRecomendante(recomendante);
	    expedienteDao.setAntilavado(antilavado);
	    expedienteDao.setVulnerable(vulnerable);
	    expedienteDao.setNopaso(nopaso);
	    expedienteDao.setTipoExpediente(tipoExpediente);
	    expedienteDao.setMunicipio(municipio);
	    expedienteDao.setActividad(actividad);
	    expedienteDao.setEstatus(estatus);
	    expedienteDao.setInstrumento(instrumento);
	    expedienteDao.setVolumen(volumen);
	    expedienteDao.setFolioInicial(folioInicial);
	    expedienteDao.setFolioFinal(folioFinal);
	    expedienteDao.setFechaElaboracion(Util.dateConvert(fechaElaboracion));
	    expedienteDao.setEntregaEscritura(Util.dateConvert(entregaEscritura));
	    expedienteDao.setRevision(Util.dateConvert(revision));
	    expedienteDao.setApendice(Util.dateConvert(apendice));
	    expedienteDao.setRevisada(Util.dateConvert(revisada));
	    expedienteDao.setFechaFirma(Util.dateConvert(fechaFirma));
	    expedienteDao.setFechaInstrumento(Util.dateConvert(fechaInstrumento));
	    expedienteDao.setFid(fid);
	    expedienteDao.setObservaciones(observaciones);
		
		int save = expedienteService.saveExpedient(expedienteDao);
		 
	    String view = "fallido";
	    if(save==1) {
	    	view="exitoso";
	    }
	   
	    System.out.println("Resultado: "+view);
		
		return save;
	}
	
	
	@PostMapping("/search")
	@ResponseBody 
	public List<Expediente> searchExpedient(@RequestParam("expediente") String expediente
//			@RequestParam("fechaApertura") String fechaApertura,
//			@RequestParam("nss") String nss,
//			@RequestParam("otorgante") String otorgante
			
			){
				
	    Expediente expedienteDao = new Expediente();
	    expedienteDao.setExpediente(expediente);
//	    expedienteDao.setFecha(fechaApertura);
//	    expedienteDao.setNss(nss);
//	    expedienteDao.setOtorgante(otorgante);
	    
	    List<Expediente> expedienteDaoResponse = expedienteService.searchExpedient(expedienteDao);
		
		return expedienteDaoResponse;
	}
	
	@PostMapping("/rewrite")
	@ResponseBody 
	public int rewriteExpedient(@RequestParam("expediente") String expediente,
			@RequestParam("credito") String credito) {
		
		  Expediente expedienteDao = new Expediente();
		    expedienteDao.setExpediente(expediente);
		    expedienteDao.setCredito(credito);
		    
		    int save = expedienteService.rewriteExpedient(expedienteDao);
			 
		
		return save;
	}
	
}
