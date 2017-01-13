package com.niit.shoppingcart.DAO;

	import java.util.List;

	import org.springframework.stereotype.Repository;

	import com.niit.shoppingcart.model.Categories;

	
	public interface CategoriesDAO {
	public boolean save(Categories category);
	public boolean update(Categories category);
	public boolean delete(Categories category);
	public Categories getByID(String id);
	public List<Categories> list();
	}

