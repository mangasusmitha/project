package com.niit.shoppingcart.DAOimpl;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.DAO.*;
import com.niit.shoppingcart.model.User;
@Repository("userDAO")
public class UserDAOImpl implements UserDAO{

@Autowired
private SessionFactory sessionFactory;
public UserDAOImpl()
{
	
}
public UserDAOImpl(SessionFactory sessionFactory)
{
	System.out.println("in constructor of userdaoimpl");
	
		try {
			this.sessionFactory = sessionFactory;
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
}
@Transactional
public List<User> list() {
	String hql="from User";
	Query query=sessionFactory.getCurrentSession().createQuery(hql);
	// TODO Auto-generated method stub
	return (List<User>)query.list();
	
}
@Transactional
public User getByID(String id) {
	// TODO Auto-generated method stub
	String hql="from User where id='"+id+"'";
	Query query=sessionFactory.getCurrentSession().createQuery(hql);
	return (User) query.list();
	
}
@Transactional
public User validate(String id, String password) {
	// TODO Auto-generated method stub
	String hql="from User where id='"+id+"'and password='"+password+"'";
	Query query=sessionFactory.getCurrentSession().createQuery(hql);
	return (User)query.uniqueResult();
}
@Transactional
public boolean save(User user) {
	sessionFactory.getCurrentSession().saveOrUpdate(user);
	// TODO Auto-generated method stub
	return true;
}
@Transactional
public boolean update(User user) {
	try{
		sessionFactory.getCurrentSession().saveOrUpdate(user);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	return false;
	}
	// TODO Auto-generated method stub
	return true;
}
@Transactional
public void deleteByID(String id)
{
	try{
		User user=new User();
		user.setId(id);
		sessionFactory.getCurrentSession().delete(user);
	}
	catch(HibernateException e){
		e.printStackTrace();
		
	}
}
@Transactional
public User getByName(String name)
{
	
		String hql="from User where name='"+name+"'";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		return (User) query.list();
	
}
}
