package com.niit.shoppingcart.model;
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
public class Categories {
	@Id
	private String id;
	@Column(name="name")
	private String name;
	@OneToMany(mappedBy="category",fetch= FetchType.EAGER)
	private Set<Product> products;
	@Column(name="description")
	private String description;
	public String getById() {
		return id;
	}
	public void setById(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
