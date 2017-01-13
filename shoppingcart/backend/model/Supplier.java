
package com.niit.shoppingcart.model;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class Supplier{
	@Id
private String supplierID;
	@Column(name="supplierName")
private String supplierName;
	@Column(name="supplierDescription")
private String supplierDescription;
	@OneToMany(mappedBy="supplier",fetch= FetchType.EAGER)
	private Set<Product> products;

public String getSupplierID() {
	return supplierID;
}

public void setSupplierID(String supplierID) {
	this.supplierID = supplierID;
}

public String getSupplierName() {
	return supplierName;
}

public void setSupplierName(String supplierName) {
	this.supplierName = supplierName;
}

public String getSupplierDescription() {
	return supplierDescription;
}

public void setSupplierDescription(String supplierDescription) {
	this.supplierDescription = supplierDescription;
}



}
