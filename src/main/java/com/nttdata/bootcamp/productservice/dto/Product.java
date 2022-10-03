package com.nttdata.bootcamp.productservice.dto;

public class Product {
	
	private Integer productId;
	private String channel;
	private Integer port;
	
	
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
	public Integer getPort() {
		return port;
	}
	public void setPort(Integer integer) {
		this.port = integer;
	}
	
	

}
