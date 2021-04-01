package com.example.backend.model;

import java.sql.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Document(collection = "Blog")
public class Blog {
	@Id
	private String id;
	private String image;
	private String category[];
	private String title;
	private String url;
	private String author;
	private String authorUrl;
	private String description;
	
	public Blog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Blog(String image, String[] category, String title, String url, String author, String authorUrl, String description) {
		super();
		this.image = image;
		this.category = category;
		this.title = title;
		this.url = url;
		this.author = author;
		this.authorUrl = authorUrl;
		this.description = description;
	}

	public String getId() {
		return id;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String[] getCategory() {
		return category;
	}

	public void setCategory(String[] category) {
		this.category = category;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getAuthorUrl() {
		return authorUrl;
	}

	public void setAuthorUrl(String authorUrl) {
		this.authorUrl = authorUrl;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
