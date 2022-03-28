package com.example.rest_service;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	
	private static final String template = "%s";
	private final AtomicLong counter = new AtomicLong();
	
	@GetMapping("/search")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "") String name) throws Exception{
		Dictionary text= new Dictionary();
		String response = text.getInfo(String.format(template, name).trim());

		return new Greeting(counter.incrementAndGet(), response);
		
	}
}
