package com.niit.shoppingcart.DAOimpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.DAO.SupplierDAO;
import com.niit.shoppingcart.model.Supplier;
@Repository("supplierDAO")
public class SuppliersDAOImpl implements SupplierDAO{
	
@Autowired
private SessionFactory sessionFactory;
	public SuppliersDAOImpl(SessionFactory sessionFactory) {
		
		try {
			this.sessionFactory = sessionFactory;
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}}
	@Transactional
	public List<Supplier> list() {
		// TODO Auto-generated method stub
		String hql="from Product";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		
		return (List<Supplier>)query.list();
	}
	@Transactional
	public Supplier getByID(String supplierID) {
		// TODO Auto-generated method stub
		String hql="from Supplier where supplierID='"+supplierID+"'";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		return (Supplier) query.list();
		
	
	}
	@Transactional
	public Supplier getByName(String supplierName) {
		// TODO Auto-generated method stub
		String hql="from Supplier where suppliername='"+supplierName+"'";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		return (Supplier) query.list();
		
	}
	@Transactional
	@Override
	public boolean saveOrUpdate(Supplier supplier) {
		// TODO Auto-generated method stub
		try{
			sessionFactory.getCurrentSession().saveOrUpdate(supplier);
		return true;
		}
		catch(Exception e){
			e.printStackTrace();
			return false;
		}
		
	}
	@Transactional
	@Override
	public boolean deleteByID(String supplierID) {
		// TODO Auto-generated method stub
		try{
			Supplier supplier=new Supplier();
			supplier.setSupplierID(supplierID);
			sessionFactory.getCurrentSession().delete(supplier);
			
		return true;
	}
catch(HibernateException e){
	e.printStackTrace();
	return false;
}
}
	
}
