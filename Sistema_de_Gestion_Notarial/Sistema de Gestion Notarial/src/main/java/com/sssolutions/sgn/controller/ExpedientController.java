package com.sssolutions.sgn.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sssolutions.sgn.dao.Expediente;
import com.sssolutions.sgn.service.IExpedienteService;

@Controller
@RequestMapping("/expediente")
public class ExpedientController {
	
	@Autowired
	IExpedienteService expedienteService;

	
	@PostMapping("/save")
	public ModelAndView saveExpedient(@RequestParam("expediente") String expediente,
			@RequestParam("fechaApertura") String fechaApertura,
			@RequestParam("nss") String nss,
			@RequestParam("credito") String credito,
			@RequestParam("otorgante") String otorgante,
			@RequestParam("operacion") String operacion,
			@RequestParam("responsable") String responsable
			){
				
	    Expediente expedienteDao = new Expediente();
	    expedienteDao.setExpediente(expediente);
	    expedienteDao.setFecha(fechaApertura);
	    expedienteDao.setNss(nss);
	    expedienteDao.setCredito(credito);
	    expedienteDao.setOperacion(operacion);
	    expedienteDao.setOtorgante(otorgante);
	    expedienteDao.setResponsable(responsable);
	    
	    int save = expedienteService.saveExpedient(expedienteDao);
	    
	    
	    String view = "fallido";
	    if(save==1) {
	    	view="exitoso";
	    }
		
	    System.out.println("Resultado: "+view);
	    
	    ModelAndView mav = new ModelAndView();
		
		return mav;
	}
	
}
