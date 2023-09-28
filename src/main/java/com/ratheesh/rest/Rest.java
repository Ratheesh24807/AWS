package com.ratheesh.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rest {
	
	
	@GetMapping("/")
	public String greet() {
		
		return "Hi Dimple Good Morning, Happy Eid-Milad and Happy weekend";
	}

}
