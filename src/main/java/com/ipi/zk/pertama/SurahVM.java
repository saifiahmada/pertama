package com.ipi.zk.pertama;

import java.util.List;

import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.WireVariable;
import org.zkoss.zul.ListModelList;
import org.zkoss.zul.Messagebox;

import com.ipi.zk.pertama.bean.Surah;
import com.ipi.zk.pertama.service.SurahService;

/** @author Saifi Ahmada Jul 26, 2013 11:01:10 AM  **/
@VariableResolver(org.zkoss.zkplus.spring.DelegatingVariableResolver.class)
public class SurahVM {
	
	@WireVariable
	private SurahService surahService;
	
	private Surah current;
	
	private ListModelList<Surah> listModel;
	
	private boolean focus;
	

	public boolean isFocus() {
		return focus;
	}

	public void setFocus(boolean focus) {
		this.focus = focus;
	}

	public Surah getCurrent() {
		if (current == null) current = new Surah();
		return current;
	}

	public void setCurrent(Surah current) {
		this.current = current;
	}
	
	public ListModelList<Surah> getListModel() {
		if (listModel == null){
			listModel = new ListModelList<Surah>();
		}
		return listModel;
	}

	public void setListModel(ListModelList<Surah> listModel) {
		this.listModel = listModel;
	}
	
	@Init
	public void init(){
		listModel = new ListModelList<Surah>();
		listModel.addAll(surahService.findAll());
		focus = true;
	}

	@NotifyChange({"current","listModel","focus"})
	@Command
	public void save(){
		
		String namaSurah = current.getNamaSurah().toUpperCase();
		current.setNamaSurah(namaSurah);
		surahService.save(current);
		focus = true;
		
		
		reset();
		Messagebox.show("Proses simpan sukses");
		focus = true;
	}
	
	@NotifyChange({"current","listModel","focus"})
	@Command
	public void reset(){
		current = null;
		listModel = new ListModelList<Surah>();
		listModel.addAll(surahService.findAll());
		focus = true;
	}

}

