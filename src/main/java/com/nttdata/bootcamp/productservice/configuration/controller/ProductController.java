package com.nttdata.bootcamp.productservice.configuration.controller;

import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bootcamp.productservice.configuration.service.ProductServiceImp;
import com.nttdata.bootcamp.productservice.dto.Product;

@RestController
@RequestMapping("/")
public class ProductController {
	
	@GetMapping("/{id}")
	public Product getProduct(@PathVariable Integer id) {
		
		ProductServiceImp product = new ProductServiceImp();
		Product result = product.getProduct(id);
		
		// Respuesta.
		System.out.println(result.getProductId());

		return result;
	}
	
	
	@PostMapping("/{id}")
	public Product postProduct(@PathVariable Integer id) {
		
		ProductServiceImp product = new ProductServiceImp();
		Product result = product.postProduct(id);
		
		// Respuesta.
		System.out.println(result.getProductId());

		return result;
	}


}
