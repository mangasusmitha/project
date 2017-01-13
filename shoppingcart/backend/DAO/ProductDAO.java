package com.niit.shoppingcart.DAO;

import java.util.List;

import com.niit.shoppingcart.model.Product;

public interface ProductDAO {
	public  List<Product> getProductList();

    public  Product getProductById(String id);

    public List<Product> getSimilarProductList(String productCategory_ID);

   public  void editProduct(Product product);

    public void deleteProduct(Product product);
}
