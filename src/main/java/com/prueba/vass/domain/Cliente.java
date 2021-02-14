package com.prueba.vass.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_cliente", schema = "public")
public class Cliente implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "id")
	private Long id;
	@Column(columnDefinition = "codigo_cliente")
	private String codigoCliente;
	@Column(columnDefinition = "nombres")
	private String nombres;
	@Column(columnDefinition = "primer_apellido")
	private String primerApellido;
	@Column(columnDefinition = "segundo_apellido")
	private String segundoApellido;
	@Column(columnDefinition = "tipo_documento")
	private String tipoDocumento;
	@Column(columnDefinition = "numero_documento")
	private String numeroDocumento;
	@Column(columnDefinition = "fecha_nacimiento")
	private Date fechaNacimiento;
	@Column(columnDefinition = "usuario_creacion")
	private String usuarioCreacion;
	@Column(columnDefinition = "fecha_creacion")
	private Date fechaCreacion;
	@Column(columnDefinition = "usuario_modificacion")
	private String usuarioModificacion;
	@Column(columnDefinition = "fecha_modificacion")
	private Date fechaModificacion;
	@Column(columnDefinition = "il_estado")
	private Boolean ilEstado;

	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cliente(Long id, String codigoCliente, String nombres, String primerApellido, String segundoApellido,
			String tipoDocumento, String numeroDocumento, Date fechaNacimiento, String usuarioCreacion,
			Date fechaCreacion, String usuarioModificacion, Date fechaModificacion, Boolean ilEstado) {
		this.id = id;
		this.codigoCliente = codigoCliente;
		this.nombres = nombres;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = numeroDocumento;
		this.fechaNacimiento = fechaNacimiento;
		this.usuarioCreacion = usuarioCreacion;
		this.fechaCreacion = fechaCreacion;
		this.usuarioModificacion = usuarioModificacion;
		this.fechaModificacion = fechaModificacion;
		this.ilEstado = ilEstado;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(String codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getUsuarioCreacion() {
		return usuarioCreacion;
	}

	public void setUsuarioCreacion(String usuarioCreacion) {
		this.usuarioCreacion = usuarioCreacion;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getUsuarioModificacion() {
		return usuarioModificacion;
	}

	public void setUsuarioModificacion(String usuarioModificacion) {
		this.usuarioModificacion = usuarioModificacion;
	}

	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public Boolean getIlEstado() {
		return ilEstado;
	}

	public void setIlEstado(Boolean ilEstado) {
		this.ilEstado = ilEstado;
	}

}
