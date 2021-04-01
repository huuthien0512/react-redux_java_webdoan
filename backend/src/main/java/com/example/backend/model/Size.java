package com.example.backend.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Size")
public class Size {
	private String name;
	private int stock;
	
	public Size() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Size(String name, int stock) {
		super();
		this.name = name;
		this.stock = stock;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
}
