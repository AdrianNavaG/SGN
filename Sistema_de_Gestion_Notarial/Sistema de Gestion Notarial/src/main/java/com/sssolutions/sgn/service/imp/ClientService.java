package com.sssolutions.sgn.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sssolutions.sgn.dao.Cliente;
import com.sssolutions.sgn.dao.Expediente;
import com.sssolutions.sgn.repository.IClienteRepository;
import com.sssolutions.sgn.service.IClientService;

@Service
public class ClientService implements IClientService {

	@Autowired
	IClienteRepository clienteRepository;

	@Override
	public int saveClient(Cliente cliente) {
	
		int save = clienteRepository.saveClient(cliente);
		
		return save;
	}
	
	@Override
	public List<Cliente> searchClient(Cliente cliente) {

		List<Cliente> clienteDaoResponse =  clienteRepository.searchClient(cliente);
		
		return clienteDaoResponse;
	}
	
}
