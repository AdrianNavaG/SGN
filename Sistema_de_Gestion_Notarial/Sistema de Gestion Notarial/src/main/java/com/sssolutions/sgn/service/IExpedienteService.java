package com.sssolutions.sgn.service;

import java.util.List;

import com.sssolutions.sgn.dao.Expediente;

public interface IExpedienteService {
	
	public int saveExpedient(Expediente expediente);

	public List<Expediente> searchExpedient(Expediente expediente);
}
