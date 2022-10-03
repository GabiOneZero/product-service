package com.nttdata.bootcamp.productservice.configuration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;

import com.nttdata.bootcamp.productservice.dto.Product;

@Service
public class ProductServiceImp implements ProductServiceI {
	
	
	@Autowired
	Environment environment;

	@Override
	public Product getProduct(Integer id) {
		Product product = new Product();
		product.setProductId(id);
		product.setChannel("GET");
		//product.setPort(Integer.parseInt(port));
		product.setPort(environment.getProperty("local.server.port"));
		return product;
	}
	
	@Override
	public Product postProduct(Integer id) {
		Product product = new Product();
		product.setProductId(id);
		product.setChannel("POST");
		//product.setPort(Integer.parseInt(port));
		product.setPort(environment.getProperty("local.server.port"));
		return product;
	}

}
