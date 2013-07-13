package com.ipi.zk.pertama.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ipi.zk.pertama.bean.User;

/** @author Saifi Ahmada Jul 13, 2013 9:48:30 AM  **/
@Repository
public class UserDaoImpl implements UserDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public void save(User user) {
		// TODO , masbro
		sessionFactory.getCurrentSession().save(user);
		
	}
	@Transactional
	public void update(User user) {
		// TODO , masbro
		sessionFactory.getCurrentSession().update(user);
		
	}
	@Transactional
	public void delete(User user) {
		// TODO , masbro
		sessionFactory.getCurrentSession().delete(user);
		
	}
	@Transactional(readOnly=true)
	public int count() {
		// TODO , masbro
		return sessionFactory.getCurrentSession().createQuery("select u from User u").list().size();
	}
	@SuppressWarnings("unchecked")
	@Transactional(readOnly=true)
	public List<User> getAll() {
		return sessionFactory.getCurrentSession().createQuery("select u from User u").list();
	}

}

