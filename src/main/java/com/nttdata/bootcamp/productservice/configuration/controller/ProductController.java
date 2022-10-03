package com.nttdata.bootcamp.productservice.configuration.controller;

import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import com.nttdata.bootcamp.productservice.configuration.service.ProductServiceI;
import com.nttdata.bootcamp.productservice.configuration.service.ProductServiceImp;
import com.nttdata.bootcamp.productservice.dto.Product;

@RestController
@RequestMapping("/")
public class ProductController {
	
	@Autowired
	private ProductServiceI productService;
	
	
	@GetMapping("/{id}")
	public ResponseEntity<Product> getProduct(final @PathVariable int id){
		return ResponseEntity.ok(productService.getProduct(id));
	}
	
	@PostMapping("/{id}")
	public ResponseEntity<Product> postProduct(final @PathVariable int id){
		return ResponseEntity.ok(productService.postProduct(id));
	}


}
