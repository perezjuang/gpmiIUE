package com.app;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@CrossOrigin(origins = "*")

public class GreetingController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name",
											defaultValue = "World") String name) {
		Greeting saludo = new Greeting(counter.incrementAndGet(),
								String.format(template, name));
		return saludo;
	}
	@GetMapping(path="/greetingSleep", produces = "application/json")
	public Greeting greetingSleep(@RequestParam(value = "name",	defaultValue = "World") String name) {
		try {
			TimeUnit.SECONDS.sleep(20);
			return new Greeting(counter.incrementAndGet(),String.format(template, name));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
