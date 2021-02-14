package com.prueba.vass.transactional.service;

import java.util.List;

 

import com.prueba.vass.domain.Cliente;

public interface ClienteService  {

	public List<Cliente> listCliente() throws Exception;

	public Cliente listaPorCodigo(String codigoCliente) throws Exception;
	
	public Cliente saveCliente(Cliente cliente) throws Exception;

}
