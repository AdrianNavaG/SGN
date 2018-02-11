package com.sssolutions.sgn.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sssolutions.sgn.dao.Expediente;
import com.sssolutions.sgn.repository.IExpedienteRepository;
import com.sssolutions.sgn.service.IExpedienteService;

@Service
public class ExpedienteService implements IExpedienteService {
	
	@Autowired
	IExpedienteRepository expedienteRepository;

	@Override
	public int saveExpedient(Expediente expediente) {
	
		int save = expedienteRepository.saveExpedient(expediente);
		
		return save;
	}

	@Override
	public List<Expediente> searchExpedient(Expediente expediente) {

		List<Expediente> expedienteDaoResponse =  expedienteRepository.searchExpedient(expediente);
		
		return expedienteDaoResponse;
	}

}
