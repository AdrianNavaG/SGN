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
		
		
		String sql = "insert into expedientes (expediente,fecha_apertura,nss,credito,otorgante,operacion,responsable,secretaria,recomendante,antilavado,vulnerable,nopaso,tipo_expediente,municipio,actividad,estatus,instrumento,volumen,folio_inicial,folio_final,fecha_elaboracion,entrega_escritura,revision,apendice,revisada,fecha_firma,fecha_instrumento,fid,observaciones)"+
			    	 " values (CONCAT('EXP-',expediente_seq.NextVal),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
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
			    		expediente.getVulnerable(),
			    		expediente.getNopaso(),
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
			    	    expediente.getFechaInstrumento(),
			    	    expediente.getFid(),
			    	    expediente.getObservaciones()
			    		}
			);
	
		return save;
	}

	@Override
	public List<Expediente> searchExpedient(Expediente expediente) {
	
		String sql = "SELECT " + 
				"EXPEDIENTE, " + 
				"FECHA_APERTURA, " + 
				"nss, " + 
				"otorgante " + 
				"FROM EXPEDIENTES WHERE NSS = '"+ expediente.getExpediente()+"'";
		System.out.println("Query: "+sql);
		
		List<Expediente> result = jdbcTemplate.query(
				sql,
			(rs, rowNum) -> new Expediente(rs.getString("EXPEDIENTE"), rs.getString("FECHA_APERTURA"), rs.getString("nss"),rs.getString("OTORGANTE")));
		
	for (Expediente user : result) {
		System.out.println(user.getExpediente());
		System.out.println(user.getFecha());
		System.out.println(user.getNss());
		System.out.println(user.getOtorgante());
	}
		
//		List<Expediente> listExpedientes = (List<Expediente>) jdbcTemplate.queryForList(
//				"SELECT ID_EXPEDIENTE     , " + 
//				"EXPEDIENTE        , " + 
//				"FECHA_APERTURA    , " + 
//				"NSS               , " + 
//				"CREDITO           , " + 
//				"OTORGANTE         , " + 
//				"OPERACION         , " + 
//				"RESPONSABLE       , " + 
//				"SECRETARIA        , " + 
//				"RECOMENDANTE      , " + 
//				"TIPO_EXPEDIENTE   , " + 
//				"MUNICIPIO         , " + 
//				"ACTIVIDAD         , " + 
//				"ESTATUS           , " + 
//				"ANTILAVADO        , " + 
//				"INSTRUMENTO       , " + 
//				"VOLUMEN           , " + 
//				"FOLIO_INICIAL     , " + 
//				"FOLIO_FINAL       , " + 
//				"FECHA_ELABORACION , " + 
//				"ENTREGA_ESCRITURA , " + 
//				"REVISION          , " + 
//				"APENDICE          , " + 
//				"REVISADA          , " + 
//				"FECHA_FIRMA       , " + 
//				"FECHA_INSTRUMENTO , " + 
//				"VULNERABLE        , " + 
//				"NOPASO            , " + 
//				"FID               , " + 
//				"OBSERVACIONES" + 
//				" FROM EXPEDIENTES WHERE EXPEDIENTE = '"+ expediente.getExpediente()+"'"
//				, Expediente.class);
//		System.out.println(expediente.getExpediente());
		
		return result;
	}

}
