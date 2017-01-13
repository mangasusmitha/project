package com.niit.shoppingcart.DAOimpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.DAO.CategoriesDAO;
import com.niit.shoppingcart.model.Categories;
import com.niit.shoppingcart.model.User;
@Repository("categoryDAO")
public class CategoriesDAOImpl implements CategoriesDAO{
	
@Autowired
private SessionFactory sessionfactory;
public CategoriesDAOImpl(SessionFactory sessionfactory){
	System.out.println("in constructor of categoryimpl");
	this.sessionfactory=sessionfactory;
}
@Transactional
	
	public boolean save(Categories category) {
		// TODO Auto-generated method stub
		sessionfactory.getCurrentSession().saveOrUpdate(category);
		return true;
	}
@Transactional
	public boolean update(Categories category) {
		// TODO Auto-generated method stub
		try{
		sessionfactory.getCurrentSession().saveOrUpdate(category);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		return false;
		}
		return true;
	}
@Transactional
	public boolean delete(Categories category) {
		// TODO Auto-generated method stub
		try{
		sessionfactory.getCurrentSession().delete(category);
		}
		catch(HibernateException e){
			e.printStackTrace();
			return false;
		}
		return true;
	}
@Transactional
	public Categories getByID(String id) {
		// TODO Auto-generated method stub
		String hql="from Categories where id='"+id+"'";
		Query query=sessionfactory.getCurrentSession().createQuery(hql);
		List<Categories> li= query.list();
		return (Categories) li;
	}
@Transactional
	public List<Categories> list() {
		// TODO Auto-generated method stub
		String hql="from Categories";
		Query query=sessionfactory.getCurrentSession().createQuery(hql);
		List<Categories> li= query.list();
		return li;
	}

}
