package com.nttdata.bootcamp.productservice.configuration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;

import com.nttdata.bootcamp.productservice.dto.Product;

@RequestScope
@Service
public class ProductServiceImp implements ProductServiceI {
	
	
	@Value("${server.port}")
	private int port;

	@Override
	public Product getProduct(Integer id) {
		Product product = new Product();
		product.setProductId(id);
		product.setChannel("GET");
		product.setPort(port);
		return product;
	}
	
	@Override
	public Product postProduct(Integer id) {
		Product product = new Product();
		product.setProductId(id);
		product.setChannel("POST");
		product.setPort(port);
		return product;
	}

}
