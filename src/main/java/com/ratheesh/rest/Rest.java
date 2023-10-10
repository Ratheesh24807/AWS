package com.ratheesh.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rest {
	
	// hi
	@GetMapping("/")
	public String greet() {
		
		return "Hi Dimple Good evening, had your coffe";
	}

}
