
create table tb_cliente(
	id serial primary key not null,
	codigo_cliente char(11) not null,
	nombres varchar(100),
	primer_apellido varchar(100),
	segundo_apellido varchar(100),
	tipo_documento char(2),
	numero_documento varchar(10),
	fecha_nacimiento date,
	usuario_creacion varchar(20),
	fecha_creacion timestamp without time zone,
	usuario_modificacion varchar(20),
	fecha_modificacion timestamp,
	il_estado boolean
);
create table tb_producto(
	id serial primary key not null,
	codigo_producto char(5) not null,
	nombre varchar(100),
	descripcion varchar(200),
	usuario_creacion varchar(20),
	fecha_creacion timestamp without time zone,
	usuario_modificacion varchar(20),
	fecha_modificacion timestamp,
	il_estado boolean
);
CREATE TABLE tb_producto_cliente(
	id serial primary key not null,
	codigo_producto char(5) not null,
	codigo_cliente char(11) not null,
	tecnologia varchar(100),
	usuario_creacion varchar(20),
	fecha_creacion timestamp without time zone,
	usuario_modificacion varchar(20),
	fecha_modificacion timestamp,
	il_estado boolean
);

CREATE TABLE tb_reclamo(
	id serial primary key not null,
	codigo_reclamo char(5) not null,
	codigo_producto char(5) not null,
	codigo_cliente char(11) not null,
	motivo varchar(100),
	descripcion varchar(200),
	usuario_creacion varchar(20),
	fecha_creacion timestamp without time zone,
	usuario_modificacion varchar(20),
	fecha_modificacion timestamp,
	il_estado boolean
);
-------------------------------------------------

 select * from tb_cliente;

