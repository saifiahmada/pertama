package com.ipi.zk.pertama.service;

import com.ipi.zk.pertama.bean.User;

/** @author Saifi Ahmada Jul 13, 2013 9:54:22 AM  **/

public interface UserService {
	
	public void save(User user);
	public void update(User user);
	public void delete(User user);
	public int count();
}

