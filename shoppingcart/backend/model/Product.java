package com.niit.shoppingcart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class Product {
	@Id
private String productID;
	@Column(name="productname")
private String productname;
	@ManyToOne
	@JoinColumn(name="productCategory_ID",updatable=false, insertable=false , nullable=false )
	private Categories category;
private String productCategory_ID;
	@Column(name="productPrice")
private double productPrice;
	@Column(name="productStatus")
private int productStatus;
	@ManyToOne
	@JoinColumn(name="productSupplier_ID" ,updatable=false, insertable=false , nullable=false)
	private Supplier supplier;
private String productSupplier_ID;
public String getProductID() {
	return productID;
}
public void setProductID(String productID) {
	this.productID = productID;
}
public String getProductname() {
	return productname;
}
public void setProductname(String productname) {
	this.productname = productname;
}
public String getProductCategory_ID() {
	return productCategory_ID;
}
public void setProductCategory_ID(String productCategory_ID) {
	this.productCategory_ID = productCategory_ID;
}
public double getProductPrice() {
	return productPrice;
}
public void setProductPrice(double productPrice) {
	this.productPrice = productPrice;
}
public int getProductStatus() {
	return productStatus;
}
public void setProductStatus(int productStatus) {
	this.productStatus = productStatus;
}
public String getProductSupplier_ID() {
	return productSupplier_ID;
}
public void setProductSupplier_ID(String productSupplier_ID) {
	this.productSupplier_ID = productSupplier_ID;
}


}
