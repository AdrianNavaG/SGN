package com.sssolutions.sgn.dao;

public class Cliente {

	private int idCliente;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String nombre;
	private String fechaAlta;
	private String fechaNacimiento;
	private int edad;
	private String sexo;
	private String curp;
	private String rfc;
	private String municipioNacimiento;
	private String estadoNacimiento;
	private String ciudadNacimiento;
	private String paisNacimiento;
	private String docIdentificacion;
	private String noDocIdentificacion;
	private String tipoPasaporte;
	private String noFormaMigratoria;
	private String tipoFormaMigratoria;
	private String nombrePadre;
	private String nombreMadre;
	private String nacionalidadPadres;
	private String numeroIne;
	private String noPasaporteVigente;
	private String calle;
	private String numero;
	private int cp;
	private String lote;
	private String manzana;
	private String predio;
	private String colonia;
	private String municipio;
	private String estado;
	private String ciudad;
	private String pais;
	private String nacionalidad;
	private String profesionOcupacion;
	private String estadoCivil;
	private String telOficina;
	private String telParticular;
	private String email;
	private String paginaWeb;
	private String conyuge;
	private String regConyugal;
	private String tipoPersona;
	private String poblacion;
	private String entidad;
	private String nombreCompleto;
	
	public Cliente() {
		
	}
public Cliente (int idCliente, String apellidoPaterno, String apellidoMaterno, String nombre,String fechaAlta,String rfc,String nombreCompleto) {
	this.idCliente = idCliente;
	this.apellidoPaterno = apellidoPaterno;
	this.apellidoMaterno = apellidoMaterno;
	this.nombre = nombre;
	this.fechaAlta=fechaAlta;
	this.rfc = rfc;
	this.nombreCompleto = nombreCompleto;
}

public Cliente(int idCliente, String apellidoPaterno, String apellidoMaterno, String nombre, String fechaAlta,
			String fechaNacimiento, int edad, String sexo, String curp, String rfc, String municipioNacimiento,
			String estadoNacimiento, String ciudadNacimiento, String paisNacimiento, String docIdentificacion,
			String noDocIdentificacion, String tipoPasaporte, String noFormaMigratoria, String tipoFormaMigratoria,
			String nombrePadre, String nombreMadre, String nacionalidadPadres, String numeroIne,
			String noPasaporteVigente, String calle, String numero, int cp, String lote, String manzana, String predio,
			String colonia, String municipio, String estado, String ciudad, String pais, String nacionalidad,
			String profesionOcupacion, String estadoCivil, String telOficina, String telParticular, String email,
			String paginaWeb, String conyuge, String regConyugal, String tipoPersona, String poblacion, String entidad,
			String nombreCompleto) {
		super();
		this.idCliente = idCliente;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.nombre = nombre;
		this.fechaAlta = fechaAlta;
		this.fechaNacimiento = fechaNacimiento;
		this.edad = edad;
		this.sexo = sexo;
		this.curp = curp;
		this.rfc = rfc;
		this.municipioNacimiento = municipioNacimiento;
		this.estadoNacimiento = estadoNacimiento;
		this.ciudadNacimiento = ciudadNacimiento;
		this.paisNacimiento = paisNacimiento;
		this.docIdentificacion = docIdentificacion;
		this.noDocIdentificacion = noDocIdentificacion;
		this.tipoPasaporte = tipoPasaporte;
		this.noFormaMigratoria = noFormaMigratoria;
		this.tipoFormaMigratoria = tipoFormaMigratoria;
		this.nombrePadre = nombrePadre;
		this.nombreMadre = nombreMadre;
		this.nacionalidadPadres = nacionalidadPadres;
		this.numeroIne = numeroIne;
		this.noPasaporteVigente = noPasaporteVigente;
		this.calle = calle;
		this.numero = numero;
		this.cp = cp;
		this.lote = lote;
		this.manzana = manzana;
		this.predio = predio;
		this.colonia = colonia;
		this.municipio = municipio;
		this.estado = estado;
		this.ciudad = ciudad;
		this.pais = pais;
		this.nacionalidad = nacionalidad;
		this.profesionOcupacion = profesionOcupacion;
		this.estadoCivil = estadoCivil;
		this.telOficina = telOficina;
		this.telParticular = telParticular;
		this.email = email;
		this.paginaWeb = paginaWeb;
		this.conyuge = conyuge;
		this.regConyugal = regConyugal;
		this.tipoPersona = tipoPersona;
		this.poblacion = poblacion;
		this.entidad = entidad;
		this.nombreCompleto = nombreCompleto;
	}


	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(String fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getCurp() {
		return curp;
	}
	public void setCurp(String curp) {
		this.curp = curp;
	}
	public String getRfc() {
		return rfc;
	}
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}
	public String getMunicipioNacimiento() {
		return municipioNacimiento;
	}
	public void setMunicipioNacimiento(String municipioNacimiento) {
		this.municipioNacimiento = municipioNacimiento;
	}
	public String getEstadoNacimiento() {
		return estadoNacimiento;
	}
	public void setEstadoNacimiento(String estadoNacimiento) {
		this.estadoNacimiento = estadoNacimiento;
	}
	public String getCiudadNacimiento() {
		return ciudadNacimiento;
	}
	public void setCiudadNacimiento(String ciudadNacimiento) {
		this.ciudadNacimiento = ciudadNacimiento;
	}
	public String getPaisNacimiento() {
		return paisNacimiento;
	}
	public void setPaisNacimiento(String paisNacimiento) {
		this.paisNacimiento = paisNacimiento;
	}
	public String getDocIdentificacion() {
		return docIdentificacion;
	}
	public void setDocIdentificacion(String docIdentificacion) {
		this.docIdentificacion = docIdentificacion;
	}
	public String getNoDocIdentificacion() {
		return noDocIdentificacion;
	}
	public void setNoDocIdentificacion(String noDocIdentificacion) {
		this.noDocIdentificacion = noDocIdentificacion;
	}
	public String getTipoPasaporte() {
		return tipoPasaporte;
	}
	public void setTipoPasaporte(String tipoPasaporte) {
		this.tipoPasaporte = tipoPasaporte;
	}
	public String getNoFormaMigratoria() {
		return noFormaMigratoria;
	}
	public void setNoFormaMigratoria(String noFormaMigratoria) {
		this.noFormaMigratoria = noFormaMigratoria;
	}
	public String getTipoFormaMigratoria() {
		return tipoFormaMigratoria;
	}
	public void setTipoFormaMigratoria(String tipoFormaMigratoria) {
		this.tipoFormaMigratoria = tipoFormaMigratoria;
	}
	public String getNombrePadre() {
		return nombrePadre;
	}
	public void setNombrePadre(String nombrePadre) {
		this.nombrePadre = nombrePadre;
	}
	public String getNombreMadre() {
		return nombreMadre;
	}
	public void setNombreMadre(String nombreMadre) {
		this.nombreMadre = nombreMadre;
	}
	public String getNacionalidadPadres() {
		return nacionalidadPadres;
	}
	public void setNacionalidadPadres(String nacionalidadPadres) {
		this.nacionalidadPadres = nacionalidadPadres;
	}
	public String getNumeroIne() {
		return numeroIne;
	}
	public void setNumeroIne(String numeroIne) {
		this.numeroIne = numeroIne;
	}
	public String getNoPasaporteVigente() {
		return noPasaporteVigente;
	}
	public void setNoPasaporteVigente(String noPasaporteVigente) {
		this.noPasaporteVigente = noPasaporteVigente;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public int getCp() {
		return cp;
	}
	public void setCp(int cp) {
		this.cp = cp;
	}
	public String getLote() {
		return lote;
	}
	public void setLote(String lote) {
		this.lote = lote;
	}
	public String getManzana() {
		return manzana;
	}
	public void setManzana(String manzana) {
		this.manzana = manzana;
	}
	public String getPredio() {
		return predio;
	}
	public void setPredio(String predio) {
		this.predio = predio;
	}
	public String getColonia() {
		return colonia;
	}
	public void setColonia(String colonia) {
		this.colonia = colonia;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public String getProfesionOcupacion() {
		return profesionOcupacion;
	}
	public void setProfesionOcupacion(String profesionOcupacion) {
		this.profesionOcupacion = profesionOcupacion;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public String getTelOficina() {
		return telOficina;
	}
	public void setTelOficina(String telOficina) {
		this.telOficina = telOficina;
	}
	public String getTelParticular() {
		return telParticular;
	}
	public void setTelParticular(String telParticular) {
		this.telParticular = telParticular;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPaginaWeb() {
		return paginaWeb;
	}
	public void setPaginaWeb(String paginaWeb) {
		this.paginaWeb = paginaWeb;
	}
	public String getConyuge() {
		return conyuge;
	}
	public void setConyuge(String conyuge) {
		this.conyuge = conyuge;
	}
	public String getRegConyugal() {
		return regConyugal;
	}
	public void setRegConyugal(String regConyugal) {
		this.regConyugal = regConyugal;
	}
	public String getTipoPersona() {
		return tipoPersona;
	}
	public void setTipoPersona(String tipoPersona) {
		this.tipoPersona = tipoPersona;
	}
	public String getPoblacion() {
		return poblacion;
	}
	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}
	public String getEntidad() {
		return entidad;
	}
	public void setEntidad(String entidad) {
		this.entidad = entidad;
	}
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	
	
}
