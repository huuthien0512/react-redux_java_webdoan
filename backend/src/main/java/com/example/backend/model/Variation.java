package com.example.backend.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Variation")
public class Variation {
	private String color;
	private String image;
	private Size[] size;
	
	public Variation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Variation(String color, String image, Size[] size) {
		super();
		this.color = color;
		this.image = image;
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Size[] getSize() {
		return size;
	}

	public void setSize(Size[] size) {
		this.size = size;
	}
	
	
}
