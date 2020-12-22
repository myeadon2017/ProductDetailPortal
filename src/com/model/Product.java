package com.model;

//This class will be used as a model for the product
public class Product {
	
	private String prodName;
	private String details;
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public Product(String prodName, String details) {
		super();
		this.prodName = prodName;
		this.details = details;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
