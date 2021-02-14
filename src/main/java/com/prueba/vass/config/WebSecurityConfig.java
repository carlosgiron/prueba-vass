package com.prueba.vass.config;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;

import com.prueba.vass.config.filter.APIKeyAuthFilter;

@Configuration
@EnableWebSecurity
@Order(1)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

	@Value("#{ environment['siv.cors.origins'] }")
	private String origins;

	@Value("#{ environment['siv.cors.headers'] }")
	private String headers;

	@Value("#{ environment['siv.cors.methods'] }")
	private String methods;

	@Value("#{ environment['siv.auth.token.header'] }")
	private String requestHeader;

	@Value("#{ environment['siv.auth.token.value'] }")
	private String requestValue;

	@Override
	protected void configure(HttpSecurity httpSecurity) throws Exception {
		LOGGER.info("Entro a WebSecurityConfig#configure(http)");

		APIKeyAuthFilter filter = new APIKeyAuthFilter(requestHeader);
		filter.setAuthenticationManager(new AuthenticationManager() {

			@Override
			public Authentication authenticate(Authentication authentication) throws AuthenticationException {
				String principal = (String) authentication.getPrincipal();
				if (!requestValue.equals(principal)) {
					throw new BadCredentialsException("The API key was not found or not the expected value.");
				}
				authentication.setAuthenticated(true);
				return authentication;
			}
		});

		httpSecurity.antMatcher("/v1/**").csrf().disable().sessionManagement()
				.sessionCreationPolicy(SessionCreationPolicy.STATELESS).and().addFilter(filter).authorizeRequests()
				.anyRequest().authenticated();

		httpSecurity.cors().configurationSource(new CorsConfigurationSource() {
			@Override
			public CorsConfiguration getCorsConfiguration(HttpServletRequest request) {
				CorsConfiguration config = new CorsConfiguration();
				config.setAllowCredentials(true);
				config.setAllowedOrigins(Arrays.asList(origins.split(",")));
				config.setAllowedHeaders(Arrays.asList(headers.split(",")));
				config.setAllowedMethods(Arrays.asList(methods.split(",")));
				return config;
			}
		});

		// -- Desactivar el filtro de Cross-site request forgery (CSRF). Porque CORS se
		// ha activado
		httpSecurity.csrf().disable();
		LOGGER.info("Salio a WebSecurityConfig#configure(http)");
	}
}
