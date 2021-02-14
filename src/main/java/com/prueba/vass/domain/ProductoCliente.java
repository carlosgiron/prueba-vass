package com.prueba.vass.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_producto_cliente", schema = "public")
public class ProductoCliente {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "id")
	private Long id;
	@Column(columnDefinition = "codigo_producto")
	private String codigoProducto;
	@Column(columnDefinition = "codigo_cliente")
	private String codigoCliente;
	@Column(columnDefinition = "tecnologia")
	private String tecnologia;
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
	
	
	
}
