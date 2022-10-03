package com.nttdata.bootcamp.productservice.configuration.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Product {
	
	@GetMapping("/{id}")
	public String getProduct() {

		// Respuesta.
		final String responseBody = "/";
		System.out.println(responseBody);

		return responseBody;
	}
	
	@PostMapping("/{id}")
	public String postProduct() {

		// Respuesta.
		final String responseBody = "/";
		System.out.println(responseBody);

		return responseBody;
	}


}
