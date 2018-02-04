package com.sssolutions.sgn.repository.imp;

import java.sql.Types;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sssolutions.sgn.dao.Expediente;
import com.sssolutions.sgn.repository.IExpedienteRepository;

@Repository
public class ExpedienteRepository implements IExpedienteRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public int saveExpedient(Expediente expediente) {
		
		String sql = "insert into expedientes (id_expediente,expediente,fecha_apertura,nss,credito,otorgante,operacion,responsable) values (expediente_seq.NextVal,CONCAT('EXP-',expediente_seq.NextVal),?,?,?,?,?,?)";
		
		int save = jdbcTemplate.update(
			    sql,
			    new Object[]{
			    		expediente.getFecha(),
			    		expediente.getNss(),
			    		expediente.getCredito(),
			    		expediente.getOtorgante(),
			    		expediente.getOperacion(),
			    		expediente.getResponsable()
			    		}
			);
		return save;
	}

}
