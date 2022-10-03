package com.nttdata.bootcamp.productservice.configuration.service;

import com.nttdata.bootcamp.productservice.dto.Product;

public class ProductServiceImp implements ProductServiceI {

	@Override
	public Product getProduct(Integer id) {
		Product product = new Product();
		product.setProductId(id);
		product.setChannel("GET");
		return product;
	}
	
	@Override
	public Product postProduct(Integer id) {
		Product product = new Product();
		product.setProductId(id);
		product.setChannel("POST");
		return product;
	}

}
