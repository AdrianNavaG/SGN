package com.sssolutions.sgn.dao;

import java.util.Date;

public class Expediente {

	private int idExpediente;
	private String expediente;
	private String fecha;
	private String nss;
	private String credito;
	private String otorgante;
	private String operacion;
	private String responsable;
	private String secretaria;
	private String recomendante;
	private String tipoExpediente;
	private String municipio;
	private String actividad;
	private String estatus;
	private String antilavado;
	private int instrumento;
	private int volumen;
	private int folioInicial;
	private int folioFinal;
	private String fechaElaboracion;
	private String entregaEscritura;
	private String revision;
	private String apendice;
	private String revisada;
	private String fechaFirma;
	private String fechaInstrumento;
	private String vulnerable;
	private String nopaso;
	private String fid;
	private String observaciones;
	
	

	public Expediente(int idExpediente, String expediente, String fecha, String nss, String credito, String otorgante,
			String operacion, String responsable, String secretaria, String recomendante, String tipoExpediente,
			String municipio, String actividad, String estatus, String antilavado, int instrumento, int volumen,
			int folioInicial, int folioFinal, String fechaElaboracion, String entregaEscritura, String revision,
			String apendice, String revisada, String fechaFirma, String fechaInstrumento, String vulnerable,
			String nopaso, String fid, String observaciones) {
		super();
		this.idExpediente = idExpediente;
		this.expediente = expediente;
		this.fecha = fecha;
		this.nss = nss;
		this.credito = credito;
		this.otorgante = otorgante;
		this.operacion = operacion;
		this.responsable = responsable;
		this.secretaria = secretaria;
		this.recomendante = recomendante;
		this.tipoExpediente = tipoExpediente;//10
		this.municipio = municipio;
		this.actividad = actividad; //12
		this.estatus = estatus;
		this.antilavado = antilavado;//14
		this.instrumento = instrumento;
		this.volumen = volumen;
		this.folioInicial = folioInicial;
		this.folioFinal = folioFinal;
		this.fechaElaboracion = fechaElaboracion;
		this.entregaEscritura = entregaEscritura;
		this.revision = revision;
		this.apendice = apendice;
		this.revisada = revisada;
		this.fechaFirma = fechaFirma;
		this.fechaInstrumento = fechaInstrumento;
		this.vulnerable = vulnerable;
		this.nopaso = nopaso;
		this.fid = fid;
		this.observaciones = observaciones;
	}
	public Expediente() {

	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getActividad() {
		return actividad;
	}
	public void setActividad(String actividad) {
		this.actividad = actividad;
	}
	public String getEstatus() {
		return estatus;
	}
	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}
	public int getIdExpediente() {
		return idExpediente;
	}
	public void setIdExpediente(int idExpediente) {
		this.idExpediente = idExpediente;
	}
	public String getExpediente() {
		return expediente;
	}
	public void setExpediente(String expediente) {
		this.expediente = expediente;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getNss() {
		return nss;
	}
	public void setNss(String nss) {
		this.nss = nss;
	}
	public String getCredito() {
		return credito;
	}
	public void setCredito(String credito) {
		this.credito = credito;
	}
	public String getOtorgante() {
		return otorgante;
	}
	public void setOtorgante(String otorgante) {
		this.otorgante = otorgante;
	}
	public String getOperacion() {
		return operacion;
	}
	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}
	public String getResponsable() {
		return responsable;
	}
	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}
	public String getSecretaria() {
		return secretaria;
	}
	public void setSecretaria(String secretaria) {
		this.secretaria = secretaria;
	}
	public String getRecomendante() {
		return recomendante;
	}
	public void setRecomendante(String recomendante) {
		this.recomendante = recomendante;
	}
	public String getAntilavado() {
		return antilavado;
	}
	public void setAntilavado(String antilavado) {
		this.antilavado = antilavado;
	}
	
	public String getVulnerable() {
		return vulnerable;
	}
	public void setVulnerable(String vulnerable) {
		this.vulnerable = vulnerable;
	}
	public String getNopaso() {
		return nopaso;
	}
	public void setNopaso(String nopaso) {
		this.nopaso = nopaso;
	}
	public String getTipoExpediente() {
		return tipoExpediente;
	}
	public void setTipoExpediente(String tipoExpediente) {
		this.tipoExpediente = tipoExpediente;
	}
	public int getInstrumento() {
		return instrumento;
	}
	public void setInstrumento(int instrumento) {
		this.instrumento = instrumento;
	}
	public int getVolumen() {
		return volumen;
	}
	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}
	public int getFolioInicial() {
		return folioInicial;
	}
	public void setFolioInicial(int folioInicial) {
		this.folioInicial = folioInicial;
	}
	public int getFolioFinal() {
		return folioFinal;
	}
	public void setFolioFinal(int folioFinal) {
		this.folioFinal = folioFinal;
	}
	public String getFechaElaboracion() {
		return fechaElaboracion;
	}
	public void setFechaElaboracion(String fechaElaboracion) {
		this.fechaElaboracion = fechaElaboracion;
	}
	public String getEntregaEscritura() {
		return entregaEscritura;
	}
	public void setEntregaEscritura(String entregaEscritura) {
		this.entregaEscritura = entregaEscritura;
	}
	public String getRevision() {
		return revision;
	}
	public void setRevision(String revision) {
		this.revision = revision;
	}
	public String getApendice() {
		return apendice;
	}
	public void setApendice(String apendice) {
		this.apendice = apendice;
	}
	public String getRevisada() {
		return revisada;
	}
	public void setRevisada(String revisada) {
		this.revisada = revisada;
	}
	public String getFechaFirma() {
		return fechaFirma;
	}
	public void setFechaFirma(String fechaFirma) {
		this.fechaFirma = fechaFirma;
	}
	public String getFechaInstrumento() {
		return fechaInstrumento;
	}
	public void setFechaInstrumento(String fechaInstrumento) {
		this.fechaInstrumento = fechaInstrumento;
	}
	public String getFid() {
		return fid;
	}
	public void setFid(String fid) {
		this.fid = fid;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	
}
