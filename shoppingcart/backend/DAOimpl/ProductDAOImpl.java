package com.niit.shoppingcart.DAOimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.DAO.ProductDAO;
import com.niit.shoppingcart.model.Product;
import com.niit.shoppingcart.model.Supplier;
import com.niit.shoppingcart.model.User;
@Repository("productDAO")
public class ProductDAOImpl implements ProductDAO {
@Autowired
private SessionFactory sessionFactory;

public ProductDAOImpl(SessionFactory sessionFactory) {
	
	try {
		this.sessionFactory = sessionFactory;
		
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	}
@Transactional
	public List<Product> getProductList() {
		// TODO Auto-generated method stub
		String hql="from Product";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		// TODO Auto-generated method stub
		return (List<Product>)query.list();
		
		
	}
@Transactional
	public Product getProductById(String id) {
		// TODO Auto-generated method stub
	String hql="from Product where id='"+id+"'";
	Query query=sessionFactory.getCurrentSession().createQuery(hql);
	return  (Product) query.list();
		
	}
@Transactional
	public List<Product> getSimilarProductList(String productCategory_ID){
		
		String hql="from Product where productCategory_ID='"+productCategory_ID+"'";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		// TODO Auto-generated method stub
		return (List<Product>)query.list();
		
	}
@Transactional
	public void editProduct(Product product) {
		// TODO Auto-generated method stub
		
		sessionFactory.getCurrentSession().saveOrUpdate(product);
	}
@Transactional
	public void deleteProduct(Product product) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(product);
		
	}

}
