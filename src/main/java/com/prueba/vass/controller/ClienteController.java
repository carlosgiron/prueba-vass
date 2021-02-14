package com.prueba.vass.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.prueba.vass.domain.Cliente;
import com.prueba.vass.transactional.service.ClienteService;

@RestController
@RequestMapping("/v1")
public class ClienteController {
	@Autowired(required = true)
	private ClienteService clienteService;

	@GetMapping("/cliente")
	public ResponseEntity<List<Cliente>> listaCliente() {
		try {
			List<Cliente> cliente = new ArrayList<Cliente>();
			cliente = clienteService.listCliente();
			return new ResponseEntity<>(cliente, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.print(e.getMessage());
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/cliente/{codigoCliente}")
	public ResponseEntity<Cliente> listaPorCodigo(@PathVariable(value = "codigoCliente") String codigoCliente) {
		try {

			Cliente cliente = clienteService.listaPorCodigo(codigoCliente);
			return new ResponseEntity<>(cliente, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PostMapping("/cliente")
	public ResponseEntity<Cliente> saveCliente(@RequestBody Cliente cliente) {
		try {
			Cliente _cliente = clienteService.saveCliente(cliente);
			return new ResponseEntity<>(_cliente, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

}
