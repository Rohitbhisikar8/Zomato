 package com.zomato.request;

public class ZomatoRequest {

	
	private String ItamName;
	private int qty;
	private double price;
	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	

	public String getItamName() {
		return ItamName;
	}

	public void setItamName(String itamName) {
		ItamName = itamName;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}



}
