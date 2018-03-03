package com.sssolutions.sgn.service;

import java.util.List;

import com.sssolutions.sgn.dao.Cliente;
import com.sssolutions.sgn.dao.Expediente;

public interface IClientService {
	
	
	public int saveClient(Cliente cliente);
	
	public List<Cliente> searchClient(Cliente cliente);
	
}
