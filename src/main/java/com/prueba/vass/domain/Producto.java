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
@Table(name = "tb_producto", schema = "public")
public class Producto implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "id")
	private Long id;
	@Column(columnDefinition = "codigo_producto")
	private String codigoProducto;
	@Column(columnDefinition = "nombre")
	private String nombre;
	@Column(columnDefinition = "descripcion")
	private String descripcion;
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
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCodigoProducto() {
		return codigoProducto;
	}
	public void setCodigoProducto(String codigoProducto) {
		this.codigoProducto = codigoProducto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
