package com.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.jdbc.Sql;

import com.app.entity.Employee;
import com.app.entity.Employees;

@Sql({ "classpath:schema.sql", "classpath:data.sql" })
@SpringBootTest(classes = DemoIueJgpApplication.class, webEnvironment = WebEnvironment.RANDOM_PORT)
public class EmployeeControllerIntegrationTests 
{
	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;

	
	@Test
	//@Sql({"/import_senior_employees.sql"})
	public void testAllEmployees() 
	{
		assertTrue(
				this.restTemplate
					.getForObject("http://localhost:" + port + "/api/employeeCustomAPI/employeegetall", Employees.class)
					.getEmployeeList().size() >= 1);
	}

	@Test
	public void testAddEmployee() 
	{
		Employee employee = new Employee((long)12,"Lokesh", "Gupta", "abc@gmail.com");	

		ResponseEntity<Employee> responseEntity = this.restTemplate
			.postForEntity("http://localhost:" + port + "/api/employeeCustomAPI/addnewemployee", employee, Employee.class);

		assertEquals(responseEntity.getStatusCode().toString(), "200 OK");
		assertEquals(employee.getFirstName(), responseEntity.getBody().getFirstName());
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
