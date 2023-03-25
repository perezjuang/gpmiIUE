package com.app;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.fasterxml.jackson.databind.ObjectMapper;


@RestController
@CrossOrigin(origins = "*")
public class GreetingController {
	
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
	
	@GetMapping(path="/greetingOK", produces = "application/json")
	public ResponseEntity<String> customHeader(@RequestParam(value = "name", defaultValue = "World") String name) {
	    
		HttpHeaders headers = new HttpHeaders();
	    headers.add("Custom-Header", "foo");
	    
	    Greeting greeting = new Greeting(counter.incrementAndGet(), String.format(template, name));
	    ObjectMapper mapper = new ObjectMapper();
	    String jsonString = "";
	    
		try {
			jsonString = mapper.writeValueAsString(greeting);
			TimeUnit.SECONDS.sleep(10);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	    //return new ResponseEntity<>("Custom header set", headers, HttpStatus.OK);
	    return ResponseEntity.ok()
	            .header("Custom-Header", "foo")
	            .body(jsonString);

	}
		
	@RequestMapping("/start")
	@ResponseBody
	public String welcome(){
		return " Bienvenido a la IUE ";
	}
	
	
	
}
