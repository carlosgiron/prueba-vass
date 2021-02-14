package com.prueba.vass;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
 
@SpringBootTest(properties = "spring.datasource.type=com.zaxxer.hikari.HikariDataSource")
public class HikariIntegrationTest {
	@Autowired
	private DataSource dataSource;
	
	@Test
	public void hikariConnectionPoolIsConfigured() {
		assertEquals("com.zaxxer.hikari.HikariDataSource", dataSource.getClass().getName());
	}
}
