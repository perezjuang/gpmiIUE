package com.app;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultMatcher;

@SpringBootTest
@AutoConfigureMockMvc
class DemoIueJgpApplicationTests {

	@Autowired
	private MockMvc mockMvc;
	// (Escenario)
	// (Given) some context
	// (When) some action is carried out
	// (Then) a particular set of observable consequences should obtain

	/*
	 * Un ejemplo: Retiro de un Cajero Dado que mi cuenta bancaria tiene crédito y
	 * no hice retiros recientemente, Cuando intento retirar una cantidad menor que
	 * el límite de mi tarjeta, Entonces el retiro debe completarse sin errores ni
	 * advertencias. // JBehave, RSpec o Cucumber
	 * https://openwebinars.net/blog/que-es-gherkin/
	 */
			
	// Escenario 1: Realizo el llamado a la URL me saluda con mi nombre
	// GIVEN: Dado que el servicio puede ser llamado desde una URL enviando mi
	// nombre
	// WHEN: Cuando invoco la URL
	// THEN: El servicio responde el Saludo con mi nombre: Hello, Juan!
	/***
	 * 
	 * Test 1
	 */
	@Test
	public void test1NoParamGreetingShouldReturnDefaultMessage() throws Exception {
		RequestBuilder requestt = get("/greeting");		
		ResultMatcher requestExpeted = jsonPath("$.content").value("Hello, World!");
		this.mockMvc.perform(requestt).andDo(print()).andExpect(status().isOk())
				.andExpect(requestExpeted );
	}
	/***
	 * 
	 * Test 2
	 */
	@Test
	public void test2ParamGreetingShouldReturnTailoredMessage() throws Exception {
		RequestBuilder request = get("/greeting").param("name", "IUE");		
		ResultMatcher requestExpected = jsonPath("$.content").value("Hello, IUE!");
		this.mockMvc.perform(request)
				.andDo(print()).andExpect(status().isOk())
				.andExpect(requestExpected);
	}
	/***
	 * 
	 * Test 3 - Segurity
	 */
	/*@Test
	public void test3Security() throws Exception {
		String URL = "http://localhost:" + port + "/greeting?name=Juan!";

		// WHEN: Cuando invoco la URL
		//String restRequest = restTemplate.getForObject(URL, Greeting.class).getContent();
		String restRequest = restTemplate.withBasicAuth("admin","123456789").getForObject(URL, Greeting.class).getContent();
		
		// THEN: El servicio responde el Saludo con mi nombre: Hello, Juan!
		assertTrue(restRequest.equals("Hello, Juan!!"));
	}*/
	

}
