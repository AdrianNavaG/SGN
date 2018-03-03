package com.sssolutions.sgn.reports;

import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;
import java.util.Map;

//import rponte.report.ConnectionFactory;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.export.JRPdfExporter;

public class GenerateReport {

	public static void main(String[] args) {

		Connection connection = null;
		try {
			String sDriver = "oracle.jdbc.OracleDriver";
			Class.forName(sDriver).newInstance();  
			String reportName = "myreport";
			Map<String, Object> parameters = new HashMap<String, Object>();
			parameters.put("variable", "Este es el valor de un parametro enviado desde JAVA ");
						
			//			connection = new ConnectionFactory().getConnection(); // opens a jdbc connection
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr", "oracle1");
			
			// compiles jrxml
			JasperCompileManager.compileReportToFile("C:\\Users\\PC\\Documents\\GitHub\\SGN\\Sistema_de_Gestion_Notarial\\Sistema de Gestion Notarial\\src\\main\\java\\com\\sssolutions\\sgn\\reports\\"+reportName + ".jrxml");
			// fills compiled report with parameters and a connection
			JasperPrint print = JasperFillManager.fillReport("C:\\Users\\PC\\Documents\\GitHub\\SGN\\Sistema_de_Gestion_Notarial\\Sistema de Gestion Notarial\\src\\main\\java\\com\\sssolutions\\sgn\\reports\\HelloWorldReport.jasper", parameters, connection);
			// exports report to pdf
			JRExporter exporter = new JRPdfExporter();
			exporter.setParameter(JRExporterParameter.JASPER_PRINT, print);
			exporter.setParameter(JRExporterParameter.OUTPUT_STREAM, new FileOutputStream("C:\\Users\\PC\\Documents\\GitHub\\SGN\\Sistema_de_Gestion_Notarial\\Sistema de Gestion Notarial\\src\\main\\java\\com\\sssolutions\\sgn\\reports\\"+reportName + ".pdf")); // your output goes here

			exporter.exportReport();

		} catch (Exception e) {
			throw new RuntimeException("It's not possible to generate the pdf report.", e);
		} finally {
			// it's your responsibility to close the connection, don't forget it!
			if (connection != null) {
				try { connection.close(); } catch (Exception e) {}
			}
		}

	}

}
