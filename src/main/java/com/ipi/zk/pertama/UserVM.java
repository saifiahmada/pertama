package com.ipi.zk.pertama;

import org.zkoss.bind.annotation.Init;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.WireVariable;

import com.ipi.zk.pertama.service.UserService;

/** @author Saifi Ahmada Jul 13, 2013 10:46:31 AM  **/
@VariableResolver(org.zkoss.zkplus.spring.DelegatingVariableResolver.class)
public class UserVM {
	
	@WireVariable
	private UserService userService;
	
	private int jumlah;
	
	public void setJumlah(int jumlah) {
		this.jumlah = jumlah;
	}

	public int getJumlah(){
		jumlah = userService.count();
		return jumlah;
	}

}

