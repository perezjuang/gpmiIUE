package com.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.jdbc.Sql;

import com.app.entity.State;
import com.app.entity.States;

@Sql({ "classpath:schema.sql", "classpath:data.sql" })
@SpringBootTest(classes = DemoIueJopApplication.class, webEnvironment = WebEnvironment.RANDOM_PORT)
public class StateControllerIntegrationTest {

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;

	
	@Test
	//@Sql({"/import_senior_states.sql"})
	public void testAllState() 
	{
		List<State> states = this.restTemplate
		.getForObject("http://localhost:" + port + "/api/stateCustomAPI/stategetall", States.class)
		.getStateList();
				
		assertTrue(states.size() >= 1);
	}

	@Test
	public void testAddState() 
	{
		State state = new State((long)1,"Activo", "Act");	

		ResponseEntity<State> responseEntity = this.restTemplate
			.postForEntity("http://localhost:" + port + "/api/stateCustomAPI/addstate", state, State.class);

		assertEquals(responseEntity.getStatusCode().toString(), "200 OK");
		assertEquals(state.getStateName(), responseEntity.getBody().getStateName());
	}
	
	/*
	 
	 ResponseEntity<String> entity = template.getForEntity("http://example.com", String.class);
	 String body = entity.getBody();
	 MediaType contentType = entity.getHeaders().getContentType();
	 HttpStatus statusCode = entity.getStatusCode();
	 
	 https://crunchify.com/json-manipulation-in-java-examples/
	 https://www.geeksforgeeks.org/working-with-json-data-in-java/
	 https://www.tutorialspoint.com/json/json_java_example.htm
	 */
	
	
	
}
