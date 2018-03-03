package com.sssolutions.sgn.repository.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sssolutions.sgn.dao.Expediente;
import com.sssolutions.sgn.repository.IExpedienteRepository;

//import scala.annotation.meta.setter;

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
				"id_Expediente, " + 
				"EXPEDIENTE, " + 
				"FECHA_APERTURA, " + 
				"nss, " + 
				"CREDITO, " + 
				"otorgante, " + 
				"OPERACION, " + 
				"RESPONSABLE, " + 
				"SECRETARIA, " + 
				"RECOMENDANTE, " + 
				"TIPO_EXPEDIENTE, " + 
				"MUNICIPIO, " + 
				"ACTIVIDAD, " + 
				"ESTATUS, " + 
				"ANTILAVADO, " + 
				"INSTRUMENTO, " + 
				"VOLUMEN, " + 
				"FOLIO_INICIAL, " + 
				"FOLIO_FINAL, " + 
				"FECHA_ELABORACION, " + 
				"ENTREGA_ESCRITURA, " + 
				"REVISION, " + 
				"APENDICE, " + 
				"REVISADA, " + 
				"FECHA_FIRMA, " + 
				"FECHA_INSTRUMENTO, " + 
				"VULNERABLE, " + 
				"NOPASO, " + 
				"FID, " + 
				"OBSERVACIONES " + 
				"FROM EXPEDIENTES WHERE NSS = '"+ expediente.getExpediente()+"'";
		
		List<Expediente> result = jdbcTemplate.query(
				sql,
			(rs, rowNum) -> new Expediente(
					rs.getInt("id_Expediente"), 
					rs.getString("EXPEDIENTE"), 
					rs.getString("FECHA_APERTURA"), 
					rs.getString("nss"),
					rs.getString("CREDITO"),
					rs.getString("OTORGANTE"),
					rs.getString("OPERACION"),
					rs.getString("RESPONSABLE"),
					rs.getString("SECRETARIA"),
					rs.getString("RECOMENDANTE"),
					rs.getString("TIPO_EXPEDIENTE"),
					rs.getString("MUNICIPIO"),
					rs.getString("ACTIVIDAD"),
					rs.getString("ESTATUS"),
					rs.getString("ANTILAVADO"), //14
					rs.getInt("INSTRUMENTO"),
					rs.getInt("VOLUMEN"),
					rs.getInt("FOLIO_INICIAL"),
					rs.getInt("FOLIO_FINAL"),
					rs.getString("FECHA_ELABORACION"),//19
					rs.getString("ENTREGA_ESCRITURA"),
					rs.getString("REVISION"),
					rs.getString("APENDICE"),
					rs.getString("REVISADA"),
					rs.getString("FECHA_FIRMA"),
					rs.getString("FECHA_INSTRUMENTO"),
					rs.getString("VULNERABLE"),//26
					rs.getString("NOPASO"),
					rs.getString("FID"),
					rs.getString("OBSERVACIONES")));
		
//	for (Expediente user : result) {
//		System.out.println(user.getExpediente());
//		System.out.println(user.getFecha());
//		System.out.println(user.getNss());
//		System.out.println(user.getOtorgante());
//	}
		
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
	
	@Override
	public int rewriteExpedient(Expediente expediente) {
//		Connection conn;
//
//        
//		System.out.println("casi se actualizo");
//		int save1=0;
//		System.out.println(expediente.getExpediente());
//		try {
//			PreparedStatement save = conn.prepareStatement("update EXPEDIENTES "+ 
//					"set credito = ? "+
//					"where expediente='"+ expediente.getExpediente()+"'");
//			
//			save.setString(1,expediente.getCredito());
//			
//			save.executeUpdate();
//			 
//			 save.close();
//			 
//			 save1 = 1;
//			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
				
				
//		int save =jdbcTemplate.update("update EXPEDIENTES "+ 
//				" set credito = 'creditoUpdate' "+
//				" where expediente='EXP-138'");
		

//		String sql = "update EXPEDIENTES " +
//				"set credito = ? "+
//				"where expediente='"+ expediente.getExpediente()+"'";
//				
//		int save =jdbcTemplate.update(
//			    sql,
//			    new Object[]{
//			    	expediente.getCredito()
//			    	
//			    }
//			    
//			  );  
		System.out.println("se actualizo");
		int save =1;
		return save;
	}

}
