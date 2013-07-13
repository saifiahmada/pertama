package com.ipi.zk.pertama;

import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.lang.Strings;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.WireVariable;
import org.zkoss.zul.ListModelList;

import com.ipi.zk.pertama.bean.User;
import com.ipi.zk.pertama.service.UserService;

/** @author Saifi Ahmada Jul 13, 2013 11:55:25 AM  **/
@VariableResolver(org.zkoss.zkplus.spring.DelegatingVariableResolver.class)
public class CrudUserVM {
	
	@WireVariable
	private UserService userService;

	private User current;
	
	private ListModelList<User> listModel = new ListModelList<User>();
	
	public ListModelList<User> getListModel() {
		return listModel;
	}

	public void setListModel(ListModelList<User> listModel) {
		this.listModel = listModel;
	}

	public User getCurrent() {
		if (current == null)
			current = new User();
		return current;
	}

	public void setCurrent(User current) {
		this.current = current;
	}
	
	@Init
	public void init(){
		listModel = new ListModelList<User>();
		listModel.addAll(userService.getAll());
	}
	
	@NotifyChange({"current","listModel"})
	@Command
	public void save(){
		 
		if (current.getUserId() > 0){
			userService.update(current);
		} else {
			userService.save(current);
		}
		
		reset();
	}
	@NotifyChange({"current","listModel"})
	@Command
	public void update(){
		userService.update(current);
		reset();
	}
	@NotifyChange({"current","listModel"})
	@Command
	public void reset(){
		current = null;
		listModel = new ListModelList<User>();
		listModel.addAll(userService.getAll());
	}
	@Command
	public void search(){
		System.out.println("Search Butoon");
	}
	
}

