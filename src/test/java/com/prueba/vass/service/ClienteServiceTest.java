package com.prueba.vass.service;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.prueba.vass.domain.Cliente;
import com.prueba.vass.transactional.service.ClienteService;

@SpringBootTest
public class ClienteServiceTest {
	@Autowired(required = true)
	private ClienteService clienteService;

	public boolean validarList(List<Cliente> lista) {
		boolean estado = false;

		try {

			if (lista.size() >= 0) {
				estado = true;
			}

		} catch (Exception e) {
			estado = false;
		}
		return estado;
	}

	@Test
	public void listaCliente() throws Exception {

		List<Cliente> cliente = new ArrayList<Cliente>();
		cliente = clienteService.listCliente();
		System.out.println(clienteService.listCliente().size());
		for (Cliente cli : cliente) {
			System.out.println("CLIENTE: " + cli.getCodigoCliente());
		}
		boolean estado = validarList(cliente);
		assertTrue(estado);
	}

	@Test
	public void listaPorId() throws Exception {

		String codigoCliente = "CL000000001";

		Cliente cliente = clienteService.listaPorCodigo(codigoCliente);
		System.out.println(cliente.getNombres());
		System.out.println(cliente.getId());

		boolean estado = false;
		if ("CL000000001" == cliente.getCodigoCliente()) {
			estado = true;
		}

		assertTrue(estado);
	}
}
