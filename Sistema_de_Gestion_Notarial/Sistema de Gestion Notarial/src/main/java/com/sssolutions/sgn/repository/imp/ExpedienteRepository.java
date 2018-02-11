package com.sssolutions.sgn.repository.imp;

import java.util.List;

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
		
		
		String sql = "insert into expedientes (expediente,fecha_apertura,nss,credito,otorgante,operacion,responsable,secretaria,recomendante,antilavado,tipo_expediente,municipio,actividad,estatus,instrumento,volumen,folio_inicial,folio_final,fecha_elaboracion,entrega_escritura,revision,apendice,revisada,fecha_firma,fecha_instrumento)"+
			    	 " values (CONCAT('EXP-',expediente_seq.NextVal),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		int save = jdbcTemplate.update(
			    sql,
			    new Object[]{
			    		expediente.getFecha(),
			    		expediente.getNss(),
			    		expediente.getCredito(),
			    		expediente.getOtorgante(),
			    		expediente.getOperacion(),
			    		expediente.getResponsable(),
			    		expediente.getSecretaria(),
			    		expediente.getRecomendante(),
			    		expediente.getAntilavado(),
			    		expediente.getTipoExpediente(),
			    		expediente.getMunicipio(),
			    		expediente.getActividad(),
			    		expediente.getEstatus(),
			    		expediente.getInstrumento(),
			    		expediente.getVolumen(),
			    		expediente.getFolioInicial(),
			    		expediente.getFolioFinal(),
			    	    expediente.getFechaElaboracion(),
			    	    expediente.getEntregaEscritura(),
			    	    expediente.getRevision(),
			    	    expediente.getApendice(),
			    	    expediente.getRevisada(),
			    	    expediente.getFechaFirma(),
			    	    expediente.getFechaInstrumento()
			    		}
			);
	
		return save;
	}


	@Override
	public List<Expediente> searchExpedient(Expediente expediente) {
		
		List<Expediente> listExpedientes = (List<Expediente>) jdbcTemplate.queryForList(
				"SELECT * FROM EXPEDIENTES WHERE FECHA_APERTURA = '"+expediente.getFecha()+"'"
				, Expediente.class);
		
		return listExpedientes;
	}

}
