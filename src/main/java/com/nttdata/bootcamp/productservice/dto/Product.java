package com.nttdata.bootcamp.productservice.dto;

public class Product {
	
	private Integer productId;
	private String channel;
	private String port;
	
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String string) {
		this.port = string;
	}
	
	

}
