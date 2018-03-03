package com.sssolutions.sgn.repository;


import java.util.List;

import com.sssolutions.sgn.dao.Cliente;
import com.sssolutions.sgn.dao.Expediente;

public interface IClienteRepository {
	
	public int saveClient(Cliente cliente);
	
	public List<Cliente> searchClient(Cliente cliente);
	
}
