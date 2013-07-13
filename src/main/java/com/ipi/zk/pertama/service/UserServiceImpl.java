package com.ipi.zk.pertama.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

import com.ipi.zk.pertama.bean.User;
import com.ipi.zk.pertama.dao.UserDao;

/** @author Saifi Ahmada Jul 13, 2013 9:54:44 AM  **/
@Service("userService")
@Scope(value="singleton", proxyMode=ScopedProxyMode.TARGET_CLASS)
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	public void save(User user) {
		// TODO , masbro
		userDao.save(user);
		
	}

	public void update(User user) {
		// TODO , masbro
		userDao.update(user);
		
	}

	public void delete(User user) {
		// TODO , masbro
		userDao.delete(user);
		
	}

	public int count() {
		// TODO , masbro
		return userDao.count();
	}

	public List<User> getAll() {
		return userDao.getAll();
	}

}

