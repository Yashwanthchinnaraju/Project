package com.niit.EComBack.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;
import javax.validation.constraints.Min;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;

@Entity
public class Product {


	@Transient
	MultipartFile pimage;

	public MultipartFile getPimage() {
		return pimage;
	}

	public void setPimage(MultipartFile pimage) {
		this.pimage = pimage;
	}

	@Column(nullable=false, unique = true)
	@NotEmpty(message="Product Description is mandatory")
	private String procuctName;
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int productId;
	
	@Column(nullable=false)
	@NotEmpty(message="Product Description is mandatory")
	private String productDesc;
	
	@Min(value=100, message="price must be greater than 100")
	private float price;
	
	@Min(value=3, message="price must be greater than 2")
	private int quantity;
	
	@ManyToOne
	@OnDelete(action= OnDeleteAction.CASCADE)
	private Category category;

	public String getProcuctName() {
		return procuctName;
	}

	public void setProcuctName(String procuctName) {
		this.procuctName = procuctName;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
	
}
