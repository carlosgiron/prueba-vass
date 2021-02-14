package com.prueba.vass.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.prueba.vass.transactional.service.ClienteService;

@RunWith(SpringRunner.class)
@WebMvcTest(ClienteController.class)
public class ClienteControllerTest {
	private static final Logger logger = LoggerFactory.getLogger(ClienteControllerTest.class);

	@Autowired
	private MockMvc mvc;

	@MockBean
	ClienteService clienteService;

	@Test
	public void getCliente() throws Exception {

		Mockito.when(clienteService.listCliente()).thenReturn(null);

		logger.info("response: ");

	}

	@Test
	public void listaPorId() throws Exception {
		String codigoCliente = "CL000000001";

		Mockito.when(clienteService.listaPorCodigo(codigoCliente)).thenReturn(null);

		String response = mvc.perform(get("/v1/cliente/{id}", codigoCliente)).andExpect(status().is(HttpStatus.OK.value()))
				.andReturn().getResponse()
				.getContentAsString();
 
		logger.info("response: " + response.intern());
	}
}
