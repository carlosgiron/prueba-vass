package com.prueba.vass.trasnsactional.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.prueba.vass.domain.Cliente;
import com.prueba.vass.repository.ClienteRepository;
import com.prueba.vass.transactional.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	ClienteRepository clienteRepository;

	@Override
	public List<Cliente> listCliente() throws Exception {
		// TODO Auto-generated method stub
		return clienteRepository.listaCliente();
	}

	@Override
	public Cliente listaPorCodigo(String codigoCliente) throws Exception {
		return clienteRepository.listaPorCodigo(codigoCliente);
	}

	@Override
	public Cliente saveCliente(Cliente cliente) throws Exception {
		return clienteRepository.save(cliente);
	}
}
