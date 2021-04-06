package com.example.backend.model;

public class OrderItems {
	private String name;
	private int quantity;
	private String image[];
	private float price;
	
	public OrderItems() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderItems(String name, int quantity, String[] image, float price) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.image = image;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String[] getImage() {
		return image;
	}
	public void setImage(String[] image) {
		this.image = image;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
}
