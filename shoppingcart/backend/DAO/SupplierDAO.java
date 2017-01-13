package com.niit.shoppingcart.DAO;

import java.util.List;

import com.niit.shoppingcart.model.Supplier;

public interface SupplierDAO {
	public List<Supplier> list();
	public Supplier getByID(String SupplierID);
	public Supplier getByName(String SupplierName);
	public boolean saveOrUpdate(Supplier supplier);
	public boolean deleteByID (String SupplierID);
	

}
