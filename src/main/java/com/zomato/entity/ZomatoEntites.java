package com.zomato.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "zomato_table")
public class ZomatoEntites {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int iteamID;
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

	public int getIteamID() {
		return iteamID;
	}

	public void setIteamID(int iteamID) {
		this.iteamID = iteamID;
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
