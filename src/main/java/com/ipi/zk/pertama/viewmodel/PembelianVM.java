package com.ipi.zk.pertama.viewmodel;

import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zkplus.spring.DelegatingVariableResolver;
import org.zkoss.zul.ListModelList;

import com.ipi.zk.pertama.bean.Pembelian;
import com.ipi.zk.pertama.bean.PembelianDtl;

/** @author Saifi Ahmada Jul 13, 2013 3:01:26 PM  **/
@VariableResolver(DelegatingVariableResolver.class)
public class PembelianVM {
	
	private Pembelian hdr;
	private PembelianDtl dtl;
	
	private ListModelList<PembelianDtl> listModelDtl;
	
	private ListModelList<PembelianDtl> listChecked = new ListModelList<PembelianDtl>();

	public ListModelList<PembelianDtl> getListChecked() {
		return listChecked;
	}
	public void setListChecked(ListModelList<PembelianDtl> listChecked) {
		this.listChecked = listChecked;
	}
	public ListModelList<PembelianDtl> getListModelDtl() {
		if (listModelDtl == null) listModelDtl = new ListModelList<PembelianDtl>();
		return listModelDtl;
	}
	public void setListModelDtl(ListModelList<PembelianDtl> listModelDtl) {
		this.listModelDtl = listModelDtl;
	}
	public Pembelian getHdr() {
		if (hdr == null) hdr = new Pembelian();
		return hdr;
	}
	public void setHdr(Pembelian hdr) {
		this.hdr = hdr;
	}
	public PembelianDtl getDtl() {
		if (dtl == null) dtl = new PembelianDtl();
		return dtl;
	}
	public void setDtl(PembelianDtl dtl) {
		this.dtl = dtl;
	}
	
	@NotifyChange({"listModelDtl", "dtl"})
	@Command
	public void addDetail(){
		//listModelDtl = new ListModelList<PembelianDtl>();
		listModelDtl.add(dtl);
		dtl = null;
	}
	@NotifyChange({"listModelDtl", "dtl"})
	@Command
	public void deleteDetail(){
		listModelDtl.removeAll(listChecked);
		dtl = null;
	}
	@Command
	public void save(){
		System.out.println("save diklik");
		System.out.println("Id "+ hdr.getPembelianId());
		System.out.println("Tgl "+ hdr.getTgl());
		System.out.println("Barang ID "+ dtl.getPembelianDtlPK().getBarangId());
		System.out.println("Qty "+ dtl.getQty());
	}
	@Command
	public void reset(){
		
	}
	@Command
	public void search(){
		
	}
	
	
	@Command
	public void cek(@BindingParam("checked") boolean isPicked, @BindingParam("picked") PembelianDtl pilih){
		
			if (isPicked){
				
				listChecked.add(pilih);
				
			}else {
				listChecked.remove(pilih);
			}
		
	}
	
	

}

