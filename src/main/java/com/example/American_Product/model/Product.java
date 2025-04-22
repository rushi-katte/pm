package com.example.American_Product.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
	@Id
	private Long id;
	private String productName;
	private String category;
	private double quntity;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(Long id, String productName, String category, double quntity) {
		super();
		this.id = id;
		this.productName = productName;
		this.category = category;
		this.quntity = quntity;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getQuntity() {
		return quntity;
	}

	public void setQuntity(double quntity) {
		this.quntity = quntity;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", category=" + category + ", quntity=" + quntity
				+ "]";
	}
}
