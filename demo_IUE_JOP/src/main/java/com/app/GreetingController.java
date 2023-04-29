package com.app;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")

public class GreetingController {
	
	private static final String template = "Hello,  %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name",
											defaultValue = "World") String name) {
		Greeting saludo = new Greeting(counter.incrementAndGet(), 
										String.format(template, name) );
		
		return saludo;
	}
			

	
	
}
