package com.ipi.zk.pertama.dao;

import java.util.List;

import com.ipi.zk.pertama.bean.User;

/** @author Saifi Ahmada Jul 13, 2013 9:48:41 AM  **/

public interface UserDao {
	
	public void save(User user);
	public void update(User user);
	public void delete(User user);
	public int count();
	public List<User> getAll();

}

