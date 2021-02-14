package com.prueba.vass.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.prueba.vass.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

	@Query(value = "select * from tb_cliente", nativeQuery = true)
	public List<Cliente> listaCliente();

	@Query(value = "select * from tb_cliente where codigo_cliente=:codigoCliente", nativeQuery = true)
	public Cliente listaPorCodigo(@Param("codigoCliente") String codigoCliente);
}
