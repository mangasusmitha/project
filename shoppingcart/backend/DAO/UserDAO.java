package com.niit.shoppingcart.DAO;


import java.util.List;

import com.niit.shoppingcart.model.User;


public interface UserDAO {
	public List<User> list();
	public User getByID(String id);
	public User getByName(String name);
	public void deleteByID(String id);
	public User validate(String id,String password);
	public boolean save(User user);
	public boolean update(User user);

	

}
