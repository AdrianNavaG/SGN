package com.sssolutions.sgn.repository;

import java.util.List;

import com.sssolutions.sgn.dao.Expediente;

public interface IExpedienteRepository {

	public int saveExpedient(Expediente expediente);
	
	public List<Expediente> searchExpedient(Expediente expediente);
	
	public int rewriteExpedient(Expediente expediente);
}
